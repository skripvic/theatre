package ru.nsu.skripnikova.theatre.repository.repertoire;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.nsu.skripnikova.theatre.entity.people.Employees;
import ru.nsu.skripnikova.theatre.entity.repertoire.Stagings;

import java.util.List;

@Repository
public interface StagingsRepository extends JpaRepository<Stagings, Integer> {

    Stagings getStagingsByStagingId (Integer stagingId);

    @Query(value = "SELECT * FROM stagings", nativeQuery = true)
    List<Stagings> getAllStagings();

    @Query(value = "SELECT SEQUENCE_STAGINGS.nextval FROM dual", nativeQuery = true)
    Integer getNextStagingsId();
}

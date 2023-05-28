package ru.nsu.skripnikova.theatre.repository.repertoire;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.nsu.skripnikova.theatre.entity.repertoire.Castings;

@Repository
public interface CastingsRepository extends JpaRepository<Castings, Integer> {

    Castings getCastingsByCastingId (Integer castingId);

    @Query(value = "SELECT SEQUENCE_CASTINGS.nextval FROM dual", nativeQuery = true)
    Integer getNextCastingId();
}

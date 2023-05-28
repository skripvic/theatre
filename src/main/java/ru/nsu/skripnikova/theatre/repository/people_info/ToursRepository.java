package ru.nsu.skripnikova.theatre.repository.people_info;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.nsu.skripnikova.theatre.entity.people_info.Tours;

@Repository
public interface ToursRepository extends JpaRepository<Tours, Integer> {

    Tours getToursByTourId (Integer tourId);

    @Query(value = "SELECT SEQUENCE_TOURS.nextval FROM dual", nativeQuery = true)
    Integer getNextToursId();
}

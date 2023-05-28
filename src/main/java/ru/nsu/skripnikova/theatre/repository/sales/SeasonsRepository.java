package ru.nsu.skripnikova.theatre.repository.sales;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.nsu.skripnikova.theatre.entity.sales.Seasons;

@Repository
public interface SeasonsRepository extends JpaRepository<Seasons, Integer> {

    Seasons getSeasonsBySeasonId (Integer seasonId);

    @Query(value = "SELECT SEQUENCE_SEASONS.nextval FROM dual", nativeQuery = true)
    Integer getNextSeasonsId();
}

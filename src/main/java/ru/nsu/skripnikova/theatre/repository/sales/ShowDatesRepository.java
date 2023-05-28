package ru.nsu.skripnikova.theatre.repository.sales;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.nsu.skripnikova.theatre.entity.sales.ShowDates;

@Repository
public interface ShowDatesRepository extends JpaRepository<ShowDates, Integer> {

    ShowDates getShowDatesByShowDateId (Integer showDateId);

    @Query(value = "SELECT SEQUENCE_SHOW_DATES.nextval FROM dual", nativeQuery = true)
    Integer getNextShowDatesId();
}

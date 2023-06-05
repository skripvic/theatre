package ru.nsu.skripnikova.theatre.repository.sales;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.nsu.skripnikova.theatre.controller.requests.ShowDatePlayRequest;
import ru.nsu.skripnikova.theatre.entity.sales.ShowDates;

import java.util.List;

@Repository
public interface ShowDatesRepository extends JpaRepository<ShowDates, Integer> {

    ShowDates getShowDatesByShowDateId (Integer showDateId);

    @Query(value = "SELECT SEQUENCE_SHOW_DATES.nextval FROM dual", nativeQuery = true)
    Integer getNextShowDatesId();


    @Query(value = "SELECT * \n" +
            "FROM show_dates sd " +
            "JOIN stagings s ON s.staging_id = sd.staging_id \n" +
            "JOIN plays p ON p.play_id = s.play_id \n" +
            "ORDER BY sd.show_date", nativeQuery = true)
    List<ShowDates> getShowDates();
}

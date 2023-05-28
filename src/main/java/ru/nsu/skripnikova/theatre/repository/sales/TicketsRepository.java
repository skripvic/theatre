package ru.nsu.skripnikova.theatre.repository.sales;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.nsu.skripnikova.theatre.entity.sales.Tickets;

import java.util.List;

@Repository
public interface TicketsRepository extends JpaRepository<Tickets, Integer> {

    Tickets getTicketsByTicketId (Integer ticketId);

    @Query(value = "SELECT SEQUENCE_TICKETS.nextval FROM dual", nativeQuery = true)
    Integer getNextTicketsId();

    @Query(value = "SELECT *\n" +
            "    FROM tickets t\n" +
            "    JOIN show_dates sd ON sd.show_date_id = t.show_date_id\n" +
            "    JOIN stagings s ON s.staging_id = sd.staging_id\n" +
            "    JOIN plays p ON p.play_id = s.play_id\n" +
            "    WHERE t.is_returned = 0\n" +
            "    AND ((?1 < 0) OR p.play_id = ?1) \n" +
            "    AND ((?4 = 0) OR ((?4 = 1) AND sd.show_date = (SELECT MIN(show_date) FROM show_dates WHERE ((?1 < 0) OR play_id = ?1))))\n" +
            "    AND ((?2 IS NULL) OR sd.show_date >= TO_DATE(?2, 'yyyy.mm.dd')) \n" +
            "    AND ((?3 IS NULL) OR sd.show_date <= TO_DATE(?3, 'yyyy.mm.dd')) \n", nativeQuery = true)
    List<Tickets> getTicketsCount(Integer playId, String fromDate, String toDate, Integer isPremiere);

    @Query(value = "SELECT SUM(t.final_price)\n" +
            "    FROM tickets t\n" +
            "    JOIN show_dates sd ON sd.show_date_id = t.show_date_id\n" +
            "    JOIN stagings s ON s.staging_id = sd.staging_id\n" +
            "    JOIN plays p ON p.play_id = s.play_id\n" +
            "    WHERE t.is_returned = 0\n" +
            "    AND ((?1 < 0) OR p.play_id = ?1) \n" +
            "    AND ((?4 = 0) OR ((?4 = 1) AND sd.show_date = (SELECT MIN(show_date) FROM show_dates WHERE ((?1 < 0) OR play_id = ?1))))\n" +
            "    AND ((?2 IS NULL) OR sd.show_date >= TO_DATE(?2, 'yyyy.mm.dd')) \n" +
            "    AND ((?3 IS NULL) OR sd.show_date <= TO_DATE(?3, 'yyyy.mm.dd')) \n", nativeQuery = true)
    Integer getProfitFromTickets(Integer playId, String fromDate, String toDate, Integer isPremiere);




}

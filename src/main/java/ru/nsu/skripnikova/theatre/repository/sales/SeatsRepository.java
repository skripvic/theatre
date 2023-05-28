package ru.nsu.skripnikova.theatre.repository.sales;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.nsu.skripnikova.theatre.entity.sales.Seats;

import java.util.List;

@Repository
public interface SeatsRepository extends JpaRepository<Seats, Integer> {

    Seats getSeatsBySeatId (Integer seatId);

    @Query(value = "SELECT * \n" +
            "    FROM seats s\n" +
            "    LEFT JOIN tickets t ON (s.seat_id = t.seat_id AND t.show_date_id = 1)\n" +
            "    WHERE t.seat_id IS NULL\n" +
            "    OR (s.seat_id IN (\n" +
            "       SELECT seat_id\n" +
            "       FROM tickets\n" +
            "       WHERE is_returned = 1 AND\n" +
            "       NOT EXISTS (SELECT 1 FROM tickets t WHERE t.seat_id = s.seat_id AND is_returned = 0)))\n" +
            "    ORDER BY s.seat_id", nativeQuery = true)
    List<Seats> getFreeSeatsByShowDateId(Integer showDateId);

}

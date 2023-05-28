package ru.nsu.skripnikova.theatre.repository.sales;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nsu.skripnikova.theatre.entity.sales.SeatAreas;

@Repository
public interface SeatAreasRepository extends JpaRepository<SeatAreas, Integer> {

    SeatAreas getSeatAreasBySeatAreaId (Integer seatAreaId);
}

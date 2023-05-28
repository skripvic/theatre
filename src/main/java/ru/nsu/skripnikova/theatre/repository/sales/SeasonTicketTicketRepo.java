package ru.nsu.skripnikova.theatre.repository.sales;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nsu.skripnikova.theatre.entity.sales.SeasonTicketTicket;

@Repository
public interface SeasonTicketTicketRepo extends JpaRepository<SeasonTicketTicket, Integer> {

}

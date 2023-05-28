package ru.nsu.skripnikova.theatre.repository.sales;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.nsu.skripnikova.theatre.entity.sales.SeasonTickets;

@Repository
public interface SeasonTicketRepository extends JpaRepository<SeasonTickets, Integer> {

    SeasonTickets getSeasonTicketsBySeasonTicketId (Integer seasonTicketId);

    @Query(value = "SELECT SEQUENCE_SEASON_TICKETS.nextval FROM dual", nativeQuery = true)
    Integer getNextSeasonTicketsId();
}

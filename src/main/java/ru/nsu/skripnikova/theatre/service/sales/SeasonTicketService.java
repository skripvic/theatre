package ru.nsu.skripnikova.theatre.service.sales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.skripnikova.theatre.controller.requests.SeasonTicketsRequest;
import ru.nsu.skripnikova.theatre.entity.sales.SeasonTickets;
import ru.nsu.skripnikova.theatre.repository.sales.SeasonTicketRepository;

@Service
public class SeasonTicketService {

    @Autowired
    private SeasonTicketRepository seasonTicketRepository;

    public void addSeasonTickets(SeasonTicketsRequest seasonTicketsRequest) {
        Integer nextVal = seasonTicketRepository.getNextSeasonTicketsId();
        SeasonTickets seasonTickets = new SeasonTickets(nextVal, seasonTicketsRequest.getDescription(),
                seasonTicketsRequest.getAuthorID(), seasonTicketsRequest.getGenreId(), seasonTicketsRequest.getPrice());
        seasonTicketRepository.save(seasonTickets);
    }

    public void deleteSeasonTickets(Integer seasonTicketsId) {
        SeasonTickets seasonTickets = seasonTicketRepository.getSeasonTicketsBySeasonTicketId(seasonTicketsId);
        if (seasonTickets == null) {
            //throw not found exception
        }
        seasonTicketRepository.delete(seasonTickets);
    }

    public SeasonTickets getSeasonTickets(Integer seasonTicketsId) {
        return seasonTicketRepository.getSeasonTicketsBySeasonTicketId(seasonTicketsId);
    }

    public void updateSeasonTickets(SeasonTickets seasonTickets, Integer seasonTicketsId) {
        if (seasonTicketRepository.getSeasonTicketsBySeasonTicketId(seasonTicketsId) == null) {
            //throw not found exception
        }
        seasonTickets.setSeasonTicketId(seasonTicketsId);
        seasonTicketRepository.save(seasonTickets);
    }
}

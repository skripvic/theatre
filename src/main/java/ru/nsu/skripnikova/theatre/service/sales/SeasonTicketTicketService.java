package ru.nsu.skripnikova.theatre.service.sales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.skripnikova.theatre.controller.requests.SeasonTicketsRequest;
import ru.nsu.skripnikova.theatre.entity.sales.SeasonTickets;
import ru.nsu.skripnikova.theatre.repository.sales.SeasonTicketTicketRepo;

@Service
public class SeasonTicketTicketService {

    @Autowired
    private SeasonTicketTicketRepo seasonTicketTicketRepo;

//    public void addSeasonTickets(SeasonTicketsRequest seasonTicketsRequest) {
//        Integer nextVal = seasonTicketTicketRepo.getNextSeasonTicketsId();
//        SeasonTickets seasonTickets = new SeasonTickets(nextVal, seasonTicketsRequest.getDescription(),
//                seasonTicketsRequest.getAuthorID(), seasonTicketsRequest.getGenreId(), seasonTicketsRequest.getPrice());
//        seasonTicketTicketRepo.save(seasonTickets);
//    }

}

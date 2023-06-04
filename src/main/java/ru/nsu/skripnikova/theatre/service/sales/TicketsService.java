package ru.nsu.skripnikova.theatre.service.sales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.skripnikova.theatre.controller.requests.FormForRolesByFields;
import ru.nsu.skripnikova.theatre.controller.requests.FormForTicketsCount;
import ru.nsu.skripnikova.theatre.controller.requests.StagingsPlaysRequest;
import ru.nsu.skripnikova.theatre.controller.requests.TicketsRequest;
import ru.nsu.skripnikova.theatre.entity.repertoire.Plays;
import ru.nsu.skripnikova.theatre.entity.repertoire.Roles;
import ru.nsu.skripnikova.theatre.entity.repertoire.Stagings;
import ru.nsu.skripnikova.theatre.entity.sales.Tickets;
import ru.nsu.skripnikova.theatre.repository.sales.TicketsRepository;
import ru.nsu.skripnikova.theatre.service.repertoire.PlaysService;
import ru.nsu.skripnikova.theatre.service.repertoire.StagingsService;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicketsService {

    @Autowired
    private TicketsRepository ticketsRepository;


    @Autowired
    private StagingsService stagingsService;

    @Autowired
    private PlaysService playsService;


    public List<Plays> getAllPlays() {
        return playsService.getAllPlays();
    }

    public void addTickets (TicketsRequest ticketsRequest) {
        Integer nextVal = ticketsRepository.getNextTicketsId();
        Tickets tickets = new Tickets(nextVal, ticketsRequest.getSeatId(), ticketsRequest.getShowDateId(),
                ticketsRequest.getFinalPrice(), ticketsRequest.getIsReturned());
        ticketsRepository.save(tickets);
    }

    public void deleteTickets (Integer ticketsId) {
        Tickets tickets = ticketsRepository.getTicketsByTicketId(ticketsId);
        if (tickets == null) {
            //throw not found exception
        }
        ticketsRepository.delete(tickets);
    }

    public Tickets getTickets (Integer ticketsId) {
        return ticketsRepository.getTicketsByTicketId(ticketsId);
    }

    public void updateTickets (Tickets tickets, Integer ticketsId) {
        if (ticketsRepository.getTicketsByTicketId(ticketsId) == null) {
            //throw not found exception
        }
        tickets.setTicketId(ticketsId);
        ticketsRepository.save(tickets);
    }

    public List<Tickets> getTicketsCount(FormForTicketsCount formForTicketsCount) {
        Integer playId = formForTicketsCount.getPlayId();
        String fromDate = formForTicketsCount.getFromDate();
        String toDate = formForTicketsCount.getToDate();
        Integer isPremiere = formForTicketsCount.getIsPremiere() ? 1 : 0;
        if (formForTicketsCount.getPlayId() == null){
            playId = -1;
        }
        return ticketsRepository.getTicketsCount(playId, fromDate, toDate, isPremiere);
    }

    public Integer getProfitFromTickets(FormForTicketsCount formForTicketsCount) {
        Integer playId = formForTicketsCount.getPlayId();
        String fromDate = formForTicketsCount.getFromDate();
        String toDate = formForTicketsCount.getToDate();
        Integer isPremiere = formForTicketsCount.getIsPremiere() ? 1 : 0;
        if (formForTicketsCount.getPlayId() == null){
            playId = -1;
        }
        return ticketsRepository.getProfitFromTickets(playId, fromDate, toDate, isPremiere);
    }
}

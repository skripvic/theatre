package ru.nsu.skripnikova.theatre.controller.sales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.nsu.skripnikova.theatre.service.sales.SeasonTicketTicketService;

@Controller
public class SeasonTicketTicketController {

    @Autowired
    private SeasonTicketTicketService seasonTicketTicketService;
}

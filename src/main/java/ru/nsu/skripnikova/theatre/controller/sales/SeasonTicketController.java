package ru.nsu.skripnikova.theatre.controller.sales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.nsu.skripnikova.theatre.service.sales.SeasonTicketService;

@Controller
public class SeasonTicketController {

    @Autowired
    private SeasonTicketService seasonTicketService;
}

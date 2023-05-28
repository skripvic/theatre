package ru.nsu.skripnikova.theatre.controller.sales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import ru.nsu.skripnikova.theatre.controller.requests.FormForRolesByFields;
import ru.nsu.skripnikova.theatre.controller.requests.FormForTicketsCount;
import ru.nsu.skripnikova.theatre.entity.repertoire.Roles;
import ru.nsu.skripnikova.theatre.entity.sales.Tickets;
import ru.nsu.skripnikova.theatre.service.sales.TicketsService;

import java.util.List;

@Controller
public class TicketsController {

    @Autowired
    private TicketsService ticketsService;

    @GetMapping("queries/q11-1")
    public String getTicketsCount(Model model) {
        model.addAttribute("FormForTicketsCount", new FormForTicketsCount());
        return "queries/q11/formForTicketsCount";
    }

    @GetMapping(value = "queries/q11-2")
    public String getTicketsCountPost(@ModelAttribute("FormForTicketsCount") FormForTicketsCount formForTicketsCount,
                                 Model model) {
        Integer ticketsCount = ticketsService.getTicketsCount(formForTicketsCount).size();
        model.addAttribute("ticketsCount", ticketsCount);
        return "queries/q11/getTicketsCount";
    }

    @GetMapping("queries/q12-1")
    public String getProfitFromTickets(Model model) {
        model.addAttribute("FormForTicketsCount", new FormForTicketsCount());
        return "queries/q12/formForProfitFromTickets";
    }

    @GetMapping(value = "queries/q12-2")
    public String getProfitFromTicketsPost(@ModelAttribute("FormForTicketsCount") FormForTicketsCount formForTicketsCount,
                                 Model model) {
        Integer ticketsCount = ticketsService.getProfitFromTickets(formForTicketsCount);
        model.addAttribute("ticketsCount", ticketsCount);
        return "queries/q12/getProfitFromTickets";
    }
}

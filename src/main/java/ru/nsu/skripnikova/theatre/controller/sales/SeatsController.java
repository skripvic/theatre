package ru.nsu.skripnikova.theatre.controller.sales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import ru.nsu.skripnikova.theatre.controller.requests.FormForFreeSeatsRequest;
import ru.nsu.skripnikova.theatre.controller.requests.FormForTicketsCount;
import ru.nsu.skripnikova.theatre.entity.sales.Seats;
import ru.nsu.skripnikova.theatre.service.sales.SeatsService;

import java.util.List;

@Controller
public class SeatsController {

    @Autowired
    private SeatsService seatsService;

    @GetMapping("queries/q13-1")
    public String getProfitFromTickets(Model model) {
        model.addAttribute("FormForFreeSeatsRequest", new FormForFreeSeatsRequest());
        model.addAttribute("showDates", seatsService.getShowDatePlayRequest());
        return "queries/q13/formForFreeSeats";
    }

    @GetMapping(value = "queries/q13-2")
    public String getProfitFromTicketsPost(@ModelAttribute("FormForFreeSeatsRequest") FormForFreeSeatsRequest formForFreeSeatsRequest,
                                           Model model) {
        List<Seats> seatsList = seatsService.getFreeSeatsByShowDateId(formForFreeSeatsRequest);
        model.addAttribute("seatsList", seatsList);
        return "queries/q13/getFreeSeats";
    }
}

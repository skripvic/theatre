package ru.nsu.skripnikova.theatre.controller.sales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.nsu.skripnikova.theatre.service.sales.SeatAreasService;

@Controller
public class SeatAreasController {

    @Autowired
    private SeatAreasService seatAreasService;
}

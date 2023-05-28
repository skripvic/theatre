package ru.nsu.skripnikova.theatre.controller.sales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.nsu.skripnikova.theatre.service.sales.ShowDatesService;

@Controller
public class ShowDatesController {

    @Autowired
    private ShowDatesService showDatesService;
}

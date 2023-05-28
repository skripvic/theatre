package ru.nsu.skripnikova.theatre.controller.people;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.nsu.skripnikova.theatre.service.people.GeneralWorkersService;

@Controller
public class GeneralWorkersController {

    @Autowired
    private GeneralWorkersService generalWorkersService;
}

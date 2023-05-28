package ru.nsu.skripnikova.theatre.controller.people;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.nsu.skripnikova.theatre.service.people.MusiciansService;

@Controller
public class MusiciansController {

    @Autowired
    private MusiciansService musiciansService;
}

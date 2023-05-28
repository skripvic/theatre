package ru.nsu.skripnikova.theatre.controller.people_info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.nsu.skripnikova.theatre.service.people_info.ActorTitleService;

@Controller
public class ActorTitleController {

    @Autowired
    private ActorTitleService actorTitleService;
}

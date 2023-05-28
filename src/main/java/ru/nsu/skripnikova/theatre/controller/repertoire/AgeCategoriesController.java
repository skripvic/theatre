package ru.nsu.skripnikova.theatre.controller.repertoire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.nsu.skripnikova.theatre.service.repertoire.AgeCategoriesService;

@Controller
public class AgeCategoriesController {

    @Autowired
    private AgeCategoriesService ageCategoriesService;
}

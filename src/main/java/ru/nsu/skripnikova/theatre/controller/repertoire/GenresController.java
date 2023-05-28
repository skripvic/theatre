package ru.nsu.skripnikova.theatre.controller.repertoire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.nsu.skripnikova.theatre.service.repertoire.GenresService;

@Controller
public class GenresController {

    @Autowired
    private GenresService genresService;
}

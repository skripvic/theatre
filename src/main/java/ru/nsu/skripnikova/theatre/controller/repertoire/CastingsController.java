package ru.nsu.skripnikova.theatre.controller.repertoire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.nsu.skripnikova.theatre.entity.people.Employees;
import ru.nsu.skripnikova.theatre.entity.repertoire.Stagings;
import ru.nsu.skripnikova.theatre.service.repertoire.CastingsService;

import java.util.List;

@Controller
public class CastingsController {

    @Autowired
    private CastingsService castingsService;

}

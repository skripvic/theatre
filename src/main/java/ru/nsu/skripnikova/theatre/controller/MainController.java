package ru.nsu.skripnikova.theatre.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping(value = "menus/main")
    public String mainMenu() {
        return "menus/main";
    }

    @GetMapping(value = "menus/queryMenu")
    public String queryMenu() {
        return "menus/queryMenu";
    }

}
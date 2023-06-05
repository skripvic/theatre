package ru.nsu.skripnikova.theatre.controller.repertoire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.nsu.skripnikova.theatre.entity.people.Employees;
import ru.nsu.skripnikova.theatre.entity.repertoire.Plays;
import ru.nsu.skripnikova.theatre.entity.repertoire.Stagings;
import ru.nsu.skripnikova.theatre.service.people.EmployeesService;
import ru.nsu.skripnikova.theatre.service.repertoire.PlaysService;
import ru.nsu.skripnikova.theatre.service.repertoire.StagingsService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StagingsController {

    @Autowired
    private StagingsService stagingsService;

    @Autowired
    private EmployeesService employeesService;


    @GetMapping(value = "repertoire/allStagings")
    public String getAllStagings(Model model) {
        List<Stagings> stagingsList = stagingsService.getAllStagings();
        List<Employees> directorList = new ArrayList<>();
        List<Employees> artDirectorList = new ArrayList<>();
        List<Employees> conductorList = new ArrayList<>();
        List<Plays> playsList = new ArrayList<>();
        model.addAttribute("stagingsList", stagingsList);
        for (Stagings stagings : stagingsList) {
            Employees director = employeesService.getEmployeesById(stagings.getDirectorId());
            Employees artDirector = employeesService.getEmployeesById(stagings.getArtDirectorId());
            Employees conductor = employeesService.getEmployeesById(stagings.getConductorId());
            Plays play = stagingsService.getPlayById(stagings.getPlayId());
            directorList.add(director);
            artDirectorList.add(artDirector);
            conductorList.add(conductor);
            playsList.add(play);
        }
        model.addAttribute("directorList", directorList);
        model.addAttribute("artDirectorList", artDirectorList);
        model.addAttribute("conductorList", conductorList);
        model.addAttribute("playsList", playsList);
        return "repertoire/stagings";
    }

}

package ru.nsu.skripnikova.theatre.controller.people;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.nsu.skripnikova.theatre.controller.requests.ActorsRequest;
import ru.nsu.skripnikova.theatre.service.people.ActorsService;

import java.text.ParseException;

@Controller
public class ActorsController {

    @Autowired
    private ActorsService actorsService;

//    @GetMapping(value = "people/addActors/{employeeId}")
//    public String addActors(Model model) {
//        model.addAttribute("actorsRequest", new ActorsRequest());
//        return "people/addActors";
//    }
//
//    @PostMapping(value = "people/addActorsPost")
//    public String addActorsPost(@ModelAttribute("actorsRequest") ActorsRequest actorsRequest) throws ParseException {
//        actorsService.addActors(employeeId, actorsRequest);
//        return "redirect:allEmployees";
//    }

}

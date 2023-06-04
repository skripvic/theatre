package ru.nsu.skripnikova.theatre.controller.people;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ru.nsu.skripnikova.theatre.controller.requests.GeneralWorkerRequest;
import ru.nsu.skripnikova.theatre.controller.requests.MusiciansRequest;
import ru.nsu.skripnikova.theatre.service.people.GeneralWorkersService;

import java.text.ParseException;

@Controller
public class GeneralWorkersController {

    @Autowired
    private GeneralWorkersService generalWorkersService;

    @PostMapping(value = "people/addGeneralWorkers/{generalWorkerId}")
    public String addActors(@PathVariable(name = "generalWorkerId") Integer generalWorkerId,
                            @ModelAttribute("generalWorkerRequest") GeneralWorkerRequest generalWorkerRequest) throws ParseException {
        generalWorkersService.addGeneralWorkers(generalWorkerRequest, generalWorkerId);
        return "redirect:/people/allEmployees";
    }
}

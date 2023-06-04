package ru.nsu.skripnikova.theatre.controller.people;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ru.nsu.skripnikova.theatre.controller.requests.MusiciansRequest;
import ru.nsu.skripnikova.theatre.controller.requests.StageWorkerRequest;
import ru.nsu.skripnikova.theatre.service.people.StageWorkersService;

import java.text.ParseException;

@Controller
public class StageWorkersController {

    @Autowired
    private StageWorkersService stageWorkersService;

    @PostMapping(value = "people/addStageWorkers/{stageWorkerId}")
    public String addStageWorkers(@PathVariable(name = "stageWorkerId") Integer stageWorkerId,
                            @ModelAttribute("stageWorkerRequest") StageWorkerRequest stageWorkerRequest) throws ParseException {
        stageWorkersService.addStageWorkers(stageWorkerRequest, stageWorkerId);
        return "redirect:/people/allEmployees";
    }

}

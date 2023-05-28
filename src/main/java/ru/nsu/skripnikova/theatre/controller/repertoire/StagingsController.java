package ru.nsu.skripnikova.theatre.controller.repertoire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.nsu.skripnikova.theatre.entity.repertoire.Stagings;
import ru.nsu.skripnikova.theatre.service.repertoire.StagingsService;

import java.util.List;

@Controller
public class StagingsController {

    @Autowired
    private StagingsService stagingsService;

    @GetMapping(value = "repertoire/allStagings")
    public String getAllStagings(Model model) {
        List<Stagings> stagingsList = stagingsService.getAllStagings();
        model.addAttribute("stagingsList", stagingsList);
        return "repertoire/stagings";
    }

}

package ru.nsu.skripnikova.theatre.controller.repertoire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import ru.nsu.skripnikova.theatre.controller.requests.FormForAuthorsRequest;
import ru.nsu.skripnikova.theatre.controller.requests.FormForPlaysRequest;
import ru.nsu.skripnikova.theatre.entity.people.Employees;
import ru.nsu.skripnikova.theatre.entity.repertoire.Authors;
import ru.nsu.skripnikova.theatre.entity.repertoire.Plays;
import ru.nsu.skripnikova.theatre.service.repertoire.PlaysService;

import java.util.List;

@Controller
public class PlaysController {

    @Autowired
    private PlaysService playsService;

    @GetMapping(value = "repertoire/{playId}")
    public String getPlays(Model model, @PathVariable(name = "playId") Integer playId) {
        Plays plays = playsService.getPlays(playId);
        model.addAttribute("playId", plays.getPlayId());
        model.addAttribute("name", plays.getName());
        model.addAttribute("authorId", plays.getAuthorId());
        model.addAttribute("ageCategoryId", plays.getAgeCategoryId());
        model.addAttribute("genreId", plays.getGenreId());
        model.addAttribute("yearOfCreation", plays.getYearOfCreation());
        return "repertoire/playInfo";
    }

    @GetMapping(value = "repertoire/allPlays")
    public String getAllPlays(Model model) {
        List<Plays> playsList = playsService.getAllPlays();
        model.addAttribute("playsList", playsList);
        return "repertoire/plays";
    }

    @GetMapping("queries/q2-1")
    public String getPlaysByFields(Model model) {
        model.addAttribute("FormForPlaysRequest", new FormForPlaysRequest());
        return "queries/q2/formForPlays";
    }

    @GetMapping(value = "queries/q2-2")
    public String getPlaysByFieldsPost(@ModelAttribute("FormForPlaysRequest") FormForPlaysRequest formForPlaysRequest,
                               Model model) {
        List<Plays> playsList= playsService.getPlaysByFields(formForPlaysRequest);
        model.addAttribute("playsList", playsList);
        return "queries/q2/getPlaysByFields";
    }

}

package ru.nsu.skripnikova.theatre.controller.people;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ru.nsu.skripnikova.theatre.controller.requests.ActorsRequest;
import ru.nsu.skripnikova.theatre.controller.requests.MusiciansRequest;
import ru.nsu.skripnikova.theatre.service.people.MusiciansService;

import java.text.ParseException;

@Controller
public class MusiciansController {

    @Autowired
    private MusiciansService musiciansService;

    @PostMapping(value = "people/addMusicianPost/{musicianId}")
    public String addMusicians(@PathVariable(name = "musicianId") Integer musicianId,
                               @ModelAttribute("musicianRequest") MusiciansRequest musiciansRequest) throws ParseException {
        musiciansService.addMusicians(musiciansRequest, musicianId);
        return "redirect:/people/allEmployees";
    }
}

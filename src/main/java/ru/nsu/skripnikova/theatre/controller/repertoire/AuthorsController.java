package ru.nsu.skripnikova.theatre.controller.repertoire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.nsu.skripnikova.theatre.controller.requests.EmployeesRequest;
import ru.nsu.skripnikova.theatre.controller.requests.FormForAuthorsRequest;
import ru.nsu.skripnikova.theatre.entity.people.Employees;
import ru.nsu.skripnikova.theatre.entity.repertoire.Authors;
import ru.nsu.skripnikova.theatre.service.repertoire.AuthorsService;

import java.text.ParseException;
import java.util.List;
import java.util.Objects;

@Controller
public class AuthorsController {

    @Autowired
    private AuthorsService authorsService;

    @GetMapping("queries/q4-1")
    public String getAuthors(Model model) {
        model.addAttribute("FormForAuthorsRequest", new FormForAuthorsRequest());
        model.addAttribute("genres", authorsService.getAllGenres());
        model.addAttribute("countries", authorsService.getAllCountries());
        return "queries/q4/formForAuthors";
    }

    @GetMapping(value = "queries/q4-2")
    public String getAuthorsPost(@ModelAttribute("FormForAuthorsRequest") FormForAuthorsRequest formForAuthorsRequest,
                               Model model) {
//        if (Objects.equals(formForAuthorsRequest.getCountry(), "null")){
//            formForAuthorsRequest.setCentury(null);
//        }
        List<Authors> authorsList = authorsService.getAuthorsByFields(formForAuthorsRequest);
        model.addAttribute("authorsList", authorsList);
        return "queries/q4/getAuthorsByFields";
    }
}

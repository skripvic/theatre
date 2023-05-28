package ru.nsu.skripnikova.theatre.controller.repertoire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import ru.nsu.skripnikova.theatre.controller.requests.FormForRolesByFields;
import ru.nsu.skripnikova.theatre.entity.repertoire.Roles;
import ru.nsu.skripnikova.theatre.service.repertoire.RolesService;

import java.util.List;

@Controller
public class RolesController {

    @Autowired
    private RolesService rolesService;

    @GetMapping("queries/q10-1")
    public String getAuthors(Model model) {
        model.addAttribute("FormForRolesByFields", new FormForRolesByFields());
        return "queries/q10/formForRolesByFields";
    }

    @GetMapping(value = "queries/q10-2")
    public String getAuthorsPost(@ModelAttribute("FormForRolesByFields") FormForRolesByFields formForRolesByFields,
                                 Model model) {
        List<Roles> rolesList = rolesService.getRolesByFields(formForRolesByFields);
        model.addAttribute("rolesList", rolesList);
        return "queries/q10/getRolesByFields";
    }
}

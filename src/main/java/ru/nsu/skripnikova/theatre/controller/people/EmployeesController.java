package ru.nsu.skripnikova.theatre.controller.people;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ru.nsu.skripnikova.theatre.controller.requests.*;
import ru.nsu.skripnikova.theatre.entity.people.Employees;
import ru.nsu.skripnikova.theatre.entity.repertoire.Authors;
import ru.nsu.skripnikova.theatre.service.people.EmployeesService;

import java.text.ParseException;
import java.util.List;

@Controller
public class EmployeesController {

    @Autowired
    private EmployeesService employeesService;

    @GetMapping(value = "people/addEmployees")
    public String addEmployeesForm(Model model) {
        model.addAttribute("employeesRequest", new EmployeesRequest());
        return "people/addEmployees";
    }

    @PostMapping(value = "people/addEmployeesPost")
    public String addEmployees(@ModelAttribute("employeesRequest") EmployeesRequest employeesRequest) throws ParseException {
        employeesService.addEmployees(employeesRequest);
        return "redirect:allEmployees";
    }

    @GetMapping(value = "people/getActors")
    public String getActors(Model model) {
        List<Employees> employeesList = employeesService.getActors();
        model.addAttribute("employeesList", employeesList);
        return "people/actors";
    }

    @GetMapping(value = "people/getMusicians")
    public String getMusicians(Model model) {
        List<Employees> employeesList = employeesService.getMusicians();
        model.addAttribute("employeesList", employeesList);
        return "people/musicians";
    }

    @GetMapping(value = "people/getStageWorkers")
    public String getStageWorkers(Model model) {
        List<Employees> employeesList = employeesService.getStageWorkers();
        model.addAttribute("employeesList", employeesList);
        return "people/stageWorkers";
    }

    @GetMapping(value = "people/getGeneralWorkers")
    public String getGeneralWorkers(Model model) {
        List<Employees> employeesList = employeesService.getGeneralWorkers();
        model.addAttribute("employeesList", employeesList);
        return "people/generalWorkers";
    }

    @GetMapping(value = "people/employees/{employeeId}")
    public ResponseEntity<Employees> getEmployeesByEmployeeId(@PathVariable(name = "employeeId") Integer employeeId){
        return new ResponseEntity<>(employeesService.getEmployees(employeeId) , HttpStatus.OK);
    }

    @GetMapping(value = "people/allEmployees")
    public String getAllEmployees(Model model) {
        List<Employees> employeesList = employeesService.getAllEmployees();
        model.addAttribute("employeesList", employeesList);
        return "people/employees";
    }

    @GetMapping(value = "people/{employeeId}")
    public String getEmployees (Model model, @PathVariable(name = "employeeId") Integer employeeId) {
        Employees employees = employeesService.getEmployees(employeeId);
        model.addAttribute("employeeId", employees.getEmployeeId());
        model.addAttribute("firstname", employees.getFirstName());
        model.addAttribute("lastname", employees.getLastName());
        model.addAttribute("birthDate", employees.getBirthDate());
        model.addAttribute("numberOfChildren", employees.getNumberOfChildren());
        model.addAttribute("sex", employees.getSex());
        model.addAttribute("firstWorkDay", employees.getFirstWorkDay());
        model.addAttribute("lastWorkDay", employees.getLastWorkDay());
        model.addAttribute("salary", employees.getSalary());
        model.addAttribute("positionId", employees.getPositionId());
        model.addAttribute("isStudent", employees.getIsStudent());
        return "people/employeeInfo";
    }

    @GetMapping(value = "queries/q1-1")
    public String getAllEmployeesQ1(Model model) {
        List<Employees> employeesList = employeesService.getAllEmployees();
        List<Integer> employeesAgesList = employeesService.getEmployeesAgesQ1();
        model.addAttribute("employeesList", employeesList);
        model.addAttribute("employeesAgesList", employeesAgesList);
        return "queries/employees";
    }

    @GetMapping(value = "queries/q1-2")
    public String getEmployeesCountQ1(Model model) {
        Integer actorsCount = employeesService.getEmployeesCountByPositionId(1);
        Integer musiciansCount = employeesService.getEmployeesCountByPositionId(2);
        Integer stageWorkersCount = employeesService.getEmployeesCountByPositionId(3);
        Integer generalWorkersCount = employeesService.getEmployeesCountByPositionId(4);
        Integer employeesCount = employeesService.getEmployeesCount();
        model.addAttribute("actorCount", actorsCount);
        model.addAttribute("musicianCount", musiciansCount);
        model.addAttribute("stageWorkerCount", stageWorkersCount);
        model.addAttribute("generalWorkerCount", generalWorkersCount);
        model.addAttribute("employeeCount", employeesCount);
        return "queries/employeesCount";
    }

    @GetMapping(value = "queries/q6-1")
    public String getActorsByRoleId(Model model) {
        model.addAttribute("FormForActorsRequest", new FormForActorsRequest());
        return "queries/q6/formForActors";
    }

    @GetMapping(value = "queries/q6-2")
    public String getActorsByRoleIdPost(@ModelAttribute("FormForActorsRequest") FormForActorsRequest formForActorsRequest,
                               Model model) {
        List<Employees> employeesList= employeesService.getActorsByRoleId(formForActorsRequest);
        model.addAttribute("employeesList", employeesList);
        return "queries/q6/getActorsByRoleId";
    }

    @GetMapping(value = "queries/q8-1")
    public String getEmployeesByTour(Model model) {
        model.addAttribute("FormForEmployeesByTourRequest", new FormForEmployeesByTourRequest());
        return "queries/q8/formForEmployeesTours";
    }

    @GetMapping(value = "queries/q8-2")
    public String getEmployeesByTourPost(@ModelAttribute("FormForEmployeesByTourRequest") FormForEmployeesByTourRequest formForEmployeesByTourRequest,
                               Model model) {
        List<Employees> employeesList= employeesService.getEmployeesByTour(formForEmployeesByTourRequest);
        model.addAttribute("employeesList", employeesList);
        return "queries/q8/getEmployeesTours";
    }

    @GetMapping(value = "queries/q9-1")
    public String getEmployeesByStagingId(Model model) {
        model.addAttribute("FormForEmployeesByStagingId", new FormForEmployeesByStagingId());
        return "queries/q9/formForEmployeesByStagingId";
    }

    @GetMapping(value = "queries/q9-2")
    public String getEmployeesByStagingIdPost(@ModelAttribute("FormForEmployeesByStagingId") FormForEmployeesByStagingId formForEmployeesByStagingId,
                                         Model model) {
        Employees director = employeesService.getDirectorByStagingId(formForEmployeesByStagingId);
        Employees artDirector = employeesService.getArtDirectorByStagingId(formForEmployeesByStagingId);
        Employees conductor = employeesService.getConductorByStagingId(formForEmployeesByStagingId);
        List<Employees> actorsList= employeesService.getActorsByStagingId(formForEmployeesByStagingId);
        List<Employees> backupActorsList= employeesService.getBackupActorsByStagingId(formForEmployeesByStagingId);
        model.addAttribute("director", director);
        model.addAttribute("artDirector", artDirector);
        model.addAttribute("conductor", conductor);
        model.addAttribute("actorsList", actorsList);
        model.addAttribute("backupActorsList", backupActorsList);
        return "queries/q9/getEmployeesByStagingId";
    }


}

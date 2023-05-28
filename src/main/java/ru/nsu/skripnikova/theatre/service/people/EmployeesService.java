package ru.nsu.skripnikova.theatre.service.people;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.skripnikova.theatre.controller.requests.*;
import ru.nsu.skripnikova.theatre.entity.people.Employees;
import ru.nsu.skripnikova.theatre.entity.repertoire.Plays;
import ru.nsu.skripnikova.theatre.repository.people.EmployeesRepository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.springframework.util.ObjectUtils.isEmpty;

@Service
public class EmployeesService {

    @Autowired
    private EmployeesRepository employeesRepository;

    public List<Employees> getActors() {
        return employeesRepository.getEmployeesByPositionId(1);
    }

    public List<Employees> getMusicians () {
        return employeesRepository.getEmployeesByPositionId(2);
    }

    public List<Employees> getStageWorkers() {
        return employeesRepository.getEmployeesByPositionId(3);
    }

    public List<Employees> getGeneralWorkers() {
        return employeesRepository.getEmployeesByPositionId(4);
    }

    public void addEmployees (EmployeesRequest employeesRequest) throws ParseException {
        Integer nextVal = employeesRepository.getNextEmployeesId();
        Date birthDate = formatDateFromString(employeesRequest.getBirthDate());
        Date firstWorkDate = formatDateFromString(employeesRequest.getFirstWorkDay());
        Date lastWorkDate;
        if (isEmpty(employeesRequest.getLastWorkDay())) {
            lastWorkDate = null;
        } else{
            lastWorkDate = formatDateFromString(employeesRequest.getLastWorkDay());
        }
        Employees employees = new Employees(nextVal, employeesRequest.getFirstName(), employeesRequest.getLastName(),
                employeesRequest.getSex(), birthDate, employeesRequest.getNumberOfChildren(),
                employeesRequest.getSalary(), firstWorkDate, lastWorkDate,
                employeesRequest.getPositionId(), employeesRequest.getIsStudent());
        employeesRepository.save(employees);
    }

    public void deleteEmployees (Integer employeeId) {
        Employees employees = employeesRepository.getEmployeesByEmployeeId(employeeId);
        if (employees == null) {
            //throw not found exception
        }
        employeesRepository.delete(employees);
    }

    public Employees getEmployees(Integer employeeId) {
        return employeesRepository.getEmployeesByEmployeeId(employeeId);
    }

    public List<Employees> getAllEmployees() {
        return employeesRepository.getAllEmployees();
    }

    public List<Integer> getEmployeesAgesQ1() {
        return employeesRepository.getEmployeesAgesQ1();
    }

    public Integer getEmployeesCountByPositionId(Integer employeeId) {
        return employeesRepository.getEmployeesCountByPositionId(employeeId);
    }

    public Integer getEmployeesCount() {
        return employeesRepository.getEmployeesCount();
    }

    public void updateEmployees (Employees employees, Integer employeeId) {
        if (employeesRepository.getEmployeesByEmployeeId(employeeId) == null) {
            //throw not found exception
        }
        employees.setEmployeeId(employeeId);
        employeesRepository.save(employees);
    }

    public List<Employees> getActorsByRoleId(FormForActorsRequest formForActorsRequest) {
        Integer roleId = formForActorsRequest.getRoleId();
        Integer isVoiceCorrect = formForActorsRequest.getIsVoiceCorrect() ? 1 : 0;
        Integer isBodyBuildCorrect = formForActorsRequest.getIsBodyBuildCorrect() ? 1 : 0;
        Integer isMinHeightCorrect = formForActorsRequest.getIsMinHeightCorrect() ? 1 : 0;
        Integer isMaxHeightCorrect = formForActorsRequest.getIsMaxHeightCorrect() ? 1 : 0;
        Integer isMinAgeCorrect = formForActorsRequest.getIsMinAgeCorrect() ? 1 : 0;
        Integer isMaxAgeCorrect = formForActorsRequest.getIsMaxAgeCorrect() ? 1 : 0;
        return employeesRepository.getActorsByRoleId(roleId, isVoiceCorrect, isBodyBuildCorrect,
                isMinHeightCorrect, isMaxHeightCorrect, isMinAgeCorrect, isMaxAgeCorrect);
    }

    public List<Employees> getEmployeesByTour(FormForEmployeesByTourRequest formForEmployeesByTourRequest) {
        Integer isFromHome = formForEmployeesByTourRequest.getIsFromHome() ? 1 : 0;
        String fromDate = formForEmployeesByTourRequest.getFromDate();
        String toDate = formForEmployeesByTourRequest.getToDate();
        return employeesRepository.getEmployeesByTour(isFromHome, fromDate, toDate);
    }

    public Employees getDirectorByStagingId(FormForEmployeesByStagingId formForEmployeesByStagingId) {
        Integer stagingId = formForEmployeesByStagingId.getStagingId();
        return employeesRepository.getDirectorByStagingId(stagingId);
    }

    public Employees getArtDirectorByStagingId(FormForEmployeesByStagingId formForEmployeesByStagingId) {
        Integer stagingId = formForEmployeesByStagingId.getStagingId();
        return employeesRepository.getArtDirectorByStagingId(stagingId);
    }

    public Employees getConductorByStagingId(FormForEmployeesByStagingId formForEmployeesByStagingId) {
        Integer stagingId = formForEmployeesByStagingId.getStagingId();
        return employeesRepository.getConductorByStagingId(stagingId);
    }

    public List<Employees> getActorsByStagingId(FormForEmployeesByStagingId formForEmployeesByStagingId) {
        Integer stagingId = formForEmployeesByStagingId.getStagingId();
        return employeesRepository.getActorsByStagingId(stagingId);
    }

    public List<Employees> getBackupActorsByStagingId(FormForEmployeesByStagingId formForEmployeesByStagingId) {
        Integer stagingId = formForEmployeesByStagingId.getStagingId();
        return employeesRepository.getBackupActorsByStagingId(stagingId);
    }

    private Date formatDateFromString(String stringDate) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd");
        return formatter.parse(stringDate);
    }
}

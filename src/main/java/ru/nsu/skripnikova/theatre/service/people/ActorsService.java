package ru.nsu.skripnikova.theatre.service.people;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.skripnikova.theatre.controller.requests.ActorsRequest;
import ru.nsu.skripnikova.theatre.controller.requests.EmployeesRequest;
import ru.nsu.skripnikova.theatre.entity.people.Actors;
import ru.nsu.skripnikova.theatre.entity.people.Employees;
import ru.nsu.skripnikova.theatre.repository.people.ActorsRepository;

import java.text.ParseException;
import java.util.Date;

import static org.springframework.util.ObjectUtils.isEmpty;

@Service
public class ActorsService {

    @Autowired
    private ActorsRepository actorsRepository;

    public void addActors (ActorsRequest actorsRequest, Integer employeeId) throws ParseException {
        Actors actors = new Actors(employeeId, actorsRequest.getVoiceId(), actorsRequest.getHeight(), actorsRequest.getBodyBuildId());
        actorsRepository.save(actors);
    }


}

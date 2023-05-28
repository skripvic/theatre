package ru.nsu.skripnikova.theatre.service.people;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.skripnikova.theatre.repository.people.ActorsRepository;

@Service
public class ActorsService {

    @Autowired
    private ActorsRepository actorsRepository;

}

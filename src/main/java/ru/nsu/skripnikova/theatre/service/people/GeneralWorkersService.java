package ru.nsu.skripnikova.theatre.service.people;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.skripnikova.theatre.controller.requests.GeneralWorkerRequest;
import ru.nsu.skripnikova.theatre.entity.people.GeneralWorkers;
import ru.nsu.skripnikova.theatre.entity.people.StageWorkers;
import ru.nsu.skripnikova.theatre.repository.people.GeneralWorkersRepository;

@Service
public class GeneralWorkersService {

    @Autowired
    private GeneralWorkersRepository generalWorkersRepository;

    public void addGeneralWorkers (GeneralWorkers generalWorkers) {
        generalWorkersRepository.save(generalWorkers);
    }

    public void addGeneralWorkers (GeneralWorkerRequest generalWorkerRequest, Integer stageWorkerId) {
        GeneralWorkers generalWorkers = new GeneralWorkers(stageWorkerId, generalWorkerRequest.getExperience());
        generalWorkersRepository.save(generalWorkers);
    }

    public void deleteGeneralWorkers (Integer generalWorkersId) {
        GeneralWorkers generalWorkers = generalWorkersRepository.getGeneralWorkersByGeneralWorkerId(generalWorkersId);
        if (generalWorkers == null) {
            //throw not found exception
        }
        generalWorkersRepository.delete(generalWorkers);
    }

    public GeneralWorkers getGeneralWorkers (Integer generalWorkersId) {
        return generalWorkersRepository.getGeneralWorkersByGeneralWorkerId(generalWorkersId);
    }

    public void updateGeneralWorkers (GeneralWorkers generalWorkers, Integer generalWorkersId) {
        if (generalWorkersRepository.getGeneralWorkersByGeneralWorkerId(generalWorkersId) == null) {
            //throw not found exception
        }
        generalWorkers.setGeneralWorkerId(generalWorkersId);
        generalWorkersRepository.save(generalWorkers);
    }
}

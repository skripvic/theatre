package ru.nsu.skripnikova.theatre.service.people;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.skripnikova.theatre.controller.requests.StageWorkerRequest;
import ru.nsu.skripnikova.theatre.entity.people.Musicians;
import ru.nsu.skripnikova.theatre.entity.people.StageWorkers;
import ru.nsu.skripnikova.theatre.repository.people.StageWorkersRepository;

@Service
public class StageWorkersService {

    @Autowired
    private StageWorkersRepository stageWorkersRepository;

    public void addStageWorkers (StageWorkers stageWorkers) {
        stageWorkersRepository.save(stageWorkers);
    }

    public void addStageWorkers (StageWorkerRequest stageWorkerRequest, Integer stageWorkerId) {
        StageWorkers stageWorkers = new StageWorkers(stageWorkerId, stageWorkerRequest.getTypeId(), stageWorkerRequest.getExperience());
        stageWorkersRepository.save(stageWorkers);
    }

    public void deleteStageWorkers (Integer stageWorkersId) {
        StageWorkers stageWorkers = stageWorkersRepository.getStageWorkersByStageWorkerId(stageWorkersId);
        if (stageWorkers == null) {
            //throw not found exception
        }
        stageWorkersRepository.delete(stageWorkers);
    }

    public StageWorkers getStageWorkers (Integer stageWorkersId) {
        return stageWorkersRepository.getStageWorkersByStageWorkerId(stageWorkersId);
    }

    public void updateStageWorkers (StageWorkers stageWorkers, Integer stageWorkersId) {
        if (stageWorkersRepository.getStageWorkersByStageWorkerId(stageWorkersId) == null) {
            //throw not found exception
        }
        stageWorkers.setStageWorkerId(stageWorkersId);
        stageWorkersRepository.save(stageWorkers);
    }
}

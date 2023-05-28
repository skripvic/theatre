package ru.nsu.skripnikova.theatre.service.people;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.skripnikova.theatre.entity.people.StageWorkerTypes;
import ru.nsu.skripnikova.theatre.repository.people.StageWorkersTypesRepository;

@Service
public class StageWorkerTypesService {

    @Autowired
    private StageWorkersTypesRepository stageWorkersTypesRepository;

    public void addStageWorkersTypes (StageWorkerTypes stageWorkerTypes) {
        stageWorkersTypesRepository.save(stageWorkerTypes);
    }

    public void deleteStageWorkersTypes (Integer stageWorkerTypesId) {
        StageWorkerTypes stageWorkerTypes = stageWorkersTypesRepository.getStageWorkerTypesByTypeId(stageWorkerTypesId);
        if (stageWorkerTypes == null) {
            //throw not found exception
        }
        stageWorkersTypesRepository.delete(stageWorkerTypes);
    }

    public StageWorkerTypes getStageWorkerTypes (Integer stageWorkerTypesId) {
        return stageWorkersTypesRepository.getStageWorkerTypesByTypeId(stageWorkerTypesId);
    }

    public void updateStageWorkerTypes (StageWorkerTypes stageWorkerTypes, Integer stageWorkerTypesId) {
        if (stageWorkersTypesRepository.getStageWorkerTypesByTypeId(stageWorkerTypesId) == null) {
            //throw not found exception
        }
        stageWorkerTypes.setTypeId(stageWorkerTypesId);
        stageWorkersTypesRepository.save(stageWorkerTypes);
    }
}

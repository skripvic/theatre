package ru.nsu.skripnikova.theatre.repository.people;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nsu.skripnikova.theatre.entity.people.StageWorkerTypes;

@Repository
public interface StageWorkersTypesRepository extends JpaRepository<StageWorkerTypes, Integer> {

    StageWorkerTypes getStageWorkerTypesByTypeId (Integer typeId);
}

package ru.nsu.skripnikova.theatre.repository.people;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nsu.skripnikova.theatre.entity.people.StageWorkers;

@Repository
public interface StageWorkersRepository extends JpaRepository<StageWorkers, Integer> {

    StageWorkers getStageWorkersByStageWorkerId (Integer stageWorkerId);
}

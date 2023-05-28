package ru.nsu.skripnikova.theatre.repository.people;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nsu.skripnikova.theatre.entity.people.GeneralWorkers;

@Repository
public interface GeneralWorkersRepository extends JpaRepository<GeneralWorkers, Integer> {

    GeneralWorkers getGeneralWorkersByGeneralWorkerId (Integer generalWorkerId);


}

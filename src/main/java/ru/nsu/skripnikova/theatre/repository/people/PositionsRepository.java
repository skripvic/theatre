package ru.nsu.skripnikova.theatre.repository.people;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nsu.skripnikova.theatre.entity.people.Positions;

@Repository
public interface PositionsRepository extends JpaRepository<Positions, Integer> {

    Positions getByPositionId (Integer positionId);
}

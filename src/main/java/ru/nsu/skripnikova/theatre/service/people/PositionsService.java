package ru.nsu.skripnikova.theatre.service.people;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.skripnikova.theatre.entity.people.Positions;
import ru.nsu.skripnikova.theatre.repository.people.PositionsRepository;

@Service
public class PositionsService {

    @Autowired
    private PositionsRepository positionsRepository;

    public void addPositions (Positions positions) {
        positionsRepository.save(positions);
    }

    public void deletePositions (Integer positionsId) {
        Positions positions = positionsRepository.getByPositionId(positionsId);
        if (positions == null) {
            //throw not found exception
        }
        positionsRepository.delete(positions);
    }

    public Positions getPositions (Integer positionsId) {
        return positionsRepository.getByPositionId(positionsId);
    }

    public void updatePositions (Positions positions, Integer positionsId) {
        if (positionsRepository.getByPositionId(positionsId) == null) {
            //throw not found exception
        }
        positions.setPositionId(positionsId);
        positionsRepository.save(positions);
    }
}

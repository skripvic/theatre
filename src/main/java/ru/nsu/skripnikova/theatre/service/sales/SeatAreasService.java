package ru.nsu.skripnikova.theatre.service.sales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.skripnikova.theatre.entity.sales.SeatAreas;
import ru.nsu.skripnikova.theatre.repository.sales.SeatAreasRepository;

@Service
public class SeatAreasService {

    @Autowired
    private SeatAreasRepository seatAreasRepository;

    public void addSeatAreas (SeatAreas seatAreas) {
        seatAreasRepository.save(seatAreas);
    }

    public void deleteSeatAreas (Integer seatAreasId) {
        SeatAreas seatAreas = seatAreasRepository.getSeatAreasBySeatAreaId(seatAreasId);
        if (seatAreas == null) {
            //throw not found exception
        }
        seatAreasRepository.delete(seatAreas);
    }

    public SeatAreas getSeatAreas (Integer seatAreasId) {
        return seatAreasRepository.getSeatAreasBySeatAreaId(seatAreasId);
    }

    public void updateSeatAreas (SeatAreas seatAreas, Integer seatAreasId) {
        if (seatAreasRepository.getSeatAreasBySeatAreaId(seatAreasId) == null) {
            //throw not found exception
        }
        seatAreas.setSeatAreaId(seatAreasId);
        seatAreasRepository.save(seatAreas);
    }
}

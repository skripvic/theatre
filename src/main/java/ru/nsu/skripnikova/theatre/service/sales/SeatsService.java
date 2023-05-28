package ru.nsu.skripnikova.theatre.service.sales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.skripnikova.theatre.controller.requests.FormForFreeSeatsRequest;
import ru.nsu.skripnikova.theatre.entity.sales.Seats;
import ru.nsu.skripnikova.theatre.repository.sales.SeatsRepository;

import java.util.List;

@Service
public class SeatsService {

    @Autowired
    private SeatsRepository seatsRepository;

    public void addSeats (Seats seats) {
        seatsRepository.save(seats);
    }

    public void deleteSeats (Integer seatsId) {
        Seats seats = seatsRepository.getSeatsBySeatId(seatsId);
        if (seats == null) {
            //throw not found exception
        }
        seatsRepository.delete(seats);
    }

    public Seats getSeats (Integer seatsId) {
        return seatsRepository.getSeatsBySeatId(seatsId);
    }

    public void updateSeats (Seats seats, Integer seatsId) {
        if (seatsRepository.getSeatsBySeatId(seatsId) == null) {
            //throw not found exception
        }
        seats.setSeatId(seatsId);
        seatsRepository.save(seats);
    }

    public List<Seats> getFreeSeatsByShowDateId(FormForFreeSeatsRequest formForFreeSeatsRequest) {
        Integer showDateId = formForFreeSeatsRequest.getShowDateId();
        if (showDateId == null){
            showDateId = -1;
        }
        return seatsRepository.getFreeSeatsByShowDateId(showDateId);
    }

}

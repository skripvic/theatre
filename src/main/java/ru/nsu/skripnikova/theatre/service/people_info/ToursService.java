package ru.nsu.skripnikova.theatre.service.people_info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.skripnikova.theatre.controller.requests.ToursRequest;
import ru.nsu.skripnikova.theatre.entity.people_info.Tours;
import ru.nsu.skripnikova.theatre.repository.people_info.ToursRepository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ToursService {

    @Autowired
    private ToursRepository toursRepository;

    public void addTours (ToursRequest toursRequest) throws ParseException {
        Integer nextVal = toursRepository.getNextToursId();
        Date start = formatDateFromString(toursRequest.getStartDate());
        Date finish = formatDateFromString(toursRequest.getFinishDate());
        Tours tours = new Tours(nextVal,toursRequest.getEmployeeId(), start, finish,
                toursRequest.getHomeTheaters(), toursRequest.getHostTheaters(), toursRequest.getStagingId());
        toursRepository.save(tours);
    }

    public void deleteTours(Integer toursId) {
        Tours tours = toursRepository.getToursByTourId(toursId);
        if (tours == null) {
            //throw not found exception
        }
        toursRepository.delete(tours);
    }

    public Tours getTours(Integer toursId) {
        return toursRepository.getToursByTourId(toursId);
    }

    public void updateTours(Tours tours, Integer toursId) {
        if (toursRepository.getToursByTourId(toursId) == null) {
            //throw not found exception
        }
        tours.setTourId(toursId);
        toursRepository.save(tours);
    }

    private Date formatDateFromString(String stringDate) throws  ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd");
        return formatter.parse(stringDate);
    }
}

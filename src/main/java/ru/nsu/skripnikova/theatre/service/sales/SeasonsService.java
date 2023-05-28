package ru.nsu.skripnikova.theatre.service.sales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.skripnikova.theatre.controller.requests.SeasonsRequest;
import ru.nsu.skripnikova.theatre.entity.sales.Seasons;
import ru.nsu.skripnikova.theatre.repository.sales.SeasonsRepository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class SeasonsService {

    @Autowired
    private SeasonsRepository seasonsRepository;

    public void addSeasons(SeasonsRequest seasonsRequest) throws ParseException {
        Integer nextVal = seasonsRepository.getNextSeasonsId();
        Date start = formatDateFromString(seasonsRequest.getSessionStart());
        Date finish = formatDateFromString(seasonsRequest.getSessionFinish());
        Seasons seasons = new Seasons(nextVal, start, finish);
        seasonsRepository.save(seasons);
    }

    public void deleteSeasons(Integer seasonsId) {
        Seasons seasons = seasonsRepository.getSeasonsBySeasonId(seasonsId);
        if (seasons == null) {
            //throw not found exception
        }
        seasonsRepository.delete(seasons);
    }

    public Seasons getSeasons(Integer seasonsId) {
        return seasonsRepository.getSeasonsBySeasonId(seasonsId);
    }

    public void updateSeasons(Seasons seasons, Integer seasonsId) {
        if (seasonsRepository.getSeasonsBySeasonId(seasonsId) == null) {
            //throw not found exception
        }
        seasons.setSeasonId(seasonsId);
        seasonsRepository.save(seasons);
    }

    private Date formatDateFromString(String stringDate) throws  ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd");
        return formatter.parse(stringDate);
    }
}

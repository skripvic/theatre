package ru.nsu.skripnikova.theatre.service.repertoire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.skripnikova.theatre.controller.requests.FormForAuthorsRequest;
import ru.nsu.skripnikova.theatre.controller.requests.FormForPlaysRequest;
import ru.nsu.skripnikova.theatre.controller.requests.PlaysRequest;
import ru.nsu.skripnikova.theatre.entity.people.Employees;
import ru.nsu.skripnikova.theatre.entity.repertoire.Authors;
import ru.nsu.skripnikova.theatre.entity.repertoire.Plays;
import ru.nsu.skripnikova.theatre.repository.repertoire.PlaysRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlaysService {

    @Autowired
    private PlaysRepository playsRepository;

    public List<Plays> getAllPlays() {
        return playsRepository.getAllPlays();
    }


    public void addPlays (PlaysRequest playsRequest) {
        Integer nextVal = playsRepository.getNextPlaysId();
        Plays plays = new Plays(nextVal, playsRequest.getName(), playsRequest.getGenreId(),
                playsRequest.getAgeCategoryId(), playsRequest.getYearOfCreation(), playsRequest.getAuthorId());
        playsRepository.save(plays);
    }

    public void deletePlays (Integer playsId) {
        Plays plays = playsRepository.getPlaysByPlayId(playsId);
        if (plays == null) {
            //throw not found exception
        }
        playsRepository.delete(plays);
    }

    public Plays getPlays (Integer playsId) {
        return playsRepository.getPlaysByPlayId(playsId);
    }

    public void updateCastings (Plays plays, Integer playsId) {
        if (playsRepository.getPlaysByPlayId(playsId) == null) {
            //throw not found exception
        }
        plays.setPlayId(playsId);
        playsRepository.save(plays);
    }

    public List<Plays> getPlaysByFields(FormForPlaysRequest formForPlaysRequest) {
        Boolean isStaged = formForPlaysRequest.getIsStaged();
        Integer thisSeason = formForPlaysRequest.getThisSeason() ? 1 : 0;
        Integer alreadyShown = formForPlaysRequest.getAlreadyShown() ? 1 : 0;
        Integer genreId = formForPlaysRequest.getGenreId();
        String fromDate = formForPlaysRequest.getFromDate();
        String toDate = formForPlaysRequest.getToDate();
        Integer centuryOfCreation = formForPlaysRequest.getCenturyOfCreation();
        Integer authorId = formForPlaysRequest.getAuthorId();
        if (formForPlaysRequest.getGenreId() == null){
            genreId = -1;
        }
        if (formForPlaysRequest.getFromDate() == null){
            fromDate = null;
        }
        if (formForPlaysRequest.getToDate() == null){
            toDate = null;
        }
        if (formForPlaysRequest.getCenturyOfCreation() == null){
            centuryOfCreation = -1;
        }
        if (formForPlaysRequest.getAuthorId() == null){
            authorId = -1;
        }
        if (!isStaged && fromDate != null && toDate != null && thisSeason == 0 && alreadyShown == 0)
            return playsRepository.getPlaysByFields(genreId, centuryOfCreation, authorId);
        else
            return new ArrayList<>(playsRepository.getPlaysByFieldsStaged(thisSeason, alreadyShown, genreId, fromDate,
                toDate, centuryOfCreation, authorId));
    }
}

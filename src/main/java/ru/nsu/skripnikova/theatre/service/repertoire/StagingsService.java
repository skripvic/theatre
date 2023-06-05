package ru.nsu.skripnikova.theatre.service.repertoire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.skripnikova.theatre.controller.requests.StagingsRequest;
import ru.nsu.skripnikova.theatre.entity.people.Employees;
import ru.nsu.skripnikova.theatre.entity.repertoire.Genres;
import ru.nsu.skripnikova.theatre.entity.repertoire.Plays;
import ru.nsu.skripnikova.theatre.entity.repertoire.Stagings;
import ru.nsu.skripnikova.theatre.repository.repertoire.StagingsRepository;
import ru.nsu.skripnikova.theatre.service.people.EmployeesService;

import java.util.List;

@Service
public class StagingsService {

    @Autowired
    private StagingsRepository stagingsRepository;

    @Autowired
    private GenresService genresService;

    @Autowired
    private PlaysService playsService;

//    @Autowired
//    private EmployeesService employeesService;

    public List<Stagings> getAllStagings() {
        return stagingsRepository.getAllStagings();
    }

//    public Employees getStageWorkerById(Integer id){
//        return employeesService.getEmployeesById(id);
//    }

    public List<Genres> getAllGenres() {
        return genresService.getAllGenres();
    }

    public Plays getPlayById(Integer id){
        return playsService.getPlayById(id);
    }

    public void addStagings (StagingsRequest stagingsRequest) {
        Integer nextVal = stagingsRepository.getNextStagingsId();
        Stagings stagings = new Stagings(nextVal, stagingsRequest.getPlayId(), stagingsRequest.getDirectorId(),
                stagingsRequest.getArtDirectorId(), stagingsRequest.getConductorId(), stagingsRequest.getStartPrice());
        stagingsRepository.save(stagings);
    }

    public void deleteStagings (Integer stagingsId) {
        Stagings stagings = stagingsRepository.getStagingsByStagingId(stagingsId);
        if (stagings == null) {
            //throw not found exception
        }
        stagingsRepository.delete(stagings);
    }

    public Stagings getStagings (Integer stagingsId) {
        return stagingsRepository.getStagingsByStagingId(stagingsId);
    }

    public void updateStagings (Stagings stagings, Integer stagingsId) {
        if (stagingsRepository.getStagingsByStagingId(stagingsId) == null) {
            //throw not found exception
        }
        stagings.setStagingId(stagingsId);
        stagingsRepository.save(stagings);
    }
}

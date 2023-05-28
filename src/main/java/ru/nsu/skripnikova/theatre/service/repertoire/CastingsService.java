package ru.nsu.skripnikova.theatre.service.repertoire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.skripnikova.theatre.controller.requests.CastingsRequest;
import ru.nsu.skripnikova.theatre.entity.people.Employees;
import ru.nsu.skripnikova.theatre.entity.repertoire.Castings;
import ru.nsu.skripnikova.theatre.repository.repertoire.CastingsRepository;

import java.util.List;

@Service
public class CastingsService {

    @Autowired
    private CastingsRepository castingsRepository;

//    public List<Employees> getAllCastings() {
//        return employeesRepository.getAllEmployees();
//    }

    public void addCastings (CastingsRequest castingsRequest) {
        Integer nextVal = castingsRepository.getNextCastingId();
        Castings castings = new Castings(nextVal, castingsRequest.getRoleId(), castingsRequest.getStagingId(),
                castingsRequest.getActorId(), castingsRequest.getBackupActorId());
        castingsRepository.save(castings);
    }

    public void deleteCastings (Integer castingId) {
        Castings castings = castingsRepository.getCastingsByCastingId(castingId);
        if (castings == null) {
            //throw not found exception
        }
        castingsRepository.delete(castings);
    }

    public Castings getCastings (Integer castingId) {
        return castingsRepository.getCastingsByCastingId(castingId);
    }

    public void updateCastings (Castings castings, Integer castingId) {
        if (castingsRepository.getCastingsByCastingId(castingId) == null) {
            //throw not found exception
        }
        castings.setCastingId(castingId);
        castingsRepository.save(castings);
    }
}

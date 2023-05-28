package ru.nsu.skripnikova.theatre.service.people;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.skripnikova.theatre.entity.people.Musicians;
import ru.nsu.skripnikova.theatre.repository.people.MusiciansRepository;

@Service
public class MusiciansService {

    @Autowired
    private MusiciansRepository musiciansRepository;

    public void addMusicians (Musicians musicians) {
        musiciansRepository.save(musicians);
    }

    public void deleteMusicians (Integer musiciansId) {
        Musicians musicians = musiciansRepository.getMusiciansByMusicianId(musiciansId);
        if (musicians == null) {
            //throw not found exception
        }
        musiciansRepository.delete(musicians);
    }

    public Musicians getMusicians (Integer musiciansId) {
        return musiciansRepository.getMusiciansByMusicianId(musiciansId);
    }

    public void updateActor (Musicians musicians, Integer musiciansId) {
        if (musiciansRepository.getMusiciansByMusicianId(musiciansId) == null) {
            //throw not found exception
        }
        musicians.setMusicianId(musiciansId);
        musiciansRepository.save(musicians);
    }
}

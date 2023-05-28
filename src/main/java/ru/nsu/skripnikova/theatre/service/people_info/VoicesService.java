package ru.nsu.skripnikova.theatre.service.people_info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.skripnikova.theatre.entity.people_info.Voices;
import ru.nsu.skripnikova.theatre.repository.people_info.VoicesRepository;

@Service
public class VoicesService {

    @Autowired
    private VoicesRepository voicesRepository;

    public void addVoices (Voices voices) {
        voicesRepository.save(voices);
    }

    public void deleteVoices (Integer voicesId) {
        Voices voices = voicesRepository.getVoicesByVoiceId(voicesId);
        if (voices == null) {
            //throw not found exception
        }
        voicesRepository.delete(voices);
    }

    public Voices getVoices (Integer voicesId) {
        return voicesRepository.getVoicesByVoiceId(voicesId);
    }

    public void updateVoices (Voices voices, Integer voicesId) {
        if (voicesRepository.getVoicesByVoiceId(voicesId) == null) {
            //throw not found exception
        }
        voices.setVoiceId(voicesId);
        voicesRepository.save(voices);
    }
}

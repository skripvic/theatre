package ru.nsu.skripnikova.theatre.repository.people_info;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nsu.skripnikova.theatre.entity.people_info.Voices;

@Repository
public interface VoicesRepository extends JpaRepository<Voices, Integer> {

    Voices getVoicesByVoiceId (Integer voicesId);
}

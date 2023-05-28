package ru.nsu.skripnikova.theatre.repository.people;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nsu.skripnikova.theatre.entity.people.Musicians;

@Repository
public interface MusiciansRepository extends JpaRepository<Musicians, Integer> {

    Musicians getMusiciansByMusicianId (Integer musiciansId);
}

package ru.nsu.skripnikova.theatre.repository.people_info;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nsu.skripnikova.theatre.entity.people_info.ActorTitle;

@Repository
public interface ActorTitleRepository extends JpaRepository<ActorTitle, Integer> {

    ActorTitle getActorTitleByActorId (Integer actorId);
}

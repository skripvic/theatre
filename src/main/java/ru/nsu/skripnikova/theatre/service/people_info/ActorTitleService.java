package ru.nsu.skripnikova.theatre.service.people_info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.skripnikova.theatre.entity.people_info.ActorTitle;
import ru.nsu.skripnikova.theatre.repository.people_info.ActorTitleRepository;

@Service
public class ActorTitleService {

    @Autowired
    private ActorTitleRepository actorTitleRepository;

    public void addActorTitle (ActorTitle actorTitle) {
        actorTitleRepository.save(actorTitle);
    }

    public void deleteActorTitle (Integer actorTitleId) {
        ActorTitle actorTitle = actorTitleRepository.getActorTitleByActorId(actorTitleId);
        if (actorTitle == null) {
            //throw not found exception
        }
        actorTitleRepository.delete(actorTitle);
    }

    public ActorTitle getActorTitle (Integer actorTitleId) {
        return actorTitleRepository.getActorTitleByActorId(actorTitleId);
    }

    public void updateActorTitle (ActorTitle actorTitle, Integer actorTitleId) {
        if (actorTitleRepository.getActorTitleByActorId(actorTitleId) == null) {
            //throw not found exception
        }
        actorTitle.setTitleId(actorTitleId);
        actorTitleRepository.save(actorTitle);
    }
}

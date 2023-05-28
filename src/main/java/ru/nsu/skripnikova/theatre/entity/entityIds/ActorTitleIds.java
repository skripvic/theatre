package ru.nsu.skripnikova.theatre.entity.entityIds;

import java.io.Serializable;

public class ActorTitleIds implements Serializable {

    private Integer titleId;

    private Integer actorId;

    public ActorTitleIds() {
    }

    public ActorTitleIds(Integer titleId, Integer actorId) {
        this.titleId = titleId;
        this.actorId = actorId;
    }
}

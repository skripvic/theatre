package ru.nsu.skripnikova.theatre.entity.people_info;

import ru.nsu.skripnikova.theatre.entity.entityIds.ActorTitleIds;

import javax.persistence.*;

@Entity
@IdClass(ActorTitleIds.class)
@Table(name = "ACTOR_TITLE")
public class ActorTitle {

    @Id
    @Column(name = "TITLE_ID")
    private Integer titleId;

    @Id
    @Column(name = "ACTOR_ID")
    private Integer actorId;

    public Integer getTitleId() {
        return titleId;
    }

    public void setTitleId(Integer titleId) {
        this.titleId = titleId;
    }

    public Integer getActorId() {
        return actorId;
    }

    public void setActorId(Integer actorId) {
        this.actorId = actorId;
    }
}

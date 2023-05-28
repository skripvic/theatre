package ru.nsu.skripnikova.theatre.entity.people;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ACTORS")
public class Actors {

    @Id
    @Column(name = "ACTOR_ID")
    private Integer actorId;

    @Column(name = "VOICE_ID")
    private Integer voiceId;

    @Column(name = "HEIGHT")
    private Integer height;

    @Column(name = "BODY_BUILD_ID")
    private Integer bodyBuildId;

    public Integer getActorId() {
        return actorId;
    }

    public void setActorId(Integer actorId) {
        this.actorId = actorId;
    }

    public Integer getVoiceId() {
        return voiceId;
    }

    public void setVoiceId(Integer voiceId) {
        this.voiceId = voiceId;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getBodyBuildId() {
        return bodyBuildId;
    }

    public void setBodyBuildId(Integer bodyBuildId) {
        this.bodyBuildId = bodyBuildId;
    }
}

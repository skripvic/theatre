package ru.nsu.skripnikova.theatre.controller.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ActorsRequest {

    @JsonProperty(value = "actorId")
    private Integer actorId;

    @JsonProperty(value = "voiceId")
    private Integer voiceId;

    @JsonProperty(value = "height")
    private Integer height;

    @JsonProperty(value = "bodyBuildId")
    private Integer bodyBuildId;

    public Integer getVoiceId() {
        return voiceId;
    }

    public Integer getActorId() {
        return actorId;
    }

    public void setActorId(Integer actorId) {
        this.actorId = actorId;
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

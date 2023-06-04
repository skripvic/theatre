package ru.nsu.skripnikova.theatre.controller.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;

public class StageWorkerRequest {

    @JsonProperty(value = "stageWorkerId")
    private Integer stageWorkerId;

    @JsonProperty(value = "typeId")
    private Integer typeId;

    @JsonProperty(value = "experience")
    private String experience;

    public Integer getStageWorkerId() {
        return stageWorkerId;
    }

    public void setStageWorkerId(Integer stageWorkerId) {
        this.stageWorkerId = stageWorkerId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}

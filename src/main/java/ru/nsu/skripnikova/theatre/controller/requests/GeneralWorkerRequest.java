package ru.nsu.skripnikova.theatre.controller.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;

public class GeneralWorkerRequest {

    @JsonProperty(value = "generalWorkerId")
    private Integer generalWorkerId;

    @JsonProperty(value = "experience")
    private String experience;

    public Integer getGeneralWorkerId() {
        return generalWorkerId;
    }

    public void setGeneralWorkerId(Integer generalWorkerId) {
        this.generalWorkerId = generalWorkerId;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

}

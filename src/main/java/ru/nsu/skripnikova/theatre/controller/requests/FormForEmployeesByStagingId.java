package ru.nsu.skripnikova.theatre.controller.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FormForEmployeesByStagingId {

    @JsonProperty(value = "stagingId")
    private Integer stagingId;

    public Integer getStagingId() {
        return stagingId;
    }

    public void setStagingId(Integer stagingId) {
        this.stagingId = stagingId;
    }
}

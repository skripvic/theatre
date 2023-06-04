package ru.nsu.skripnikova.theatre.controller.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StagingsPlaysRequest {

    @JsonProperty(value = "stagingId")
    private Integer stagingId;

    @JsonProperty(value = "name")
    private String name;

    public Integer getStagingId() {
        return stagingId;
    }

    public void setStagingId(Integer stagingId) {
        this.stagingId = stagingId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

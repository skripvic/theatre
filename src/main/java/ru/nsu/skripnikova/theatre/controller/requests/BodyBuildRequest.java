package ru.nsu.skripnikova.theatre.controller.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BodyBuildRequest {

    @JsonProperty(value = "bodyBuild")
    private String  bodyBuild;

    @JsonProperty(value = "description")
    private String description;

    public String getBodyBuild() {
        return bodyBuild;
    }

    public void setBodyBuild(String bodyBuild) {
        this.bodyBuild = bodyBuild;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

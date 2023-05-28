package ru.nsu.skripnikova.theatre.controller.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SeasonsRequest {

    @JsonProperty(value = "sessionStart")
    private String sessionStart;

    @JsonProperty(value = "sessionFinish")
    private String sessionFinish;

    public String getSessionStart() {
        return sessionStart;
    }

    public void setSessionStart(String sessionStart) {
        this.sessionStart = sessionStart;
    }

    public String getSessionFinish() {
        return sessionFinish;
    }

    public void setSessionFinish(String sessionFinish) {
        this.sessionFinish = sessionFinish;
    }
}

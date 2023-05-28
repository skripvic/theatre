package ru.nsu.skripnikova.theatre.controller.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FormForFreeSeatsRequest {

    @JsonProperty(value = "showDateId")
    private Integer showDateId;

    public Integer getShowDateId() {
        return showDateId;
    }

    public void setShowDateId(Integer showDateId) {
        showDateId = showDateId;
    }
}

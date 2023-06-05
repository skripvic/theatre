package ru.nsu.skripnikova.theatre.controller.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class ShowDatePlayRequest {

    @JsonProperty(value = "showDateId")
    private Integer showDateId;

    @JsonProperty(value = "showDate")
    private Date showDate;

    @JsonProperty(value = "name")
    private String name;

    public Integer getShowDateId() {
        return showDateId;
    }

    public void setShowDateId(Integer showDateId) {
        this.showDateId = showDateId;
    }

    public Date getShowDate() {
        return showDate;
    }

    public void setShowDate(Date showDate) {
        this.showDate = showDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

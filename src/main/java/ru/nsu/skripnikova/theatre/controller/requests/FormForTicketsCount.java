package ru.nsu.skripnikova.theatre.controller.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FormForTicketsCount {
    @JsonProperty(value = "playId")
    private Integer playId;

    @JsonProperty(value = "fromDate")
    private String fromDate;

    @JsonProperty(value = "toDate")
    private String toDate;

    @JsonProperty(value = "isPremiere")
    private Boolean isPremiere;

    public Boolean getIsPremiere() {
        return isPremiere;
    }

    public void setIsPremiere(Boolean isPremiere) {
        this.isPremiere = isPremiere;
    }

    public Integer getPlayId() {
        return playId;
    }

    public void setPlayId(Integer playId) {
        this.playId = playId;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }
}

package ru.nsu.skripnikova.theatre.controller.requests;

import com.fasterxml.jackson.annotation.JsonProperty;


public class StagingsRequest {

    @JsonProperty(value = "playId")
    private Integer playId;

    @JsonProperty(value = "directorId")
    private Integer directorId;

    @JsonProperty(value =  "artDirectorId")
    private Integer artDirectorId;

    @JsonProperty(value =  "conductorId")
    private Integer conductorId;

    @JsonProperty(value =  "startPrice")
    private Integer startPrice;

    public Integer getPlayId() {
        return playId;
    }

    public void setPlayId(Integer playId) {
        this.playId = playId;
    }

    public Integer getDirectorId() {
        return directorId;
    }

    public void setDirectorId(Integer directorId) {
        this.directorId = directorId;
    }

    public Integer getArtDirectorId() {
        return artDirectorId;
    }

    public void setArtDirectorId(Integer artDirectorId) {
        this.artDirectorId = artDirectorId;
    }

    public Integer getConductorId() {
        return conductorId;
    }

    public void setConductorId(Integer conductorId) {
        this.conductorId = conductorId;
    }

    public Integer getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(Integer startPrice) {
        this.startPrice = startPrice;
    }
}

package ru.nsu.skripnikova.theatre.controller.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;

public class MusiciansRequest {

    @JsonProperty(value = "musicianId")
    private Integer musicianId;

    @JsonProperty(value = "instrument")
    private String instrument;

    @JsonProperty(value = "musicExperience")
    private String musicExperience;

    public Integer getMusicianId() {
        return musicianId;
    }

    public void setMusicianId(Integer musicianId) {
        this.musicianId = musicianId;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public String getMusicExperience() {
        return musicExperience;
    }

    public void setMusicExperience(String musicExperience) {
        this.musicExperience = musicExperience;
    }
}

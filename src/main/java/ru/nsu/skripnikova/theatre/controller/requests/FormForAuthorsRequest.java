package ru.nsu.skripnikova.theatre.controller.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FormForAuthorsRequest {

    @JsonProperty(value = "genreId")
    private Integer genreId;

    @JsonProperty(value = "century")
    private Integer century;

    @JsonProperty(value = "country")
    private String country;


    public Integer getGenreId() {
        return genreId;
    }

    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
    }

    public Integer getCentury() {
        return century;
    }

    public void setCentury(Integer century) {
        this.century = century;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}

package ru.nsu.skripnikova.theatre.controller.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FormForRolesByFields {

    @JsonProperty(value = "actorId")
    private Integer actorId;

    @JsonProperty(value = "directorId")
    private Integer directorId;

    @JsonProperty(value = "genreId")
    private Integer genreId;

    @JsonProperty(value = "ageCategoryId")
    private Integer ageCategoryId;

    @JsonProperty(value = "fromDate")
    private String fromDate;

    @JsonProperty(value = "toDate")
    private String toDate;

    public Integer getActorId() {
        return actorId;
    }

    public void setActorId(Integer actorId) {
        this.actorId = actorId;
    }

    public Integer getDirectorId() {
        return directorId;
    }

    public void setDirectorId(Integer directorId) {
        this.directorId = directorId;
    }

    public Integer getGenreId() {
        return genreId;
    }

    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
    }

    public Integer getAgeCategoryId() {
        return ageCategoryId;
    }

    public void setAgeCategoryId(Integer ageCategoryId) {
        this.ageCategoryId = ageCategoryId;
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

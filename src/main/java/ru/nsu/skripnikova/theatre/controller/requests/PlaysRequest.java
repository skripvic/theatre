package ru.nsu.skripnikova.theatre.controller.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlaysRequest {

    @JsonProperty(value = "name")
    private String name;

    @JsonProperty(value = "genreId")
    private Integer genreId;

    @JsonProperty(value = "ageCategoryId")
    private Integer ageCategoryId;

    @JsonProperty(value = "yearOfCreation")
    private Integer yearOfCreation;

    @JsonProperty(value = "authorId")
    private Integer authorId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Integer getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(Integer yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }
}

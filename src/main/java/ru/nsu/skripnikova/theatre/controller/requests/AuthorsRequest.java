package ru.nsu.skripnikova.theatre.controller.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AuthorsRequest {

    @JsonProperty(value = "fullName")
    private String fullName;

    @JsonProperty(value = "dateOfBirth")
    private String dateOfBirth;

    @JsonProperty(value = "dateOfDeath")
    private String dateOfDeath;

    @JsonProperty(value = "country")
    private String country;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(String dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

package ru.nsu.skripnikova.theatre.controller.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FormForPlaysRequest {

    @JsonProperty(value = "isStaged")
    private Boolean isStaged;

    @JsonProperty(value = "thisSeason")
    private Boolean thisSeason;

    @JsonProperty(value = "alreadyShown")
    private Boolean alreadyShown;

    @JsonProperty(value = "genreId")
    private Integer genreId;

    @JsonProperty(value = "fromDate")
    private String fromDate;

    @JsonProperty(value = "toDate")
    private String toDate;

    @JsonProperty(value = "centuryOfCreation")
    private Integer centuryOfCreation;

    @JsonProperty(value = "authorId")
    private Integer authorId;

    public Integer getCenturyOfCreation() {
        return centuryOfCreation;
    }

    public void setCenturyOfCreation(Integer centuryOfCreation) {
        this.centuryOfCreation = centuryOfCreation;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Boolean getThisSeason() {
        return thisSeason;
    }

    public void setThisSeason(Boolean thisSeason) {
        this.thisSeason = thisSeason;
    }

    public Boolean getAlreadyShown() {
        return alreadyShown;
    }

    public void setAlreadyShown(Boolean alreadyShown) {
        this.alreadyShown = alreadyShown;
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

    public Integer getGenreId() {
        return genreId;
    }

    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
    }

    public Boolean getIsStaged() {
        return isStaged;
    }

    public void setIsStaged(Boolean staged) {
        isStaged = staged;
    }


}

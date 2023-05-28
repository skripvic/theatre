package ru.nsu.skripnikova.theatre.controller.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FormForEmployeesByTourRequest {

    @JsonProperty(value = "isFromHome")
    private Boolean isFromHome;

    @JsonProperty(value = "fromDate")
    private String fromDate;

    @JsonProperty(value = "toDate")
    private String toDate;


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

    public Boolean getIsFromHome() {
        return isFromHome;
    }

    public void setIsFromHome(Boolean fromHome) {
        isFromHome = fromHome;
    }

}

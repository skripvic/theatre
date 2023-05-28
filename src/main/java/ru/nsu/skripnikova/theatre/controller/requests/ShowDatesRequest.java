package ru.nsu.skripnikova.theatre.controller.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ShowDatesRequest {

    @JsonProperty(value = "showDate")
    private String showDate;

    @JsonProperty(value = "stagingId")
    private Integer stagingId;

    @JsonProperty(value = "priceFactor")
    private Float priceFactor;

    public String getShowDate() {
        return showDate;
    }

    public void setShowDate(String showDate) {
        this.showDate = showDate;
    }

    public Integer getStagingId() {
        return stagingId;
    }

    public void setStagingId(Integer stagingId) {
        this.stagingId = stagingId;
    }

    public Float getPriceFactor() {
        return priceFactor;
    }

    public void setPriceFactor(Float priceFactor) {
        this.priceFactor = priceFactor;
    }
}

package ru.nsu.skripnikova.theatre.controller.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TicketsRequest {

    @JsonProperty(value = "seatId")
    private Integer seatId;

    @JsonProperty(value = "showDateId")
    private Integer showDateId;

    @JsonProperty(value = "finalPrice")
    private Integer finalPrice;

    @JsonProperty(value = "isReturned")
    private Integer isReturned;

    public Integer getSeatId() {
        return seatId;
    }

    public void setSeatId(Integer seatId) {
        this.seatId = seatId;
    }

    public Integer getShowDateId() {
        return showDateId;
    }

    public void setShowDateId(Integer showDateId) {
        this.showDateId = showDateId;
    }

    public Integer getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(Integer finalPrice) {
        this.finalPrice = finalPrice;
    }

    public Integer getIsReturned() {
        return isReturned;
    }

    public void setIsReturned(Integer isReturned) {
        this.isReturned = isReturned;
    }
}

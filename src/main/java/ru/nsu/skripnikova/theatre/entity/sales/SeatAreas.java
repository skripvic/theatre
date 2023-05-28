package ru.nsu.skripnikova.theatre.entity.sales;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SEAT_AREAS")
public class SeatAreas {

    @Id
    @Column(name = "SEAT_AREA_ID")
    private Integer seatAreaId;

    @Column(name = "SEAT_AREA")
    private String seatArea;

    @Column(name = "PRICE_FACTOR")
    private Float priceFactor;

    public Integer getSeatAreaId() {
        return seatAreaId;
    }

    public void setSeatAreaId(Integer seatAreaId) {
        this.seatAreaId = seatAreaId;
    }

    public String getSeatArea() {
        return seatArea;
    }

    public void setSeatArea(String seatArea) {
        this.seatArea = seatArea;
    }

    public Float getPriceFactor() {
        return priceFactor;
    }

    public void setPriceFactor(Float priceFactor) {
        this.priceFactor = priceFactor;
    }
}

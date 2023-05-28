package ru.nsu.skripnikova.theatre.entity.sales;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SEATS")
public class Seats {

    @Id
    @Column(name = "SEAT_ID")
    private Integer seatId;

    @Column(name = "ROW_NUMBER")
    private Integer rowNumber;

    @Column(name = "SEAT_NUMBER")
    private Integer seatNumber;

    @Column(name = "SEAT_AREA_ID")
    private Integer seatAreaId;

    public Integer getSeatId() {
        return seatId;
    }

    public void setSeatId(Integer seatId) {
        this.seatId = seatId;
    }

    public Integer getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(Integer rowNumber) {
        this.rowNumber = rowNumber;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Integer getSeatAreaId() {
        return seatAreaId;
    }

    public void setSeatAreaId(Integer seatAreaId) {
        this.seatAreaId = seatAreaId;
    }
}

package ru.nsu.skripnikova.theatre.entity.sales;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TICKETS")
public class Tickets {

    public Tickets() {
    }

    public Tickets(Integer ticketId, Integer seatId, Integer showDateId, Integer finalPrice, Integer isReturned) {
        this.ticketId = ticketId;
        this.seatId = seatId;
        this.showDateId = showDateId;
        this.finalPrice = finalPrice;
        this.isReturned = isReturned;
    }

    @Id
    @Column(name = "TICKET_ID")
    private Integer ticketId;

    @Column(name = "SEAT_ID")
    private Integer seatId;

    @Column(name = "SHOW_DATE_ID")
    private Integer showDateId;

    @Column(name = "FINAL_PRICE")
    private Integer finalPrice;

    @Column(name = "IS_RETURNED")
    private Integer isReturned;

    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

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

package ru.nsu.skripnikova.theatre.entity.sales;

import ru.nsu.skripnikova.theatre.entity.entityIds.SeasonTicketTicketIds;

import javax.persistence.*;

@Entity
@IdClass(SeasonTicketTicketIds.class)
@Table(name = "SEASON_TICKET_TICKET")
public class SeasonTicketTicket {

    @Id
    @Column(name = "SEASON_TICKET_ID")
    private Integer seasonTicketId;

    @Id
    @Column(name = "TICKET_ID")
    private Integer ticketId;

    public Integer getSeasonTicketId() {
        return seasonTicketId;
    }

    public void setSeasonTicketId(Integer seasonTicketId) {
        this.seasonTicketId = seasonTicketId;
    }

    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }
}

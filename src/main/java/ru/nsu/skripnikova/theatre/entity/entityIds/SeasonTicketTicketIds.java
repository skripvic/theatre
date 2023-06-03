package ru.nsu.skripnikova.theatre.entity.entityIds;

import java.io.Serializable;

public class SeasonTicketTicketIds implements Serializable {

    private Integer seasonTicketId;

    private Integer ticketId;
    public SeasonTicketTicketIds() {
    }
    public SeasonTicketTicketIds(Integer seasonTicketId, Integer ticketId) {
        this.seasonTicketId = seasonTicketId;
        this.ticketId = ticketId;
    }
}

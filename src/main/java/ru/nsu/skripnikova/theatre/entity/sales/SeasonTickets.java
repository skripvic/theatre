package ru.nsu.skripnikova.theatre.entity.sales;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SEASON_TICKETS")
public class SeasonTickets {

    public SeasonTickets() {
    }

    public SeasonTickets(Integer seasonTicketId, String description, Integer authorID, Integer genreId, Integer price) {
        this.seasonTicketId = seasonTicketId;
        this.description = description;
        this.authorID = authorID;
        this.genreId = genreId;
        this.price = price;
    }

    @Id
    @Column(name = "SEASON_TICKET_ID")
    private Integer seasonTicketId;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "AUTHOR_ID")
    private Integer authorID;

    @Column(name = "GENRE_ID")
    private Integer genreId;

    @Column(name = "PRICE")
    private Integer price;

    public Integer getSeasonTicketId() {
        return seasonTicketId;
    }

    public void setSeasonTicketId(Integer seasonTicketId) {
        this.seasonTicketId = seasonTicketId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAuthorID() {
        return authorID;
    }

    public void setAuthorID(Integer authorID) {
        this.authorID = authorID;
    }

    public Integer getGenreId() {
        return genreId;
    }

    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}

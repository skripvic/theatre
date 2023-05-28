package ru.nsu.skripnikova.theatre.entity.repertoire;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STAGINGS")
public class Stagings {

    public Stagings() {
    }

    public Stagings(Integer stagingId, Integer playId, Integer directorId, Integer artDirectorId, Integer conductorId, Integer startPrice) {
        this.stagingId = stagingId;
        this.playId = playId;
        this.directorId = directorId;
        this.artDirectorId = artDirectorId;
        this.conductorId = conductorId;
        this.startPrice = startPrice;
    }

    @Id
    @Column(name = "STAGING_ID")
    private Integer stagingId;

    @Column(name = "PLAY_ID")
    private Integer playId;

    @Column(name = "DIRECTOR_ID")
    private Integer directorId;

    @Column(name = "ART_DIRECTOR_ID")
    private Integer artDirectorId;

    @Column(name = "CONDUCTOR_ID")
    private Integer conductorId;

    @Column(name = "START_PRICE")
    private Integer startPrice;

    public Integer getStagingId() {
        return stagingId;
    }

    public void setStagingId(Integer stagingId) {
        this.stagingId = stagingId;
    }

    public Integer getPlayId() {
        return playId;
    }

    public void setPlayId(Integer playId) {
        this.playId = playId;
    }

    public Integer getDirectorId() {
        return directorId;
    }

    public void setDirectorId(Integer directorId) {
        this.directorId = directorId;
    }

    public Integer getArtDirectorId() {
        return artDirectorId;
    }

    public void setArtDirectorId(Integer artDirectorId) {
        this.artDirectorId = artDirectorId;
    }

    public Integer getConductorId() {
        return conductorId;
    }

    public void setConductorId(Integer conductorId) {
        this.conductorId = conductorId;
    }

    public Integer getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(Integer startPrice) {
        this.startPrice = startPrice;
    }
}

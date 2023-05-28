package ru.nsu.skripnikova.theatre.entity.sales;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "SEASONS")
public class Seasons {

    public Seasons() {
    }

    public Seasons(Integer seasonId, Date sessionStart, Date sessionFinish) {
        this.seasonId = seasonId;
        this.sessionStart = sessionStart;
        this.sessionFinish = sessionFinish;
    }

    @Id
    @Column(name = "SEASON_ID")
    private Integer seasonId;

    @Column(name = "SEASON_START")
    private Date sessionStart;

    @Column(name = "SEASON_FINISH")
    private Date sessionFinish;

    public Integer getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(Integer seasonId) {
        this.seasonId = seasonId;
    }

    public Date getSessionStart() {
        return sessionStart;
    }

    public void setSessionStart(Date sessionStart) {
        this.sessionStart = sessionStart;
    }

    public Date getSessionFinish() {
        return sessionFinish;
    }

    public void setSessionFinish(Date sessionFinish) {
        this.sessionFinish = sessionFinish;
    }
}

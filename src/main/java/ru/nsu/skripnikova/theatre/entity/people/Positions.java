package ru.nsu.skripnikova.theatre.entity.people;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "POSITIONS")
public class Positions {

    @Id
    @Column(name = "POSITION_ID")
    private Integer positionId;

    @Column(name = "POSITION")
    private String position;

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}

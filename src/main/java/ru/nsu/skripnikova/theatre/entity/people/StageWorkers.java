package ru.nsu.skripnikova.theatre.entity.people;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STAGE_WORKERS")
public class StageWorkers {

    public StageWorkers() {
    }

    public StageWorkers(Integer stageWorkerId, Integer typeId, String experience) {
        this.stageWorkerId = stageWorkerId;
        this.typeId = typeId;
        this.experience = experience;
    }

    @Id
    @Column(name = "STAGE_WORKER_ID")
    private Integer stageWorkerId;

    @Column(name = "TYPE_ID")
    private Integer typeId;

    @Column(name = "EXPERIENCE")
    private String experience;

    public Integer getStageWorkerId() {
        return stageWorkerId;
    }

    public void setStageWorkerId(Integer stageWorkerId) {
        this.stageWorkerId = stageWorkerId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}

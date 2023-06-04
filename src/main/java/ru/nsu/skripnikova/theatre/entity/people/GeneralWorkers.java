package ru.nsu.skripnikova.theatre.entity.people;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GENERAL_WORKERS")
public class GeneralWorkers {

    public GeneralWorkers() {
    }

    public GeneralWorkers(Integer generalWorkerId, String experience) {
        this.generalWorkerId = generalWorkerId;
        this.experience = experience;
    }

    @Id
    @Column(name = "GENERAL_WORKER_ID")
    private Integer generalWorkerId;

    @Column(name = "EXPERIENCE")
    private String experience;

    public Integer getGeneralWorkerId() {
        return generalWorkerId;
    }

    public void setGeneralWorkerId(Integer generalWorkerId) {
        this.generalWorkerId = generalWorkerId;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}

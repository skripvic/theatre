package ru.nsu.skripnikova.theatre.entity.people_info;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BODY_BUILD")
public class BodyBuild {

    public BodyBuild() {
    }

    public BodyBuild(Integer bodyBuildId, String bodyBuild, String description) {
        this.bodyBuildId = bodyBuildId;
        this.bodyBuild = bodyBuild;
        this.description = description;
    }

    @Id
    @Column(name = "BODY_BUILD_ID")
    private Integer bodyBuildId;

    @Column(name = "BODY_BUILD")
    private String  bodyBuild;

    @Column(name = "DESCRIPTION")
    private String description;

    public Integer getBodyBuildId() {
        return bodyBuildId;
    }

    public void setBodyBuildId(Integer bodyBuildId) {
        this.bodyBuildId = bodyBuildId;
    }

    public String getBodyBuild() {
        return bodyBuild;
    }

    public void setBodyBuild(String bodyBuild) {
        this.bodyBuild = bodyBuild;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

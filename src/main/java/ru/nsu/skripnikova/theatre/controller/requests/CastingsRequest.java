package ru.nsu.skripnikova.theatre.controller.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CastingsRequest {

    @JsonProperty(value = "roleId")
    private Integer roleId;

    @JsonProperty(value = "stagingId")
    private Integer stagingId;

    @JsonProperty(value = "actorId")
    private Integer actorId;

    @JsonProperty(value = "backupActorId")
    private Integer backupActorId;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getStagingId() {
        return stagingId;
    }

    public void setStagingId(Integer stagingId) {
        this.stagingId = stagingId;
    }

    public Integer getActorId() {
        return actorId;
    }

    public void setActorId(Integer actorId) {
        this.actorId = actorId;
    }

    public Integer getBackupActorId() {
        return backupActorId;
    }

    public void setBackupActorId(Integer backupActorId) {
        this.backupActorId = backupActorId;
    }
}

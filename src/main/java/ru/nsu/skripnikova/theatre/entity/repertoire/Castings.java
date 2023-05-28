package ru.nsu.skripnikova.theatre.entity.repertoire;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CASTINGS")
public class Castings {

    public Castings() {
    }

    public Castings(Integer castingId, Integer roleId, Integer stagingId, Integer actorId, Integer backupActorId) {
        this.castingId = castingId;
        this.roleId = roleId;
        this.stagingId = stagingId;
        this.actorId = actorId;
        this.backupActorId = backupActorId;
    }

    @Id
    @Column(name = "CASTING_ID")
    private Integer castingId;

    @Column(name = "ROLE_ID")
    private Integer roleId;

    @Column(name = "STAGING_ID")
    private Integer stagingId;

    @Column(name = "ACTOR_ID")
    private Integer actorId;

    @Column(name = "BACKUP_ACTOR_ID")
    private Integer backupActorId;

    public Integer getCastingId() {
        return castingId;
    }

    public void setCastingId(Integer castingId) {
        this.castingId = castingId;
    }

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

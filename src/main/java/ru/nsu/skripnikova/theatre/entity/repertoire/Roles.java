package ru.nsu.skripnikova.theatre.entity.repertoire;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ROLES")
public class Roles {

    public Roles() {
    }

    public Roles(Integer roleId,
                 String roleName,
                 Integer voiceId,
                 Integer playId,
                 String sex,
                 Integer bodyBuildId,
                 Integer minHeight,
                 Integer maxHeight,
                 Integer minAge,
                 Integer maxAge) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.voiceId = voiceId;
        this.playId = playId;
        this.sex = sex;
        this.bodyBuildId = bodyBuildId;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        this.minAge = minAge;
        this.maxAge = maxAge;
    }

    @Id
    @Column(name = "ROLE_ID")
    private Integer roleId;

    @Column(name = "ROLE_NAME")
    private String roleName;

    @Column(name = "VOICE_ID")
    private Integer voiceId;

    @Column(name = "PLAY_ID")
    private Integer playId;

    @Column(name = "SEX")
    private String sex;

    @Column(name = "BODY_BUILD_ID")
    private Integer bodyBuildId;

    @Column(name = "MIN_HEIGHT")
    private Integer minHeight;

    @Column(name = "MAX_HEIGHT")
    private Integer maxHeight;

    @Column(name = "MIN_AGE")
    private Integer minAge;

    @Column(name = "MAX_AGE")
    private Integer maxAge;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getVoiceId() {
        return voiceId;
    }

    public void setVoiceId(Integer voiceId) {
        this.voiceId = voiceId;
    }

    public Integer getPlayId() {
        return playId;
    }

    public void setPlayId(Integer playId) {
        this.playId = playId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getBodyBuildId() {
        return bodyBuildId;
    }

    public void setBodyBuildId(Integer bodyBuildId) {
        this.bodyBuildId = bodyBuildId;
    }

    public Integer getMinHeight() {
        return minHeight;
    }

    public void setMinHeight(Integer minHeight) {
        this.minHeight = minHeight;
    }

    public Integer getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(Integer maxHeight) {
        this.maxHeight = maxHeight;
    }

    public Integer getMinAge() {
        return minAge;
    }

    public void setMinAge(Integer minAge) {
        this.minAge = minAge;
    }

    public Integer getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
    }
}

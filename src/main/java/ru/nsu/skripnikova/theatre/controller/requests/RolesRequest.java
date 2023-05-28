package ru.nsu.skripnikova.theatre.controller.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RolesRequest {

    @JsonProperty(value = "roleName")
    private String roleName;

    @JsonProperty(value = "voiceId")
    private Integer voiceId;

    @JsonProperty(value = "playId")
    private Integer playId;

    @JsonProperty(value = "sex")
    private String sex;

    @JsonProperty(value = "bodyBuildId")
    private Integer bodyBuildId;

    @JsonProperty(value = "minHeight")
    private Integer minHeight;

    @JsonProperty(value = "maxHeight")
    private Integer maxHeight;

    @JsonProperty(value = "minAge")
    private Integer minAge;

    @JsonProperty(value = "maxAge")
    private Integer maxAge;

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

package ru.nsu.skripnikova.theatre.controller.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FormForActorsRequest {

    @JsonProperty(value = "roleId")
    private Integer roleId;

    @JsonProperty(value = "isVoiceCorrect")
    private Boolean isVoiceCorrect;

    @JsonProperty(value = "isBodyBuildCorrect")
    private Boolean isBodyBuildCorrect;

    @JsonProperty(value = "isMinHeightCorrect")
    private Boolean isMinHeightCorrect;

    @JsonProperty(value = "isMaxHeightCorrect")
    private Boolean isMaxHeightCorrect;

    @JsonProperty(value = "isMinAgeCorrect")
    private Boolean isMinAgeCorrect;

    @JsonProperty(value = "isMaxAgeCorrect")
    private Boolean isMaxAgeCorrect;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Boolean getIsVoiceCorrect() {
        return isVoiceCorrect;
    }

    public void setIsVoiceCorrect(Boolean isVoiceCorrect) {
        this.isVoiceCorrect = isVoiceCorrect;
    }

    public Boolean getIsBodyBuildCorrect() {
        return isBodyBuildCorrect;
    }

    public void setIsBodyBuildCorrect(Boolean isBodyBuildCorrect) {
        this.isBodyBuildCorrect = isBodyBuildCorrect;
    }

    public Boolean getIsMinHeightCorrect() {
        return isMinHeightCorrect;
    }

    public void setIsMinHeightCorrect(Boolean isMinHeightCorrect) {
        this.isMinHeightCorrect = isMinHeightCorrect;
    }

    public Boolean getIsMaxHeightCorrect() {
        return isMaxHeightCorrect;
    }

    public void setIsMaxHeightCorrect(Boolean isMaxHeightCorrect) {
        this.isMaxHeightCorrect = isMaxHeightCorrect;
    }

    public Boolean getIsMinAgeCorrect() {
        return isMinAgeCorrect;
    }

    public void setIsMinAgeCorrect(Boolean isMinAgeCorrect) {
        this.isMinAgeCorrect = isMinAgeCorrect;
    }

    public Boolean getIsMaxAgeCorrect() {
        return isMaxAgeCorrect;
    }

    public void setIsMaxAgeCorrect(Boolean isMaxAgeCorrect) {
        this.isMaxAgeCorrect = isMaxAgeCorrect;
    }
}

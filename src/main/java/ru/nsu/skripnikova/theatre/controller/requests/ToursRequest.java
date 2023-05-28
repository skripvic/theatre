package ru.nsu.skripnikova.theatre.controller.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import java.util.Date;

public class ToursRequest {

    @JsonProperty(value = "employeeId")
    private Integer employeeId;

    @JsonProperty(value = "startDate")
    private String startDate;

    @JsonProperty(value = "finishDate")
    private String finishDate;

    @JsonProperty(value = "homeTheaters")
    private String homeTheaters;

    @JsonProperty(value = "hostTheaters")
    private String hostTheaters;

    @JsonProperty(value = "stagingId")
    private Integer stagingId;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }

    public String getHomeTheaters() {
        return homeTheaters;
    }

    public void setHomeTheaters(String homeTheaters) {
        this.homeTheaters = homeTheaters;
    }

    public String getHostTheaters() {
        return hostTheaters;
    }

    public void setHostTheaters(String hostTheaters) {
        this.hostTheaters = hostTheaters;
    }

    public Integer getStagingId() {
        return stagingId;
    }

    public void setStagingId(Integer stagingId) {
        this.stagingId = stagingId;
    }
}

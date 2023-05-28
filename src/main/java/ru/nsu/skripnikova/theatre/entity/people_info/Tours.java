package ru.nsu.skripnikova.theatre.entity.people_info;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "TOURS")
public class Tours {

    public Tours() {
    }

    public Tours(Integer tourId,
                 Integer employeeId,
                 Date startDate,
                 Date finishDate,
                 String homeTheaters,
                 String hostTheaters,
                 Integer stagingId) {
        this.tourId = tourId;
        this.employeeId = employeeId;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.homeTheaters = homeTheaters;
        this.hostTheaters = hostTheaters;
        this.stagingId = stagingId;
    }

    @Id
    @Column(name = "TOUR_ID")
    private Integer tourId;

    @Column(name = "EMPLOYEE_ID")
    private Integer employeeId;

    @Column(name = "START_DATE")
    private Date startDate;

    @Column(name = "FINISH_DATE")
    private Date finishDate;

    @Column(name = "HOME_THEATRE")
    private String homeTheaters;

    @Column(name = "HOST_THEATRE")
    private String hostTheaters;

    @Column(name = "STAGING_ID")
    private Integer stagingId;

    public Integer getTourId() {
        return tourId;
    }

    public void setTourId(Integer tourId) {
        this.tourId = tourId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
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

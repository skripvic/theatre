package ru.nsu.skripnikova.theatre.entity.sales;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "SHOW_DATES")
public class ShowDates {

    public ShowDates() {
    }

    public ShowDates(Integer showDateId, Date showDate, Integer stagingId, Float priceFactor) {
        this.showDateId = showDateId;
        this.showDate = showDate;
        this.stagingId = stagingId;
        this.priceFactor = priceFactor;
    }

    @Id
    @Column(name = "SHOW_DATE_ID")
    private Integer showDateId;

    @Column(name = "SHOW_DATE")
    private Date showDate;

    @Column(name = "STAGING_ID")
    private Integer stagingId;

    @Column(name = "PRICE_FACTOR")
    private Float priceFactor;

    public Integer getShowDateId() {
        return showDateId;
    }

    public void setShowDateId(Integer showDateId) {
        this.showDateId = showDateId;
    }

    public Date getShowDate() {
        return showDate;
    }

    public void setShowDate(Date showDate) {
        this.showDate = showDate;
    }

    public Integer getStagingId() {
        return stagingId;
    }

    public void setStagingId(Integer stagingId) {
        this.stagingId = stagingId;
    }

    public Float getPriceFactor() {
        return priceFactor;
    }

    public void setPriceFactor(Float priceFactor) {
        this.priceFactor = priceFactor;
    }
}

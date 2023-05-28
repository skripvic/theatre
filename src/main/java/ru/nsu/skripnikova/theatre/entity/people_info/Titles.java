package ru.nsu.skripnikova.theatre.entity.people_info;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TITLES")
public class Titles {

    @Id
    @Column(name = "TITLE_ID")
    private Integer titleID;

    @Column(name = "TITLE")
    private String title;

    public Integer getTitleID() {
        return titleID;
    }

    public void setTitleID(Integer titleID) {
        this.titleID = titleID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

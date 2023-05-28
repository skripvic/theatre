package ru.nsu.skripnikova.theatre.entity.repertoire;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PLAYS")
public class Plays {

    public Plays() {
    }

    public Plays(Integer playId, String name, Integer genreId, Integer ageCategoryId, Integer yearOfCreation, Integer authorId) {
        this.playId = playId;
        this.name = name;
        this.genreId = genreId;
        this.ageCategoryId = ageCategoryId;
        this.yearOfCreation = yearOfCreation;
        this.authorId = authorId;
    }

    @Id
    @Column(name = "PLAY_ID")
    private Integer playId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "GENRE_ID")
    private Integer genreId;

    @Column(name = "AGE_CATEGORY_ID")
    private Integer ageCategoryId;

    @Column(name = "YEAR_OF_CREATION")
    private Integer yearOfCreation;

    @Column(name = "AUTHOR_ID")
    private Integer authorId;

    public Integer getPlayId() {
        return playId;
    }

    public void setPlayId(Integer playId) {
        this.playId = playId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGenreId() {
        return genreId;
    }

    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
    }

    public Integer getAgeCategoryId() {
        return ageCategoryId;
    }

    public void setAgeCategoryId(Integer ageCategoryId) {
        this.ageCategoryId = ageCategoryId;
    }

    public Integer getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(Integer yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }
}

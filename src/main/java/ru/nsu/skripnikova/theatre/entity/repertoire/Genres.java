package ru.nsu.skripnikova.theatre.entity.repertoire;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GENRES")
public class Genres {

    public Genres() {
    }

    public Genres(Integer genreId, String genre) {
        this.genreId = genreId;
        this.genre = genre;
    }

    @Id
    @Column (name = "GENRE_ID")
    private Integer genreId;

    @Column (name = "GENRE")
    private String genre;

    public Integer getGenreId() {
        return genreId;
    }

    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}

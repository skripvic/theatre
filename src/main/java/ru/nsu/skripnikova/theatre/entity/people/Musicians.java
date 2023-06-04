package ru.nsu.skripnikova.theatre.entity.people;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "MUSICIANS")
public class Musicians {

    @Id
    @Column(name = "MUSICIAN_ID")
    private Integer musicianId;

    @Column(name = "INSTRUMENT")
    private String instrument;

    @Column(name = "MUSIC_EXPERIENCE")
    private String musicExperience;

    public Musicians() {
    }

    public Musicians(Integer musicianId, String instrument, String musicExperience) {
        this.musicianId = musicianId;
        this.instrument = instrument;
        this.musicExperience = musicExperience;
    }

    public Integer getMusicianId() {
        return musicianId;
    }

    public void setMusicianId(Integer musicianId) {
        this.musicianId = musicianId;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public String getMusicExperience() {
        return musicExperience;
    }

    public void setMusicExperience(String musicExperience) {
        this.musicExperience = musicExperience;
    }
}

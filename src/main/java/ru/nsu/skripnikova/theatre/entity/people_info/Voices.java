package ru.nsu.skripnikova.theatre.entity.people_info;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VOICES")
public class Voices {

    @Id
    @Column(name = "VOICE_ID")
    private Integer voiceId;

    @Column(name = "VOICE")
    private String voice;

    public Integer getVoiceId() {
        return voiceId;
    }

    public void setVoiceId(Integer voiceId) {
        this.voiceId = voiceId;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }
}

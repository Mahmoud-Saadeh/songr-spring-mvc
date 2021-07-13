package com.example.songr.domain;

import javax.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Long length;
    private int trackNumber;

    @ManyToOne
    @JoinColumn(name="album_id")
    private Album album;

    public Song() {
    }

    public Song(String title, Long length, int trackNumber, Album album) {
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
        this.album = album;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Long getLength() {
        return length;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }
}

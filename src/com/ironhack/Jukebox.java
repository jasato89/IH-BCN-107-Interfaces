package com.ironhack;

public class Jukebox implements Playable, Recordable{
    
    private String songName;
    private double songDuration;


    public Jukebox(String songName, double songDuration) {
        this.songName = songName;
        this.songDuration = songDuration;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public double getSongDuration() {
        return songDuration;
    }

    public void setSongDuration(double songDuration) {
        this.songDuration = songDuration;
    }

    @Override
    public void playSong(String songName) {
        
    }

    @Override
    public void stopSong(String songName) {

    }

    @Override
    public void nextSong(String songName) {

    }

    public String showSongName() {
        return null;
    }

    public void recordCurrentSong() {
        
    }

    @Override
    public void stopRecording() {

    }

    @Override
    public double showTimeRecorded() {
        return 0;
    }
}

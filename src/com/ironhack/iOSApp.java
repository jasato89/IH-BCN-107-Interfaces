package com.ironhack;

public class iOSApp implements Playable{
    
    private String songName;

    public iOSApp(String songName) {
        this.songName = songName;
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

    @Override
    public String showSongName() {
        return null;
    }
}

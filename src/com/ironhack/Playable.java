package com.ironhack;

public interface Playable {

    void playSong(String songName);
    void stopSong(String songName);
    void nextSong(String songName);
    String showSongName();

}

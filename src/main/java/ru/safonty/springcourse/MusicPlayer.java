package ru.safonty.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
//    private Music music;

    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int Volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return Volume;
    }

    public void setVolume(int volume) {
        Volume = volume;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }

    public MusicPlayer() {
    }

//    public void setMusic(Music music) {
//        this.music = music;
//    }

    public void PlayMusic(){
        for(Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
//        System.out.println("Playing: " + music.getSong());
    }
}

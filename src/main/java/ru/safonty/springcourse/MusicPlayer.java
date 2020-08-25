package ru.safonty.springcourse;

public class MusicPlayer {
    private Music music;

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

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void PlayMusic(){
        System.out.println("Playing: " + music.getSong());
    }
}

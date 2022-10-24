package org.example.classicMusicPlayer;

import org.example.classicMusicPlayer.classicTrack.ClassicTrack;
import org.example.classicMusicPlayer.classicTrack.FirstClassicTrack;
import org.example.classicMusicPlayer.classicTrack.SecondClassicTrack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.ArrayList;

@Component("classicPlayer")
public class ClassicPlayer {

    ArrayList<ClassicTrack> classicTrackList = new ArrayList<>();

    @Autowired
    private FirstClassicTrack firstClassicTrack = new FirstClassicTrack();

    @Autowired
    private SecondClassicTrack secondClassicTrack = new SecondClassicTrack();

    public void addTrackToList() {
        classicTrackList.add(firstClassicTrack);
        classicTrackList.add(secondClassicTrack);
    }

    public void playTrack(int numberTrack) {
        System.out.println("Now track number" + numberTrack + "is playing" + "Track information:  " + classicTrackList.get(numberTrack));
    }

    public ArrayList<ClassicTrack> getClassicTrackList() {
        return classicTrackList;
    }

    public void setClassicTrackList(ArrayList<ClassicTrack> classicTrackList) {
        this.classicTrackList = classicTrackList;
    }

    @Override
    public String toString() {
        return "ClassicPlayer{" +
                "classicTrackList=" + classicTrackList +
                '}';
    }
}

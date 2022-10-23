package org.example.classicMusicPlayer;

import org.example.classicMusicPlayer.rockTrack.FirstRockTrack;
import org.example.classicMusicPlayer.rockTrack.RockTrack;
import org.example.classicMusicPlayer.rockTrack.SecondRockTrack;
import org.example.rockMusicPlayer.classicTrack.FirstClassicTrack;
import org.example.rockMusicPlayer.classicTrack.SecondClassicTrack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class RockPlayer {

    ArrayList<RockTrack> rockTrackList = new ArrayList<>();

    @Autowired
    private FirstRockTrack firstRockTrack;
    private SecondRockTrack secondRockTrack;

    public void addTrackToList(AnnotationConfigApplicationContext context) {
        rockTrackList.add(firstRockTrack);
        rockTrackList.add(secondRockTrack);
    }

    public void playTrack (int numberTrack)
    {
        System.out.println("Now track number" + numberTrack + "is playing" + "Track information:  " + rockTrackList.get(numberTrack));
    }

    public ArrayList<RockTrack> getRockTrackList() {
        return rockTrackList;
    }

    public void setRockTrackList(ArrayList<RockTrack> rockTrackList) {
        this.rockTrackList = rockTrackList;
    }

    @Override
    public String toString() {
        return "RockPlayer{" +
                "rockTrackList=" + rockTrackList +
                '}';
    }
}

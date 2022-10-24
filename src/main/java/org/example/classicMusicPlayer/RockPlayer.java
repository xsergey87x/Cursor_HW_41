package org.example.classicMusicPlayer;

import org.example.classicMusicPlayer.rockTrack.FirstRockTrack;
import org.example.classicMusicPlayer.rockTrack.RockTrack;
import org.example.classicMusicPlayer.rockTrack.SecondRockTrack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class RockPlayer {

    ArrayList<RockTrack> rockTrackList = new ArrayList<>();

    @Autowired
    private FirstRockTrack firstRockTrack = new FirstRockTrack();

    @Autowired
    private SecondRockTrack secondRockTrack = new SecondRockTrack();

    public void addTrackToList() {
        rockTrackList.add(firstRockTrack);
        rockTrackList.add(secondRockTrack);
    }

    public void playTrack(int numberTrack) {
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

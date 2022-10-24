package org.example;

import org.example.classicMusicPlayer.RockPlayer;
import org.example.utils.SpringConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext contextApplicationSpring = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        RockPlayer rockPlayer = contextApplicationSpring.getBean(RockPlayer.class);
        rockPlayer.addTrackToList();
        rockPlayer.playTrack(1);

        System.out.println("Hello world!");
    }
}
package org.example;

import org.example.classicMusicPlayer.rockTrack.FirstRockTrack;
import org.example.utils.SpringConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

       AnnotationConfigApplicationContext contextApplicationSpring = new AnnotationConfigApplicationContext(SpringConfiguration.class);

                FirstRockTrack firstRockTrack = contextApplicationSpring.getBean(FirstRockTrack.class);

        System.out.println("Hello world!");
    }
}
package com.example.jokesjlib;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Jokes {
    private int jokeNum = 0;

    private String[] jokes = {
            "Joke2: LALALALALA",
            "Joke1: HAHAHAHAHA",
            "Joke3: HOHOHOHOHO",
            "Joke4: RIRIRIRIRI"
    };

    public String getJoke(){
//        int i = jokeNum;
//        jokeNum = (jokeNum + 1) % 4;
        Random random = new Random();
        int i = random.nextInt(jokes.length);
        return jokes[i];
    }
}

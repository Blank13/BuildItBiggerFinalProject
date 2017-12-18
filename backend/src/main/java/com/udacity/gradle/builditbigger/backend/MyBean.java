package com.udacity.gradle.builditbigger.backend;

import com.example.jokesjlib.Jokes;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private Jokes mjokes = new Jokes();

    public String getData() {
        return mjokes.getJoke();
    }

}
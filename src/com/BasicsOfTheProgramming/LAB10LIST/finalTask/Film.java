package com.BasicsOfTheProgramming.LAB10LIST.finalTask;

import java.util.ArrayList;
import java.util.List;

public class Film {
    private String filmTitle;
    private List<Actor> actors;

    public Film(String filmTitle){
        this.filmTitle = filmTitle;
        actors = new ArrayList<>();
    }

    public String getFilmTitle() {
        return filmTitle;
    }

    public List<Actor> getAllActors() {
        return actors;
    }

    public void DisplayFilmActors(){
        for (Actor actor : actors) {
            System.out.println(actor.getName());
        }
    }

    public void addActor(Actor actor){
        actors.add(actor);
    }
}

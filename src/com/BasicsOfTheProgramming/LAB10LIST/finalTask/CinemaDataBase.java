package com.BasicsOfTheProgramming.LAB10LIST.finalTask;

import java.util.ArrayList;
import java.util.List;

public class CinemaDataBase {
    private List<Film> allfilms;
    private List<Actor> allactors;

    public CinemaDataBase() {
        allfilms = new ArrayList<>();
        allactors = new ArrayList<>();
    }

    public List<Film> getAllfilms() {
        return allfilms;
    }
    public List<Actor> getAllactors() {
        return allactors;
    }

    public void addFilms(Film film){
        allfilms.add(film);
    }
    public void addActor(Actor actor){
        allactors.add(actor);
    }

    public void DisplayFilms(){
        System.out.println("**************************");
        System.out.println(" All films: ");
        for(Film film : allfilms){
            System.out.println(film.getFilmTitle());
        }
    }

    public void DisplayActors(){
        System.out.println("**************************");
        System.out.println(" All actors: ");
        for (Actor actor: allactors){
            actor.DisplayActorFilms();
        }
    }
}

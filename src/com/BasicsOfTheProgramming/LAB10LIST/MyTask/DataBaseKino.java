package com.BasicsOfTheProgramming.LAB10LIST.MyTask;

import java.util.ArrayList;

public class DataBaseKino {
    ArrayList<Film> allFilms = new ArrayList<>();
    ArrayList<Actor> allActors = new ArrayList<>();

    public DataBaseKino(ArrayList<Film> allFilms, ArrayList<Actor> allActors) {
        this.allFilms = allFilms;
        this.allActors = allActors;
    }

    public void addActor(Actor actor) {
        this.allActors.add(actor);
    }

    public void addFilm(Film film) {
        this.allFilms.add(film);
    }

    @Override
    public String toString() {
        return "DataBaseKino {" +
                " allFilms = " + allFilms +
                ", allActors = " + allActors +
                '}';
    }
}



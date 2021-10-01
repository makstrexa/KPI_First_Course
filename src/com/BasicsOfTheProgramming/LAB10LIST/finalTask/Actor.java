package com.BasicsOfTheProgramming.LAB10LIST.finalTask;

import java.util.ArrayList;
import java.util.List;

public class Actor {
    private String name;
    private List<Film> films;

    public Actor(String name) {
        this.name = name;
        films = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void addFilm(Film film){
        films.add(film);
    }

    public void DisplayActorFilms(){
        System.out.println("*****************");
        System.out.println("Actor: " + name);
        for (Film film : films) {
            System.out.println(film.getFilmTitle());;
        }
    }
}

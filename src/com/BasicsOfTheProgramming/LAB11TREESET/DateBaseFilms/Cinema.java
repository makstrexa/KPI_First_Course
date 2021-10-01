package com.BasicsOfTheProgramming.LAB11TREESET.DateBaseFilms;

import java.util.Set;
import java.util.TreeSet;

public class Cinema {
    private final String cinemaTitle;
    private final Set<Character> charactersFromCinema;

    public String getCinemaTitle() {
        return cinemaTitle;
    }

    public Set<Character> getCharactersFromCinema() {
        return charactersFromCinema;
    }

    public Cinema(String cinemaTitle) {
        this.cinemaTitle = cinemaTitle;
        charactersFromCinema = new TreeSet<>();
    }

    public void addCharacter(Character character) {
        charactersFromCinema.add(character);
    }
}

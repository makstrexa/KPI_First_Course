package com.BasicsOfTheProgramming.LAB13Exceptions;

import java.util.HashSet;
import java.util.Set;

public class Cinema {

    private final String cinemaTitle;
    private final Set<Character> charactersFromCinema;

    public Cinema(String cinemaTitle) {
        this.cinemaTitle = cinemaTitle;
        charactersFromCinema = new HashSet<>();
    }

    public String getCinemaTitle() {
        return cinemaTitle;
    }

    public Set<Character> getCharactersFromCinema() {
        return charactersFromCinema;
    }
    public void addCharacter(Character character) {
        charactersFromCinema.add(character);
    }
}


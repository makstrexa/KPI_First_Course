package com.BasicsOfTheProgramming.LAB11TREESET.DateBaseFilms;

import java.util.Set;
import java.util.TreeSet;

public class Character implements Comparable<Character> {
    private final String charactersName;
    private final Set<Cinema> cinemasWithCharacters;

    public Character(String charactersName) {
        this.charactersName = charactersName;
        cinemasWithCharacters = new TreeSet<>(new ComparatorCinemas());
    }

    public String getCharactersName() {
        return charactersName;
    }

    public Set<Cinema> getCinemasWithCharacters() {
        return cinemasWithCharacters;
    }

    public void addCinema(Cinema cinema) {
        cinemasWithCharacters.add(cinema);
    }

    @Override
    public int compareTo(Character o) {
        return this.getCharactersName().compareTo(o.getCharactersName());
    }
}

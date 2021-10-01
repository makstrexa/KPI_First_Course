package com.BasicsOfTheProgramming.LAB12HASHSET.DataBaseFilmsHash;

import java.util.HashSet;
import java.util.Set;

public class Character {

    private final String charactersName;
    private final Set<Cinema> cinemasWithCharacters;

    public Character(String charactersName) {
        this.charactersName = charactersName;
        cinemasWithCharacters = new HashSet<>();
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

}

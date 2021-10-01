package com.BasicsOfTheProgramming.LAB12HASHSET.DataBaseFilmsHash;

import java.util.HashSet;
import java.util.Set;

public class CinemaDataBase {

    private Set<Cinema> allCinemas;
    private Set<Character> allCharacters;

    public CinemaDataBase() {
        allCinemas = new HashSet<>();
        allCharacters = new HashSet<>();
    }

    public Set<Cinema> getAllCinemas() {
        return allCinemas;
    }

    public Set<Character> getAllCharacters() {
        return allCharacters;
    }

    public void displayAllCinemas(Set<Cinema> cinemas) {
        for (Cinema cinema: cinemas) {
            System.out.println(cinema);
        }
    }

    public void displayAllCharacters(Set<Character> characters) {
        for (Character character: characters) {
            System.out.println(character);
        }
    }

    public void addCinema(Cinema cinema) {
        allCinemas.add(cinema);
    }
    public void addCharacter(Character character) {
        allCharacters.add(character);
    }

}

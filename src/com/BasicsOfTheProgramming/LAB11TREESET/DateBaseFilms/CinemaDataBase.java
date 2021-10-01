package com.BasicsOfTheProgramming.LAB11TREESET.DateBaseFilms;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class CinemaDataBase {
    private Set<Cinema> allCinemas;
    private Set<Character> allCharacters;

    public CinemaDataBase() {
        allCinemas = new TreeSet<>(new ComparatorCinemas());
        allCharacters = new TreeSet<>();
    }

    public Set<Cinema> getAllCinemas() {
        return allCinemas;
    }

    public Set<Character> getAllCharacters() {
        return allCharacters;
    }

    public void addCinema(Cinema cinema) {
        allCinemas.add(cinema);
    }
    public void addCharacter(Character character) {
        allCharacters.add(character);
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
}

class ComparatorCinemas implements Comparator<Cinema> {
    @Override
    public int compare(Cinema o1, Cinema o2) {
        return o1.getCinemaTitle().compareTo(o2.getCinemaTitle());
    }
}

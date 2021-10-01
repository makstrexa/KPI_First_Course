package com.BasicsOfTheProgramming.LAB13Exceptions;

import java.util.HashSet;
import java.util.Set;


public class Character {

    private final String charactersName;
    private final Set<Cinema> cinemasWithCharacters;

    public Character(String charactersName) throws NameException {
        this.charactersName = charactersName;
        if (!charactersUpperCase(charactersName)) {
            throw new NameException("Name must begin with a capital letter!");
        }
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

    boolean charactersUpperCase(String name) {

        boolean correctName = false;

        if (name != null && name.length()>0) {

            String[] strArr = name.split(" ");
            int counter = 0;

            for (String s : strArr) {
                if (java.lang.Character.isUpperCase(s.trim().charAt(0))) {
                    counter++;
                    if (counter == strArr.length) {
                        correctName = true;
                    }
                }
            }
        }
        return correctName;
    }

}


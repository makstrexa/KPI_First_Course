package com.BasicsOfTheProgramming.LAB13Exceptions;

import java.util.Iterator;
import java.util.HashSet;

public class Client {
    public static void main(String[] args) {

        try {
            //DATABASE
            CinemaDataBase HDRezka = new CinemaDataBase();

            //CREATING 3 NEW FILMS
            Cinema fastAndFurious = new Cinema("Fast and Furious");
            Cinema spiderMan = new Cinema("Spider Man");
            Cinema thor = new Cinema("THOR");

            //CREATING CHARACTERS

            //FASTANDFURIOUS
            Character dominicToretto = new Character("вominic Toretto");
            Character brianOConner = new Character("Brian O'Conner");

            //SPIDERMAN
            Character tomHolland = new Character("Tom Holland");
            Character jonFavreau = new Character("Jon Favreau");
            Character jakeGyllenhaal = new Character("Jake Gyllenhaal");

            //THOR
            Character chrisHemsworth = new Character("Chris Hemsworth");
            Character nataliePortman = new Character("Natalie Portman");
            Character anthonyHopkins = new Character("Anthony Hopkins");
            Character tomHiddleston = new Character("Tom Hiddleston");

            //EXTRA CHARACTERS
            Character noName1 = new Character("No Name ");
            Character noName2 = new Character("No Name ");

            //ADDING FILM AND ACTORS TO HDREZKA
            HDRezka.addCinema(fastAndFurious);
            HDRezka.addCinema(spiderMan);
            HDRezka.addCinema(thor);

            HDRezka.addCharacter(dominicToretto);
            HDRezka.addCharacter(brianOConner);

            HDRezka.addCharacter(tomHolland);
            HDRezka.addCharacter(jonFavreau);
            HDRezka.addCharacter(jakeGyllenhaal);

            HDRezka.addCharacter(chrisHemsworth);
            HDRezka.addCharacter(nataliePortman);
            HDRezka.addCharacter(anthonyHopkins);
            HDRezka.addCharacter(tomHiddleston);

            HDRezka.addCharacter(noName1);
            HDRezka.addCharacter(noName2);

            //ADDING ACTORS TO FAST AND FURIOUS
            fastAndFurious.addCharacter(dominicToretto);
            fastAndFurious.addCharacter(brianOConner);
            //ADDING ACTORS TO SPIDERMAN
            spiderMan.addCharacter(tomHolland);
            spiderMan.addCharacter(jonFavreau);
            spiderMan.addCharacter(jakeGyllenhaal);
            //ADDING ACTORS TO THOR
            thor.addCharacter(chrisHemsworth);
            thor.addCharacter(nataliePortman);
            thor.addCharacter(anthonyHopkins);
            thor.addCharacter(tomHiddleston);

            //ADDING CINEMAS TO ACTOR
            dominicToretto.addCinema(fastAndFurious);
            brianOConner.addCinema(fastAndFurious);
            tomHolland.addCinema(spiderMan);
            jakeGyllenhaal.addCinema(spiderMan);
            jonFavreau.addCinema(spiderMan);
            chrisHemsworth.addCinema(thor);
            nataliePortman.addCinema(thor);
            anthonyHopkins.addCinema(thor);
            tomHiddleston.addCinema(thor);

            //PERFORMING TASKS
            //1
            characterWithoutCinemas(HDRezka);
            //2
            characterWhichPlayWith(anthonyHopkins);
            //3
            maxCountOfCharacters(HDRezka);

        } catch (NameException | NullPointerException n) {
            n.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Programme ended without trouble!");
        }
    }
    //TASK 1 : Визначити, чи є актор, який не зіграв в жодному фільмі
    public static void characterWithoutCinemas(CinemaDataBase cinemaDataBase) {

        HashSet<Character> resultSet = new HashSet<>();

        for (Character character: cinemaDataBase.getAllCharacters()) {
            Iterator<Cinema> cinemaIterator = cinemaDataBase.getAllCinemas().iterator();

            boolean present = false;
            while (cinemaIterator.hasNext()) {
                Cinema cinema = cinemaIterator.next();
                if (cinema.getCharactersFromCinema().contains(character)) {
                    present = true;
                    break;
                }
            }

            if (!present) {
                resultSet.add(character);
            }
        }
        System.out.println("*****************");
        System.out.println("Actors without roles:");
        for (Character characterWithout: resultSet) {
            System.out.println(characterWithout.getCharactersName());
        }
    }

    //TASK 2 : Скласти список акторів, з якими коли-небудь в одному фільмі грав заданий актор
    public static void characterWhichPlayWith(Character character) {

        HashSet<Character> charactersList = new HashSet<>();

        for (Object object1 : character.getCinemasWithCharacters()) {
            if (object1 instanceof Cinema) {
                Cinema cinema = (Cinema) object1;
                for (Object object2 : cinema.getCharactersFromCinema()) {
                    if (object2 instanceof Character) {
                        Character character1 = (Character) object2;
                        if (!character1.getCharactersName().equals(character.getCharactersName())) {
                            charactersList.add(character1);
                        }
                    }
                }
            }
        }

        System.out.println("*****************");
        System.out.println("With " + character.getCharactersName() + " play: ");
        for (Character characterName : charactersList) {
            System.out.println(characterName.getCharactersName());
        }
    }

    //TASK 3 : Знайти фільм з найбільшою  кількістю акторів
    public static void maxCountOfCharacters(CinemaDataBase cinemaDataBase) {
        System.out.println("*****************");
        for (Cinema cinemas : cinemaDataBase.getAllCinemas()) {
            Cinema cinema0 = cinemaDataBase.getAllCinemas().stream().findFirst().get();
            int length = cinema0.getCharactersFromCinema().size();
            if (cinemas.getCharactersFromCinema().size() > length) {
                System.out.println(cinemas.getCinemaTitle());
                break;
            }
            else {
                System.out.println("The film with the largest number of actors: " + cinema0.getCinemaTitle());
                break;
            }
        }
    }
}
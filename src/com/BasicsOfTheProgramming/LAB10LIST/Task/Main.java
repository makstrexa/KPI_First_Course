package com.BasicsOfTheProgramming.LAB10LIST.Task;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Film film1 = new Film("Harry Potter");
        Film film2 = new Film("Split");
        Film film3 = new Film("Victor Frankenstein");
        Film film4 = new Film("Tenet");
        Film film5 = new Film("Black Panther");
        Film film6 = new Film("Piraty Caribskogo morya");



        Actor actor1 = new Actor("Daniel Redcliff");
        Actor actor2 = new Actor("Emma Watson");
        Actor actor3 = new Actor("James McAvoy");
        Actor actor4 = new Actor("Chedwick Bouzman");
        Actor actor5 = new Actor("Jhony D.");

        DataBase.addFilm(film1);
        DataBase.addFilm(film2);
        DataBase.addFilm(film3);
        DataBase.addFilm(film4);
        DataBase.addFilm(film5);
        DataBase.addFilm(film6);
        DataBase.addActor(actor1);
        DataBase.addActor(actor2);
        DataBase.addActor(actor3);
        DataBase.addActor(actor4);
        DataBase.addActor(actor5);

        film1.addActor(actor1);
        film1.addActor(actor2);
        film2.addActor(actor3);
        film3.addActor(actor1);
        film3.addActor(actor3);
        film4.addActor(actor4);
        film5.addActor(actor2);
        film6.addActor(actor4);
        actor1.addFilm(film1);
        actor1.addFilm(film3);
        actor2.addFilm(film1);
        actor3.addFilm(film2);
        actor3.addFilm(film3);
        actor4.addFilm(film4);
        actor4.addFilm(film5);
        actor3.addFilm(film6);
        System.out.println(actor3);
        System.out.println(notFilmed());
    }

    private static List<Actor> notFilmed() {
        List<Actor> resultList = new ArrayList<>();

        Iterator<Actor> actorIterator = DataBase.getActors().iterator();
        while (actorIterator.hasNext()) {
            Actor actor = actorIterator.next();
            Iterator<Film> filmIterator = DataBase.getFilms().iterator();

            boolean present = false;
            while (filmIterator.hasNext()) {
                Film film = filmIterator.next();
                if (film.getActors().contains(actor)) {
                    present = true;
                    break;
                }
            }

            if (!present) {
                resultList.add(actor);
            }
        }

        return resultList;

    }
}

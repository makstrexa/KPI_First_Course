package com.BasicsOfTheProgramming.LAB10LIST.finalTask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Processor {
    public static void main(String[] args) {
        CinemaDataBase filmDataBase = new CinemaDataBase();

        Film harryPotter = new Film("Harry Potter");
        Film homeAlone = new Film("Home Alone");

        Actor danielRadcliffe = new Actor("Daniel Radcliffe");
        Actor emmaWatson = new Actor("Emma Watson");
        Actor rupertGrint = new Actor("Rupert Grint");

        Actor macaulayCulkin = new Actor("Macaulay Culkin");
        Actor joePesci = new Actor("Joe Pesci");

        Actor rock = new Actor("Rock");

        //adding Films
        filmDataBase.addFilms(harryPotter);
        filmDataBase.addFilms(homeAlone);
        //adding Actors
        filmDataBase.addActor(danielRadcliffe);
        filmDataBase.addActor(emmaWatson);
        filmDataBase.addActor(rupertGrint);
        filmDataBase.addActor(macaulayCulkin);
        filmDataBase.addActor(joePesci);
        filmDataBase.addActor(rock);

        //adding actors toHarryPotter
        harryPotter.addActor(danielRadcliffe);
        harryPotter.addActor(emmaWatson);
        harryPotter.addActor(rupertGrint);

        //adding actors to Home Alone
        homeAlone.addActor(macaulayCulkin);
        homeAlone.addActor(joePesci);

        danielRadcliffe.addFilm(harryPotter);
        emmaWatson.addFilm(harryPotter);
        rupertGrint.addFilm(harryPotter);

        macaulayCulkin.addFilm(homeAlone);
        joePesci.addFilm(homeAlone);

        //Tasks
        withoutRoleActor(filmDataBase);
        actorsWhichPlayWith(danielRadcliffe);
        maxCountOfActors(filmDataBase);
    }

    //Task 1 : типізований ітератор
    //Визначити, чи є актор, який не зіграв в жодному фільмі
    public static void withoutRoleActor(CinemaDataBase filmDataBase) {
        List<Actor> resultList = new ArrayList<>();

        for (Actor actor : filmDataBase.getAllactors()) {
            Iterator<Film> filmIterator = filmDataBase.getAllfilms().iterator();

            boolean present = false;
            while (filmIterator.hasNext()) {
                Film film = filmIterator.next();
                if (film.getAllActors().contains(actor)) {
                    present = true;
                    break;
                }
            }

            if (!present) {
                resultList.add(actor);
            }
        }
        System.out.println("*****************");
        System.out.println("Actors without roles:");
        for (Actor actorWithout : resultList) {
            System.out.println(actorWithout.getName());
        }
    }

    //Task 2 : нетипізований ітератор
    //Скласти список акторів, з якими коли-небудь в одному фільмі грав заданий актор
    public static void actorsWhichPlayWith(Actor actor) {

        List<Actor> actorsList = new ArrayList<>();

        for (Iterator i = actor.getFilms().iterator(); i.hasNext(); ) {
            Object object1 = i.next();
            if (object1 instanceof Film) {
                Film film = (Film) object1;
                for (Object object2 : film.getAllActors()) {
                    if (object2 instanceof Actor) {
                        Actor actor1 = (Actor) object2;
                        if (!actor1.getName().equals(actor.getName())) {
                            actorsList.add(actor1);
                        }
                    }
                }
            }
        }

        System.out.println("*****************");
        System.out.println("With " + actor.getName() + " play: ");
        for (Actor actorName : actorsList) {
            System.out.println(actorName.getName());
        }
    }

    //Task 3 : типізований цикл «for-each»
    //Знайти фільм з найбільшою  кількістю акторів
    public static void maxCountOfActors(CinemaDataBase filmDataBase) {
        System.out.println("*****************");
        for (Film films : filmDataBase.getAllfilms()) {
            Film film0 = filmDataBase.getAllfilms().get(0);
            int length = film0.getAllActors().size();
            if (films.getAllActors().size() > length) {
                System.out.println(films.getFilmTitle());
                break;
            }
            else {
                System.out.println(film0.getFilmTitle());
                break;
            }
        }
    }
}

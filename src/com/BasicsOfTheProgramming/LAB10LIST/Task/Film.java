package com.BasicsOfTheProgramming.LAB10LIST.Task;

import java.util.ArrayList;
import java.util.List;

public class Film {
    private String name;
    private List<Actor> actors = new ArrayList();
    public Film(String name) {
        this.name = name;
    }
    public void addActor(Actor actor) {
        this.actors.add(actor);
    }
    public List<Actor> getActors(){
        return this.actors;
    }
    public String getName() {
        return this.name;
    }

    public Film(String name, List<Actor> actors) {
        this.name = name;
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                '}';
    }
}

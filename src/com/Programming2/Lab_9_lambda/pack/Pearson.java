package com.Programming2.Lab_9_lambda.pack;

public abstract class Pearson {

    private final String name;
    private final String lastname;
    private final int age;

    public Pearson(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public String toString(){
        return "It is " + getName() + " " + getLastName() + ",who is " + getAge();
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastname;
    }

    public int getAge() {
        return age;
    }
}
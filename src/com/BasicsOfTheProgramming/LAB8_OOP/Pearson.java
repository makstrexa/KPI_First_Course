package com.BasicsOfTheProgramming.LAB8_OOP;

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
        return "It is " + getName() + " " + getLastname() + ",who is " + getAge();
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }
}


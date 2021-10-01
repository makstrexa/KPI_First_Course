package com.BasicsOfTheProgramming.LAB8_OOP;

public class Main {
    public static void main(String[] args) {

        Process adding = new Process();

        adding.insertStudent(new Student("Ben", "Ivanov", 19, "KPI", "121"));

        adding.insertStudent(new Student("Tom", "Smith", 21, "KPI", "126"));

        adding.insertStudent(new Student("Иван", "Иванов", 21, "KPI", "126"));

        adding.display();
    }
}
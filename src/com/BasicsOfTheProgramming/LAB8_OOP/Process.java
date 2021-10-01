package com.BasicsOfTheProgramming.LAB8_OOP;

public class Process {

    Pearson[] pearsons = new Student[1000];
    private int counter = 0;

    public void insertStudent(Student obj) {
        try{

            if (obj.getName().equals("")) throw new IllegalArgumentException("\u001B[31m" + "Error");
            if (obj.getLastname().equals("")) throw new IllegalArgumentException("\u001B[31m" + "Error");
            if (obj.getAge() < 0) throw new IllegalArgumentException("\u001B[31m" + "Error");
            if (obj.getCampus().equals("")) throw new IllegalArgumentException("\u001B[31m" + "Error");
            if (obj.getSpecialty().equals("")) throw new IllegalArgumentException("\u001B[31m" + "Error");

            pearsons[counter] = obj;
            counter++;

        } catch (Exception err){
            System.out.println(err.getMessage());
        }
    }

    public void display() {

        for (int i = 0; i < counter; i++) {
            System.out.println(pearsons[i]);
        }
    }
}

package com.Programming2.Lab_8_Nested_And_Internal_Classes.trying;

public class Student extends Pearson {

    private final String campus;
    private final String specialty;

    public Student(String name, String lastname, int age, String campus, String specialty) {
        super(name, lastname, age);
        this.campus = campus;
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return super.toString() + ",study at " + getCampus() +
                " on " + getSpecialty() + " specialty.";
    }

    public String getCampus() {
        return campus;
    }

    public String getSpecialty() {
        return specialty;
    }

}
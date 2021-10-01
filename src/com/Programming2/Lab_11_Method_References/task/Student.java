package com.Programming2.Lab_11_Method_References.task;


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

class ComparisonProvider {
    public int compareByName(Student a, Student b) {
        return a.getName().compareTo(b.getName());
    }
}

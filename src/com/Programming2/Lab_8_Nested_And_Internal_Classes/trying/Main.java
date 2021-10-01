package com.Programming2.Lab_8_Nested_And_Internal_Classes.trying;

import java.util.*;

import static com.Programming2.Lab_8_Nested_And_Internal_Classes.trying.Storage.*;

public class Main {
    public static void main(String[] args) {

        Storage storage = new Storage();

        TreeSet<Student> studentsInTree = storage.setOfStudents;
        ArrayList<Student> studentsInList = (ArrayList<Student>) storage.listOfStudents;

        storage.insertStudent(new Student("Ben", "Ivanov", 19, "KPI", "121"));
        storage.insertStudent(new Student("Tom", "Smith", 21, "KPI", "126"));
        storage.insertStudent(new Student("Tom", "Johnson", 21, "KPI", "126"));
        storage.insertStudent(new Student("Ivan", "Bik", 21, "KPI", "122"));
        storage.insertStudent(new Student("Ben", "Bobrov", 19, "KPI", "125"));

        System.out.println("**** TreeSet ****");
        displayTree(studentsInTree);

        System.out.println("\n**** Array List ****");

        studentsInList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getSpecialty().compareTo(o2.getSpecialty());
            }
        });
        displayList(studentsInList);



    }
}

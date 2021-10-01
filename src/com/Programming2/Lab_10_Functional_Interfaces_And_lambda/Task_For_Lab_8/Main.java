package com.Programming2.Lab_10_Functional_Interfaces_And_lambda.Task_For_Lab_8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Storage storage = new Storage();
        ArrayList<Student> studentsInList = (ArrayList<Student>) storage.listOfStudents;

        storage.insertStudent(new Student("Ben", "Ivanov", 19, "KPI", "121"));
        storage.insertStudent(new Student("Tom", "Smith", 21, "KPI", "126"));
        storage.insertStudent(new Student("Tom", "Johnson", 21, "KPI", "126"));
        storage.insertStudent(new Student("Ivan", "Bik", 21, "KPI", "122"));
        storage.insertStudent(new Student("Ben", "Bobrov", 19, "KPI", "125"));

        studentsInList.sort(Comparator.comparing(Student::getLastName));

        studentsInList.forEach(
                student -> System.out.println(student)
        );

    }
}

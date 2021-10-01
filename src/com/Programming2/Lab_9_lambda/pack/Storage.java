package com.Programming2.Lab_9_lambda.pack;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Storage {

    TreeSet<Student> setOfStudents = new TreeSet<>((o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));
    List<Student> listOfStudents = new ArrayList<>();

    public void insertStudent(Student student) {

            setOfStudents.add(student);
            listOfStudents.add(student);

    }

    public static void displayTree(TreeSet<Student> stor) {
        for (Student pearson: stor)
            System.out.println(pearson);
    }

    public static void displayList(ArrayList<Student> students) {
        for (Student student: students) {
            System.out.println(student);
        }
    }

}

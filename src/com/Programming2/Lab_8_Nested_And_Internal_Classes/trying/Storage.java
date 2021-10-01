package com.Programming2.Lab_8_Nested_And_Internal_Classes.trying;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Storage {

    TreeSet<Student> setOfStudents = new TreeSet<>(new SpecComp());
    List<Student> listOfStudents = new ArrayList<>();

    public void insertStudent(Student student) {
        try{

            if (student.getName().isEmpty()) throw new IllegalArgumentException("\u001B[31m" + "Error");
            if (student.getLastName().isEmpty()) throw new IllegalArgumentException("\u001B[31m" + "Error");
            if (student.getAge() < 0) throw new IllegalArgumentException("\u001B[31m" + "Error");
            if (student.getCampus().isEmpty()) throw new IllegalArgumentException("\u001B[31m" + "Error");
            if (student.getSpecialty().isEmpty()) throw new IllegalArgumentException("\u001B[31m" + "Error");

            setOfStudents.add(student);
            listOfStudents.add(student);

        } catch (Exception err){
            System.out.println(err.getMessage());
        }
    }

    // static nested
    public static class SpecComp implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getLastName().compareTo(o2.getLastName());
        }
    }
    // ***

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

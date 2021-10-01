package com.Programming2.Lab_11_Method_References.task;

import java.util.*;

public class Storage {

    ArrayList<Student> listOfStudents = new ArrayList<>();

    public void insertStudent(Student student) {
            listOfStudents.add(student);
    }

    public static boolean isKPI(Student student) {
        return student.getCampus() == "KPI";
    }

    public boolean specialties(Student student) {
        return student.getSpecialty() != "126";
    }
}

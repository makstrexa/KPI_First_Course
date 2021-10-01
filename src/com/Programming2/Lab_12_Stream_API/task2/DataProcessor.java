package com.Programming2.Lab_12_Stream_API.task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DataProcessor {

    public static void main(String[] args) {

        Student baranov = new Student("Vova", "Baranov", 1, 80);
        Student maks  = new Student("Maks", "Ivanov", 2, 66);
        Student dima = new Student("Dima", "Dimov", 3, 97);
        Student ivan = new Student("Ivan", "Baranov", 4, 88);

        List<Student> instituteStudents = Arrays.asList(baranov, maks, dima, ivan);

        Institute kpi = new Institute("KPI", instituteStudents);

        List<Student> fictStudents = Arrays.asList(baranov, maks);
        Faculty fict = new Faculty("FICT", fictStudents);

        List<Student> phisStudents = Arrays.asList(baranov, maks);
        Faculty phis = new Faculty("PHIS", phisStudents);

        System.out.println("-- Task 2.1 --");
        kpi.getStudentsInInstitute()
                .stream()
                .sorted(Comparator.comparing(Student::getSurname).thenComparing(Student::getRecordBook))
                .forEach(System.out::println);

    }

}

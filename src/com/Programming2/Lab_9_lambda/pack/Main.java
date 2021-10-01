package com.Programming2.Lab_9_lambda.pack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

import static com.Programming2.Lab_9_lambda.pack.Storage.displayList;
import static com.Programming2.Lab_9_lambda.pack.Storage.displayTree;

/*

 * 2.1)	за допомогою лямбда-виразів створити компаратор для сортування за однією з цих двох ознак в порядку зростання; +
 * 2.2)	за допомогою дефолтного метода Comparator.reversed() створити компаратор для сортування за обраною ознакою у зворотному порядку; +
 * 2.3)	за допомогою дефолтного метода Comparator.thenComparing() створити компаратор, який буде порівнювати
 *      об’єкти за однією ознакою, а у разі коли вони співпадають порівнювати за іншою ознакою; +
 * 2.4)	за допомогою статичних методів Comparator.nullsFirst() або Comparator.nullsLast() створити компаратор,
 *      який дозволить порівнювати null-посилання на об’єкти з іншими об’єктами. +

 */

public class Main {

    public static void main(String[] args) {

        Storage storage = new Storage();

        TreeSet<Student> studentsInTree = storage.setOfStudents;
        ArrayList<Student> studentsInList = (ArrayList<Student>) storage.listOfStudents;
        ArrayList<Student> studentsInList2 = (ArrayList<Student>) storage.listOfStudents;
        ArrayList<Student> studentsInList3 = (ArrayList<Student>) storage.listOfStudents;

        storage.insertStudent(new Student("Ben", "Ivanov", 19, "KPI", "121"));
        storage.insertStudent(new Student("Tom", "Smith", 21, "KPI", "126"));
        storage.insertStudent(new Student("Tom", "Johnson", 21, "KPI", "126"));
        storage.insertStudent(new Student("Ivan", "Bik", 21, "KPI", "122"));
        storage.insertStudent(new Student("Ben", "Bork", 19, "KPI", "125"));
        storage.insertStudent(new Student(null, "Bork", 19, "KPI", "125"));
        storage.insertStudent(new Student(null, "Stevie", 21, "Sheva", "162"));

        System.out.println("**** Task 2.1 ****");
        displayTree(studentsInTree);

        System.out.println("\n**** Task 2.2 ****");
        Comparator<Student> nameComparator = (s1, s2) -> s1.getSpecialty().compareTo(s2.getSpecialty());
        studentsInList.sort(nameComparator.reversed());
        displayList(studentsInList);

        System.out.println("\n**** Task 2.3 ****");
        studentsInList2.sort(Comparator.comparing(Student::getAge)
                                       .thenComparing(Comparator.comparing(Student::getLastName)));
        displayList(studentsInList2);

        System.out.println("\n**** Task 2.4 ****");
        studentsInList3.sort(Comparator.nullsFirst(Comparator.comparing(Student::getName, Comparator.nullsFirst(Comparator.naturalOrder()))));
        displayList(studentsInList3);

    }
}
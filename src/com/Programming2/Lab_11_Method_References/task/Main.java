package com.Programming2.Lab_11_Method_References.task;

import java.util.ArrayList;

/*
 * На прикладі свого варіанту з л/р №8 першого семестру продемонструвати використання посилань на методи чотирьох типів:
	- посилання на статичний метод класу; +
	- посилання на нестатичний метод об’єкта;+
	- посилання на нестатичний метод класу;+
	- посилання на конструктор.+
 */

@FunctionalInterface
interface Printer {
    String printer(Student student);
}

@FunctionalInterface
interface PearsonCreator {
    Pearson Function(String name, String lastName, int age);
}

public class Main {

    public static void main(String[] args) {

        Storage storage = new Storage();

        ArrayList<Student> studentsInList = storage.listOfStudents;

        storage.insertStudent(new Student("Ben", "Ivanov", 19, "KPI", "121"));
        storage.insertStudent(new Student("Tom", "Smith", 21, "KPI", "126"));
        storage.insertStudent(new Student("Tom", "Johnson", 21, "KPI", "126"));
        storage.insertStudent(new Student("Ivan", "Bik", 21, "KNU", "122"));
        storage.insertStudent(new Student("Ben", "Bork", 19, "KNU", "125"));

        System.out.println(" **** Static Method Reference **** ");
        studentsInList
                .stream()
                .filter(Storage::isKPI)
                .forEach(System.out::println);

        System.out.println(" **** Object Non-Static Method **** ");
        ComparisonProvider comparator
                = new ComparisonProvider();
        studentsInList
                .sort(comparator::compareByName);
        studentsInList
                .forEach(System.out::println);

        System.out.println(" **** Class Non-Static Method **** ");
        Printer printer = Student::getCampus;
        System.out.println(printer.printer(studentsInList.get(1)));

        System.out.println(" **** Constructor References **** ");
        PearsonCreator pearsonCreator = Pearson::new;
        Pearson pearson = pearsonCreator.Function("Pearson", "Pearsonovich", 18);
        System.out.println(pearson);

    }
}
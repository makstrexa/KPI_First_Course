package com.Programming2.Lab_12_Stream_API.task2;

public class Student {

    private final String name;
    private final String surname;
    private final int recordBook;
    private final int averageScore;

    public Student(String name, String surname, int recordBook, int averageScore) {
        this.name = name;
        this.surname = surname;
        this.recordBook = recordBook;
        this.averageScore = averageScore;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getRecordBook() {
        return recordBook;
    }

    public int getAverageScore() {
        return averageScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", recordBook=" + recordBook +
                ", averageScore=" + averageScore +
                '}';
    }
}

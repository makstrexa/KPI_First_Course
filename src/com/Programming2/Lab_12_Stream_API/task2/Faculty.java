package com.Programming2.Lab_12_Stream_API.task2;

import java.util.List;

public class Faculty {

    private String nameFaculty;
    private List<Student> studentsInFaculty;

    public Faculty(String nameFaculty, List<Student> studentsInFaculty) {
        this.nameFaculty = nameFaculty;
        this.studentsInFaculty = studentsInFaculty;
    }

    public String getNameFaculty() {
        return nameFaculty;
    }

    public List<Student> getStudentsInFaculty() {
        return studentsInFaculty;
    }
}

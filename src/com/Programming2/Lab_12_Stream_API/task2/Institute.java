package com.Programming2.Lab_12_Stream_API.task2;

import java.util.*;

public class Institute {

    private String instituteName;
    private List<Student> studentsInInstitute;

    public Institute(String instituteName, List<Student> studentsInInstitute) {
        this.instituteName = instituteName;
        this.studentsInInstitute = studentsInInstitute;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public List<Student> getStudentsInInstitute() {
        return studentsInInstitute;
    }
}

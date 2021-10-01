package com.TheoryOfAlgorithms.Project;

public class Family {

    private final String lastName;
    private final String[] members;
    private final String[] cities;

    public Family(String lastName, String[] members, String[] cities) {
        this.lastName = lastName;
        this.members = members;
        this.cities = cities;
    }

    public String getLastName() {
        return lastName;
    }

    public String[] getMembers() {
        return members;
    }

    public String[] getCities() {
        return cities;
    }
}

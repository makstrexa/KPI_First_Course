package com.TheoryOfAlgorithms.Lab_9_DP_ZHA.BackpackProblem;

public class PhysicalMachine {
    private final String name; //название вещи
    private final int resources; //вес
    private final int price; //стоимость

    public PhysicalMachine(String name, int resources, int price) {
        this.name = name;
        this.resources = resources;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getResources() {
        return resources;
    }

    public int getPrice() {
        return price;
    }
}

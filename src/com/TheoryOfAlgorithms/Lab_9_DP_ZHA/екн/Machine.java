package com.TheoryOfAlgorithms.Lab_9_DP_ZHA.екн;

public class Machine {

    private int resources;
    private int price;

    public Machine(int resources, int price) {
        this.resources = resources;
        this.price = price;
    }

    public double costPerResource(){
        return price / (double) resources;
    }

    public int getPrice() {
        return price;
    }

    public int getResources() {
        return resources;
    }

    @Override
    public String toString() {
        return "{" + "Resources = " + resources + ", Price = " + price + '}';
    }

}

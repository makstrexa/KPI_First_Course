package com.TheoryOfAlgorithms.Lab_9_DP_ZHA.BackpackProblem;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DataCenter {

    PhysicalMachine[] physicalMachines;
    int price;
    int resources;

    public DataCenter(PhysicalMachine[] items, int price/*, int resources*/) {
        this.physicalMachines = items;
        this.price = price;
        //this.resources = resources;
    }

    public PhysicalMachine[] getPhysicalMachines() {
        return physicalMachines;
    }

    public int getPrice() {
        return price;
    }

    public int getResources() {
        return resources;
    }

    //Описание состояния рюкзака
    public String getDescription() {
        return physicalMachines == null ? "" : Arrays.stream(physicalMachines).map(PhysicalMachine::getName).collect(Collectors.joining(" + ")) + " : " + getPrice();

    }
}

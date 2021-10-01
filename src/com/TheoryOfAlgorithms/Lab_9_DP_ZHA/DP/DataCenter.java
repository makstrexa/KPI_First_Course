package com.TheoryOfAlgorithms.Lab_9_DP_ZHA.DP;

import java.util.ArrayList;
import java.util.List;

public class DataCenter {

    private final int maxAmountOfMachines; // P
    private final int maxResources;        // R

    private List<Machine> minimalAmountOfMachines = null;
    private int minimalAmount;
    private int minimalResources;
    private List<Machine> minimalAmountOfResources = null;
    private int minimalPrice;
    private List<Machine> minimalPriceOf = null;



    public DataCenter(int maxAmountOfMachines, int maxResources) {

        this.maxAmountOfMachines = maxAmountOfMachines;
        this.maxResources = maxResources;

    }



    public void dynamicProg(List<Machine> machines) {

        if (machines.size() > 0) {
            checkTask(machines);
        }

        for (int i = 0; i < machines.size(); i++) {

            List<Machine> newMachines = new ArrayList<>(machines);
            newMachines.remove(i);
            dynamicProg(newMachines);

        }

    }

    private void checkTask(List<Machine> machines) {

        if (totalAmountOfResources(machines) <= maxResources
                && totalAmountOfMachines(machines) <= maxAmountOfMachines ) {

            if (minimalAmountOfMachines == null) {

                minimalAmountOfMachines = machines;
                minimalAmount = totalAmountOfMachines(machines);

                minimalAmountOfResources = machines;
                minimalResources = totalAmountOfResources(machines);

                minimalPriceOf = machines;
                minimalPrice = totalPrice(machines);

            } else if (totalAmountOfMachines(machines) < minimalAmount) {

                minimalAmountOfMachines = machines;
                minimalAmount = totalAmountOfMachines(machines);

            } else if (totalAmountOfResources(machines) < minimalResources) {

                minimalAmountOfResources = machines;
                minimalResources = totalAmountOfResources(machines);

            } else if (totalPrice(machines) < minimalPrice) {

                minimalPriceOf = machines;
                minimalPrice = totalPrice(machines);

            }
        }
    }

    public int totalAmountOfMachines(List<Machine> machines) {

        try {
            if (machines == null || machines.size() > maxAmountOfMachines)
                throw new IndexOutOfBoundsException();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        assert machines != null;

        return machines.size();
    }

    public int totalAmountOfResources(List<Machine> machines) {

        try {
            if (machines == null || machines.size() > maxAmountOfMachines)
                throw new IndexOutOfBoundsException();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        int totalResources = 0;
        assert machines != null;
        for (Machine machine: machines) {
            totalResources += machine.getAmountOfResources();
        }

        return totalResources;

    }

    public int totalPrice(List<Machine> machines) {

        try {
            if (machines == null || machines.size() > maxAmountOfMachines)
                throw new IndexOutOfBoundsException();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        int totalPrice = 0;
        assert machines != null;
        for (Machine machine: machines) {
            totalPrice += machine.getMaintenancePrice();
        }

        return totalPrice;

    }

    public int getMaxAmountOfMachines() {
        return maxAmountOfMachines;
    }

    public int getMaxResources() {
        return maxResources;
    }

    public List<Machine> getMinimalAmountOfMachines() {
        return minimalAmountOfMachines;
    }

    public int getMinimalAmount() {
        return minimalAmount;
    }

    public int getMinimalResources() {
        return minimalResources;
    }

    public List<Machine> getMinimalAmountOfResources() {
        return minimalAmountOfResources;
    }

    public int getMinimalPrice() {
        return minimalPrice;
    }

    public List<Machine> getMinimalPriceOf() {
        return minimalPriceOf;
    }

    @Override
    public String toString() {
        return "DataCenter { " +
                " maxAmountOfMachines = " + maxAmountOfMachines +
                ", maxResources = " + maxResources +
                " }";
    }
}

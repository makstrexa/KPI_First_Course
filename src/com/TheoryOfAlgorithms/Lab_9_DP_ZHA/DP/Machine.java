package com.TheoryOfAlgorithms.Lab_9_DP_ZHA.DP;

public class Machine {

    private final int amountOfResources; // Ri
    private final int maintenancePrice;  // Ci

    public Machine(int amountOfResources, int maintenancePrice) {

        try {
            if (amountOfResources < 1 || maintenancePrice <= 0)
                throw new IllegalArgumentException();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        this.amountOfResources = amountOfResources;
        this.maintenancePrice = maintenancePrice;

    }

    public int getAmountOfResources() {
        return amountOfResources;
    }

    public int getMaintenancePrice() {
        return maintenancePrice;
    }

    @Override
    public String toString() {
        return "Machine { " +
                " amountOfResources = " + amountOfResources +
                ", maintenancePrice = " + maintenancePrice +
                " }";
    }
}

package com.TheoryOfAlgorithms.Lab_9_DP_ZHA.екн;

import java.util.*;

public class DynamicProgramming {

    public static void minimalQuantityOfMachinesDP(Machine[] machines, Integer[] vmResources) {

        System.out.println("\n\u001B[34m*** Dynamic Programming ***");
        System.out.println(" ** Minimal quantity **");

        Arrays.sort(vmResources, Collections.reverseOrder());
        Arrays.sort(machines, Comparator.comparing(Machine::getResources).reversed());

        int[][] arr =new int[vmResources.length][machines.length]; // making a table

        for (int i = 0; i < vmResources.length; i++)
        {
            for (int j = 0; j < machines.length; j++)
            {
                if (vmResources[i] < machines[j].getResources()) {
                    arr[i][j] = vmResources[i];
                }
                else {
                    arr[i][j] = 0;
                }
            }
        }
/*
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
 */

        ArrayList<Integer> usedVM = new ArrayList<>();
        ArrayList<Machine> usedPC = new ArrayList<>();

        for (int j = 0; j < machines.length; j++) {

            int leftResources = machines[j].getResources();

            for (int i = 0; i < vmResources.length; i++) {

                if (leftResources - arr[i][j] >= 0 && !usedVM.contains(arr[i][j]) && arr[i][j] != 0)
                {

                    leftResources -= arr[i][j];
                    usedVM.add(arr[i][j]);
                    if (!usedPC.contains(machines[j]))
                        usedPC.add(machines[j]);

                }

            }

        }
        System.out.println("Used: " + usedPC);
    }

    public static void minimalPriceDM(Machine[] machines, Integer[] vmResources){

        System.out.println("\n\u001B[35m*** Dynamic Programming ***\u001B[35m");
        System.out.println(" ** Minimal price **");

        Arrays.sort(machines, Comparator.comparingDouble(Machine::costPerResource));
        Arrays.sort(vmResources);

        double totalPrice = 0;

        double[][] arr = new double[vmResources.length][machines.length];
        for (int i = 0; i < vmResources.length; i++) {

            for (int j = 0; j < machines.length; j++) {

                if (vmResources[i] < machines[j].getResources())
                    arr[i][j] = machines[j].costPerResource() * vmResources[i];
                else
                    arr[i][j] = 0;

            }

        }

        /*
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        */

        ArrayList<Integer> usedVM = new ArrayList<>();
        ArrayList<Machine> usedPC = new ArrayList<>();

        for (int j = 0; j < machines.length; j++) {

            int leftResources = machines[j].getResources();

            for (int i = 0; i < vmResources.length; i++) {

                if (leftResources - machines[j].getResources() >= 0
                        && !usedVM.contains(machines[j].getResources()) && arr[i][j] != 0) {

                    leftResources -= machines[j].getResources();
                    totalPrice += machines[j].costPerResource() * vmResources[i];
                    usedVM.add(machines[j].getResources());

                }

            }

        }
        System.out.println("Total price: " + totalPrice);
    }

}

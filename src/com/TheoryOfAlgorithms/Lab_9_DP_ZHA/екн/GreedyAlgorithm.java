package com.TheoryOfAlgorithms.Lab_9_DP_ZHA.екн;

import java.util.*;

public class GreedyAlgorithm {

    public static void minimalQuantityOfMachinesGA(Machine[] machines, Integer[] vmResources){

        System.out.println("\n\u001B[32m*** Greedy Algorithm ***");
        System.out.println(" ** Minimal quantity **");

        // for processing
        Arrays.sort(machines, Comparator.comparing(Machine::getResources).reversed());
        Arrays.sort(vmResources, Collections.reverseOrder());
        ArrayList<Integer> vm = new ArrayList<>(Arrays.asList(vmResources));
        ArrayList<Integer> usedVM = new ArrayList<>();
        ArrayList<Machine> usedPC = new ArrayList<>();

        for (Machine x:machines) {

            int leftResources = x.getResources();

            if (usedVM.size() != vm.size()) {

                for (Integer y : vm) {
                    if (leftResources - y >= 0 && !usedVM.contains(y)) {
                        leftResources -= y;
                        usedVM.add(y);
                    }
                }

                usedPC.add(x);

            }

        }
        System.out.println("Used: " + usedPC);
    }
    public static void minimalPriceGA(Machine[] machines, Integer[] vmResources) {

        System.out.println("\n\u001B[33m*** Greedy Algorithm ***");
        System.out.println(" ** Minimal price **");

        // for processing
        Arrays.sort(machines, Comparator.comparingDouble(Machine::costPerResource));
        Arrays.sort(vmResources, Collections.reverseOrder());
        ArrayList<Integer> vm = new ArrayList<>(Arrays.asList(vmResources));
        ArrayList<Integer> usedVM = new ArrayList<>();

        double totalPrice = 0;
//      ArrayList<Machine> usedPC = new ArrayList<>();

        for (Machine x:machines){

            int leftResources = x.getResources();

            if (usedVM.size() != vm.size()) {

                for (Integer y : vm) {

                    if (leftResources - y >= 0 && !usedVM.contains(y)) {
                        leftResources -= y;
                        usedVM.add(y);
                        totalPrice += (x.costPerResource()*y);

                    }
                }

            }

        }
        System.out.println("Total price: " + totalPrice);
    }

}

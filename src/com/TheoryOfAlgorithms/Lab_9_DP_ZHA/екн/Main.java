package com.TheoryOfAlgorithms.Lab_9_DP_ZHA.екн;

public class Main {

    public static void main(String[] args) {

        Machine Tianhe2 = new Machine(20, 4);
        Machine Titan = new Machine(24, 71);
        Machine Mira = new Machine(2, 4);
        Machine Cori = new Machine(50, 5);

        Machine[] machines = {Tianhe2, Titan, Mira, Cori};
        Integer[] clientsRequestOfResources = new Integer[] {5, 6, 3, 20, 24, 11, 4, 1}; // res, which we need to process

        GreedyAlgorithm.minimalQuantityOfMachinesGA(machines, clientsRequestOfResources);
        GreedyAlgorithm.minimalPriceGA(machines, clientsRequestOfResources);

        DynamicProgramming.minimalQuantityOfMachinesDP(machines, clientsRequestOfResources);
        DynamicProgramming.minimalPriceDM(machines, clientsRequestOfResources);

    }

}

package com.TheoryOfAlgorithms.Lab_1.Subsets;

import java.util.Arrays;

public class SuccessProj {

    // testing code

    public static void main(String[] args) {
        int[] set = {1, 2, 3};
        //processSubsets(set, 2);
        ready(set, 2);
    }

    public static void ready(int[] SUBSETS,int K) {
        try {
            processSubsets(SUBSETS, K);
        } catch (NegativeArraySizeException negativeArraySizeException) {
            negativeArraySizeException.printStackTrace();
        }
    }

    // !!!start of display logic
    static void process(int[] subset) {
        System.out.println(Arrays.toString(subset));
    }
    // !!!the end of display logic

    // !!!start of business logic

    static void processLargerSubsets(int[] set, int[] subset, int subsetSize, int nextIndex) {

        Arrays.sort(set);
        for (int i = 1; i < set.length; i++) {
            if (Arrays.binarySearch(set,set[i]) != set[i-1]) {
                System.out.println("SETS!!!");
                return;
            }
        }

        if (subsetSize == subset.length) {
            process(subset);
        } else {
            for (int j = nextIndex; j < set.length; j++) {
                subset[subsetSize] = set[j];
                processLargerSubsets(set, subset, subsetSize + 1, j + 1);
            }
        }
    }

    static void processSubsets(int[] set, int k) {
        int[] subset = new int[k];
        processLargerSubsets(set, subset, 0, 0);
    }

    // !!!the end of business logic
}

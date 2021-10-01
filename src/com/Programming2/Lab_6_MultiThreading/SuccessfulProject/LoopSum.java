package com.Programming2.Lab_6_MultiThreading.SuccessfulProject;

public class LoopSum {
    public static void sumByLoop(long a1, long N) {

        long starts = System.currentTimeMillis();

        long sum = 0;
        long counter = 1;

        while (counter <= N) {
            sum += a1;
            a1 +=3;
            counter++;
        }

        long finish = System.currentTimeMillis() - starts;

        System.out.println("\u001B[36mResult by loop: " + sum +
                " completed for " + finish + " ms\u001B[36m");
    }
}

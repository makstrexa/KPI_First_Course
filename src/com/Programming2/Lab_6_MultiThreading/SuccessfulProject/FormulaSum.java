package com.Programming2.Lab_6_MultiThreading.SuccessfulProject;

public class FormulaSum {

    public static void sumByFormula(long a1, long aLast) {

        long starts = System.currentTimeMillis();
        long nanoStart = System.nanoTime();

        long a = a1 + (aLast * a1);
        long b = aLast/2;
        long result = a*b;

        long nanoFinish = System.nanoTime() - nanoStart;
        long finish = System.currentTimeMillis() - starts;

        System.out.println("\u001B[33mResult by formula: " + result +
                " completed for " + finish + " ms, " + nanoFinish + " ns\u001B[33m");
    }

}

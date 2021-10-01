package com.Programming2.Lab_6_MultiThreading.SuccessfulProject;

public class Main {

    public static void main(String[] args) {

        long n = 3;
        long N = 1_000_000_000;

        FormulaSum.sumByFormula(n, N);
        LoopSum.sumByLoop(n, N);
        CalculateByThread.sumByThreads(n, N);

    }

}

package com.Programming2.Lab_6_MultiThreading.SuccessfulProject;

import java.util.*;

public class CalculateByThread {

    public static void sumByThreads(long n, long N) {

        int[] arrThreadsCounts = {1, 2, 4, 8, 16, 32};

        for(int thCount: arrThreadsCounts) {

            long starts = System.currentTimeMillis();
            long res = multithreadingProgression(n, N, thCount);
            long finish = System.currentTimeMillis() - starts;

            System.out.println("\u001B[32mAnswer: " + res +
                    " , amount of threads " + thCount +
                    " completed for " + finish + " ms\u001B[32m");

        }

    }

    private static long multithreadingProgression(long n, long N, int threadsCount) {

        long res = 0;
        long nMax = 0;
        long nMin;

        long m = N/threadsCount;
        long mLast = N/threadsCount + N%threadsCount;

        List<SumThread> threads = new ArrayList<>(threadsCount);

        SumThread thread;

        for(int i = 0; i < threadsCount; i++) {

            nMin = nMax + 1;
            nMax = (nMin - 1) + (i == threadsCount - 1 ? mLast : m);

            thread = new SumThread(n, nMin, nMax);
            threads.add(thread);
            thread.start();

        }

        for (SumThread t: threads) {

            try {
                t.join();
                res += t.result;
            } catch (Exception ex) {
                ex.printStackTrace();
                ex.getCause();
            }

         }

        return res;

    }

}
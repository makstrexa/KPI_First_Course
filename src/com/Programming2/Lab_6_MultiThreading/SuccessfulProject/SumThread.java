package com.Programming2.Lab_6_MultiThreading.SuccessfulProject;

public class SumThread extends Thread {

    long n;
    long nMin;
    long nMax;
    long result;

    public SumThread(long n, long nMin, long nMax) {

        this.n = n;
        this.nMin = nMin;
        this.nMax = nMax;

    }

    @Override
    public void run() {
        long res = 0;
        for (long i = nMin; i <= nMax; i++) {
            res += n*i;
        }
        result = res;
    }

}

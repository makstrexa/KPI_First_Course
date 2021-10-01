package com.BasicsOfTheProgramming.LAB4Arrays;

public class Exercise3 {
    public static void main(String[] args) {
        int[] array = new int[]{45, -7, 34, -67, -1, 0, 38, 23};
        int[] copiedarray = array.clone();
        for (int counter1 = 0; counter1 < copiedarray.length; counter1++) {
            if (array[counter1] < 0) {
                copiedarray[counter1] += maxFound(array);
            }else if (array[counter1] == 0) {
                copiedarray[counter1] = 1;
            } else {
                copiedarray[counter1] *= 2;
            }
        }
        for (int j : copiedarray) {
            System.out.println(j);
        }

    }
    public static int maxFound(int[] arraytemp) {
        int maxnum = arraytemp[0];
        for (int i : arraytemp) {
            if (i > maxnum) {
                maxnum = i;
            }
        }
        return(maxnum);
    }
}

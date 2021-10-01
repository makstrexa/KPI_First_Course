package com.BasicsOfTheProgramming.LAB4Arrays;

public class Exercise2 {
    public static void main(String[] args) {
        int[] whole = new int[]{45, -7, 34, -67, -1, 0, 38, 23};
        int sum = 0;
        int maxNumber = maxNumber(whole);
        for (int counter1 = 0; counter1 < whole.length; counter1++) {
            if (whole[counter1] > 0) {
                counter1++;
                while (whole[counter1] < 0) {
                    counter1++;
                    if (whole[counter1] > 0) {
                        sum = whole[counter1] + maxNumber;
                        break;
                    }
                }
            } else if (whole[counter1] < 0 || whole[counter1] == 0) {
                counter1++;
                while (whole[counter1] < 0) {
                    counter1++;
                    if (whole[counter1] > 0) {
                        sum = whole[counter1] + maxNumber;
                        break;
                    }
                }
            }
        }
        System.out.println(sum);
    }
    public static int maxNumber(int[] temporary){
        int max1 = temporary[0];
        for (int i : temporary) {
            if (max1 < i) {
                max1 = i;
            }
        }
        return (max1);
    }
}

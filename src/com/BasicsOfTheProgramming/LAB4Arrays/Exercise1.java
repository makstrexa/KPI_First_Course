package com.BasicsOfTheProgramming.LAB4Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,67,4,1,54,76,87,34,23};
        System.out.println(max(nums));
    }
    public static int max(int[] temp){
        int max1 = temp[0];
        for (int num: temp){
            if (num>max1){
                max1 = num;
            }
        }
        return (max1);
    }
}

package com.TheoryOfAlgorithms.Lab_1.Subsets;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your deep here: ");
        int dep = sc.nextInt();
        System.out.println("The deep is"+ " " + dep);
        System.out.println("Input the number of slots: ");
        int size = sc.nextInt();
        System.out.println("The number of slots is  " + size);
        String[] array = new String[size];
        for (int i = 0; i < size; i++) {
            array[i] = String.valueOf(sc.nextInt());
        }




        System.out.println(Arrays.deepToString(list(array, dep)));
    }
    public static <T> T[][] list(T[] elems, int deep){
        T[] a = Arrays.copyOf(elems, 0);
        List<T[]> res = new ArrayList<>();
        int i = 0;
        for (T e : elems){
            if (deep != 1){
                for (T[] j : list(Arrays.copyOfRange(elems, ++i, elems.length), deep - 1)) {
                    res.add( (new ArrayList<T>( Arrays.asList(j) ) {{ add(0, e); }}).toArray(a) );
                }
            }else
                res.add(Arrays.asList(e).toArray(a));
        }
        return res.toArray((T[][]) Array.newInstance(elems.getClass().getComponentType(), 0, 0));
    }
}

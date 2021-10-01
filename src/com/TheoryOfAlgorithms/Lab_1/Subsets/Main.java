package com.TheoryOfAlgorithms.Lab_1.Subsets;

/*
 * Згенерувати всі k-елементні підмножини множини A з N чисел, A={1, 2, ..., N}.
 * Приклад: N=3, k=2, підмножини: {1,2}, {1,3}, {2,3}.
 */


import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your deep here: ");
        int dep = sc.nextInt();
        System.out.println("The deep is"+ " " + dep);
        System.out.print("Input the number of slots: ");
        int size = sc.nextInt();
        System.out.println("The number of slots is  " + size);
        String[] array = new String[size];
        int i = 0;
        while(i < size){
            System.out.print("Enter element №" + (i + 1) + " ");
            String userNum = String.valueOf(sc.nextInt());
            if (array[i].equals(bruteForce(array))){
                array[i] = userNum;
                i++;
            }
        }




        System.out.println(Arrays.deepToString(list(array, dep)));
    }
    public static <T> String[][] list(T[] elements, int deep){
        T[] a = Arrays.copyOf(elements, 0);
        List<T[]> res = new ArrayList<>();
        int i = 0;
        for (T e : elements){
            if (deep != 1)
                for (String[] j : list(Arrays.copyOfRange(elements, ++i, elements.length), deep - 1))
                    res.add((new ArrayList<>(Arrays.asList(j)) {{
                        add(0, (String) e);
                    }}).toArray(a));
            else res.add(Arrays.asList(e).toArray(a));
        }

        return (String[][]) res.toArray(new String[0][0]);
    }

    public static String bruteForce(String[] a){
        String repeat = "";
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i] == a[j])
                    repeat = a[i];
            }
        }
        return repeat;
    }
}

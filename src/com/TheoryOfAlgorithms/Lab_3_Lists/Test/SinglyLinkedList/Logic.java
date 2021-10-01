package com.TheoryOfAlgorithms.Lab_3_Lists.Test.SinglyLinkedList;

public class Logic {

    public static long averageValue(long[] arr) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static void insertResult(List list) {
        long[] timeArr = new long[1000];
        long[] timeArr1 = new long[1000];
        long[] timeArr2 = new long[1000];
        int quantity = 0;
        while (quantity < 1000) {

            long start = System.nanoTime();
            list.insertFirst((int)(Math.random() * 1000 + 100));
            long finish = System.nanoTime() - start;
            list.removeFirst();

            long start1 = System.nanoTime();
            list.insertEnd((int)(Math.random() * 1000 + 100));
            long finish1 = System.nanoTime() - start1;
            list.removeEnd();

            int ins = (int)(Math.random() * 1000 + 100);
            int index = list.length()/2;
            long start2 = System.nanoTime();
            list.insertAt(ins, index);
            long finish2 = System.nanoTime() - start2;
            list.removeAtPosition(index);

            timeArr[quantity] = finish;
            timeArr1[quantity] = finish1;
            timeArr2[quantity] = finish2;
            quantity++;
        }

        System.out.println("\u001B[33mСредние значение времени вставки в начало(1000 раз): " + averageValue(timeArr) + " ns.");
        System.out.println("Средние значение времени вставки в конец(1000 раз): " + averageValue(timeArr1) + " ns.");
        System.out.println("Средние значение времени вставки в средину(1000 раз): " + averageValue(timeArr2) + " ns.\u001B[33m");

    }

    public static void deleteResult(List list) {
        long[] timeArr1 = new long[1000];
        long[] timeArr2 = new long[1000];
        long[] timeArr3 = new long[1000];

        int quantity = 0;
        while(quantity < 1000) {

            long start1 = System.nanoTime();
            int first = list.removeFirstPlus();
            long finish1 = System.nanoTime() - start1;
            list.insertFirst(first);

            long start2 = System.nanoTime();
            list.removeEnd();
            long finish2 = System.nanoTime() - start2;
            list.insertEnd(56);

            int mid = list.length()/2;
            long start3 = System.nanoTime();
            list.removeAtPosition(mid);
            long finish3 = System.nanoTime() - start3;
            list.insertAt(56, mid);


            timeArr1[quantity] = finish1;
            timeArr2[quantity] = finish2;
            timeArr3[quantity] = finish3;
            quantity++;
        }
        System.out.println("\u001B[32mСредние значение времени удаления в начале(1000 раз): " + averageValue(timeArr1) + " ns.");
        System.out.println("Средние значение времени удаления в конце(1000 раз): " + averageValue(timeArr2) + " ns.");
        System.out.println("Средние значение времени удаления в средине(1000 раз): " + averageValue(timeArr3) + " ns.\u001B[32m");
    }

    public static void findResult(List list) {
        long[] timeArr1 = new long[1000];

        int quantity = 0;
        while(quantity < 1000) {

            long start1 = System.nanoTime();
            list.findIndex(list.length()/2);
            long finish1 = System.nanoTime() - start1;

            timeArr1[quantity] = finish1;
            quantity++;
        }
        System.out.println("\u001B[35mСредние нахождения индекса(1000 раз): " + averageValue(timeArr1) + " ns.\u001B[35m");
    }

}

package com.TheoryOfAlgorithms.Lab_4_Sorting.OOPsorting;

public class Client {

    private Random random;
    private Displayer displayer;
    private Sorter sorter;

    public Client(Sorter sorter, Displayer displayer, Random random) {
        this.sorter = sorter;
        this.displayer = displayer;
        this.random = random;
    }

    public Client(Sorter sorter, Random random) {
        this.sorter = sorter;
        this.random = random;
    }

    public void processDataWithThreeFunc(int length) {
        if (length > 0) {
            int[] array = new int[length];
            random.fillArr(array);
            System.out.println("Virgin array: ");
            displayArr(array);
            System.out.println("Sorted ");
            sorter.sort(array);
            displayArr(array);
        }
    }

    public void processDataWithTwoFunc(int length) {
        if (length > 0) {
            int[] array = new int[length];
            random.fillArr(array);
            sorter.sort(array);
        }
    }

    public void processDataSimple(int length) {
        if (length > 0) {
            int[] array = new int[length];
            for (int i = 0; i < array.length; i++) {
                array[i] = i;
            }
            sorter.sort(array);
        }
    }

    public void processing(int[] arr) {
        sorter.sort(arr);
    }

    public void setSorter(Sorter sorter) {
        this.sorter = sorter;
    }

    public void displayArr(int[]array){
        displayer.display(array);
    }
}

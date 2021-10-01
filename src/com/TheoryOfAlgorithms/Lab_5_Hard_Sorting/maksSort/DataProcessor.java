package com.TheoryOfAlgorithms.Lab_5_Hard_Sorting.maksSort;

public class DataProcessor {
    private Sorter sorter;
    private Filler filler;

    public DataProcessor(Sorter sorter, Filler filler) {
        this.sorter = sorter;
        this.filler = filler;
    }

    public void setSorter(Sorter sorter) {
        this.sorter = sorter;
    }

    public void setFiller(Filler filler) {
        this.filler = filler;
    }

    public long sorting(int[] array) {
        return sorter.sort(array);
    }

    public void filling(int[] array) {
        filler.fill(array);
    }
}

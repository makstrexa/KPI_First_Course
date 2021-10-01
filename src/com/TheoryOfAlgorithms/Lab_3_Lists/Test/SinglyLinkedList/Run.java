package com.TheoryOfAlgorithms.Lab_3_Lists.Test.SinglyLinkedList;

public class Run {
    public static void main(String[] args) {

        List list = new List();

        // filling list
        for (int i = 0; i <= 100_000; i++) {
            list.insertFirst((int)(Math.random() * 100));
        }

        Logic.insertResult(list);
        Logic.deleteResult(list);
        Logic.findResult(list);

    }

}

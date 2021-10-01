package com.TheoryOfAlgorithms.Lab_3_Lists.Test.DoublyLinkedList;

public class Runner {

    public static void main(String[] args) {

        DoubleLinkedList list = new DoubleLinkedList();


        for (int i = 0; i < 100000; i++) {
            list.addFirst((int)(Math.random() * 100));
        }

        Manager.insertResultD(list);
        Manager.deleteResultD(list);
        Manager.findResultD(list);

    }

}

package com.TheoryOfAlgorithms.Lab_3_Lists.Test.Stack;

public class LinkListQueue {
    LinkList li = new LinkList();

    public void push(int data) {
        li.insertFirst(data);
    }

    public void pop() {
        if (!li.isEmpty()){
            li.deleteLast();
        }
    }

    public void displayQueue() {
        System.out.println("  ");
        li.displayList();
    }
}

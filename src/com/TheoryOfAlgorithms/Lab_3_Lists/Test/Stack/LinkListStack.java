package com.TheoryOfAlgorithms.Lab_3_Lists.Test.Stack;

public class LinkListStack {
    LinkList li = new LinkList();

    public void push(int data) {
        li.insertFirst(data);
    }

    public void pop() {
        if (!li.isEmpty()){
            li.deleteFirst();
        }
    }

    public void displayStack() {
        System.out.println("  ");
        li.displayList();
    }
}

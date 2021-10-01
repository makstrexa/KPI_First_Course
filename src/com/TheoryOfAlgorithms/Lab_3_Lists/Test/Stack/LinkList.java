package com.TheoryOfAlgorithms.Lab_3_Lists.Test.Stack;

public class LinkList {
    private Node first = null;

    public void insertFirst(int data) {
        Node n = new Node(data);
        n.next = first;
        first = n;
    }

    public Node deleteFirst() {
        Node temp = first;
        first = first.next;
        return temp;
    }
    public void deleteLast() {
        Node last = first;
        Node prev = first;

        while (last.next != null) {
            prev = last;
            last = last.next;
        }

        if (last == first) {
            first = null;
        } else {
            prev.next = null;
        }
    }

    public void displayList() {
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
    }

    public boolean isEmpty() {
        return (first == null);
    }
}

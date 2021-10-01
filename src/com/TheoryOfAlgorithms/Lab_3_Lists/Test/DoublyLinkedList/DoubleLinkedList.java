package com.TheoryOfAlgorithms.Lab_3_Lists.Test.DoublyLinkedList;

public class DoubleLinkedList {

    private LinkElem head;
    private LinkElem tail;

    public DoubleLinkedList() {
        head = null;
        tail = null;
    }

    private boolean isEmptyD() {
        return head == null;
    }

    public void addFirst(int data) {
        LinkElem temp = new LinkElem(data);

        if (isEmptyD())
            tail = temp;
        else
            head.previous = temp;

        temp.next = head;
        head = temp;
    }

    public void addLast(int data) {
        LinkElem temp = new LinkElem(data);
        if (isEmptyD())
            head = temp;
        else
            tail.next = temp;

        temp.previous = tail;
        tail = temp;
    }

    public void addByIndex(int data, int index) {
        LinkElem cur = head;
        int c = 0;

        while (cur != null && c != index) {
            cur = cur.next;
            c++;
        }

        LinkElem temp = new LinkElem(data);

        cur.previous.next = temp;
        temp.previous = cur.previous;
        cur.previous = temp;
        temp.next = cur;

    }

    public void removeFirst() {

        if (head.next == null) {
            tail = null;
        }
        else
            head.next.previous = null;

        head = head.next;
    }

    public void removeLast() {
        if (head.next == null)
            head = null;
        else
            tail.previous.next = null;

        tail = tail.previous;
    }

    public void removeAtIndex(int index) {
        LinkElem currentNode = head, prev = head;

        if (index < 0 || index > length())
            return;

        if (currentNode == null)
            return;

        int counter = 0;
        while (currentNode != null) {

            if (counter == index) {
                LinkElem nextNode = currentNode.next;
                LinkElem prevNode = currentNode.previous;
                prevNode.next = nextNode;
                nextNode.previous = prevNode;
                return;
            }
            else {
                prev = currentNode;
                currentNode = currentNode.next;
                counter++;
            }
            //currentNode = currentNode.next;
        }
    }

    public int findIndex(int key) {
        LinkElem temp = head;
        int c = 0;

        while (temp != null) {

            if (temp.data == key)
                return c;

            temp = temp.next;
            c++;
        }
        return -1;
    }

    public int length() {
        int res = 0;
        LinkElem elem = head;
        while (elem != null)
        {
            elem = elem.next;
            res++;
        }
        return res;
    }

    public void displayDoubly() {
        LinkElem temp = head;

        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}

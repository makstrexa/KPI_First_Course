package com.TheoryOfAlgorithms.Lab_3_Lists.Test.SinglyLinkedList;



public class List {

    private LinkList head; // Ссылка на первый элемент списка

    public List() {
        head = null;  // Список пока не содержит элементов
    }

    private boolean isEmpty() {
        return head == null;
    }

    // insertion
    /*
    Метод insertFirst() класса LinkList вставляет новый элемент в начало списка.
    В этой позиции вставка выполняется проще всего, потому что first уже указывает
    на первый элемент. Чтобы вставить в список новый элемент, достаточно присвоить
    полю next созданного объекта ссылку на предыдущий первый элемент, а затем
    изменить поле first так, чтобы оно указывало на только что вставленный элемент.
     */
    public void insertFirst(int data) {
        LinkList temp = new LinkList(data);
        temp.next = head;
        head = temp;
    }

    public void insertEnd(int data) {
        LinkList temp = new LinkList(data);

        if (head == null)
        {
            head = temp;
            return;
        }

        LinkList last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = temp;

    }

    public void insertAt(int data, int place) {
        LinkList a = new LinkList(data);
        if (place >= length())
        {
            System.out.print("Индекс вставки превышает длину списка");
        } else {
            int index = 0;
            LinkList t = head;
            while (index < place - 1){
                t = t.next;
                index++;
            }
            a.next = t.next;
            t.next = a;
        }
    }

    //removing
    public void removeEnd() {

        LinkList last = head;
        LinkList prev = head;

        while (last.next != null) {
            prev = last;
            last = last.next;
        }

        if (last == head) {
            head = null;
        } else {
            prev.next = null;
        }

    }

    /*
    Метод deleteFirst() является противоположностью insertFirst(). Он отсоединяет
    первый элемент, для чего в поле first заносится ссылка на второй элемент
    (который находится по значению поля next в первом элементе):
     */
    public void removeFirst() {
        head = head.next;
    }

    public int removeFirstPlus() {
        int first = head.data;
        head = head.next;
        return first;
    }

    public void removeAt(int key) {
        LinkList cur = head;

        while(cur.data == key && head != null) {
            head = head.next;
        }

        while (cur != null && cur.next != null) {
            if(cur.next.data == key) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }

    }

    public void removeAtPosition(int index) {

        LinkList currNode = head, prev = head;

        // CASE 1:
        // If index is 0, then head node itself is to be
        // deleted

        if (index == 0 && currNode != null) {
            head = currNode.next; // Changed head


        }
        // CASE 2:
        // If the index is greater than 0 but less than the
        // size of LinkedList
        //
        // The counter
        int counter = 0;

        // Count for the index to be deleted,
        // keep track of the previous node
        // as it is needed to change currNode.next
        while (currNode != null) {

            if (counter == index) {
                // Since the currNode is the required
                // position Unlink currNode from linked list
                prev.next = currNode.next;
                break;
            }
            else {
                // If current position is not the index
                // continue to next node
                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }

        // If the position element was found, it should be
        // at currNode Therefore the currNode shall not be
        // null
        //
        // CASE 3: The index is greater than the size of the
        // LinkedList
        //
        // In this case, the currNode should be null
        if (currNode == null) {
        }

    }

    //

    public int findIndex(int key) {
        LinkList temp = head;
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
        LinkList elem = head;
        while (elem != null)
        {
            elem = elem.next;
            res++;
        }
        return res;
    }

    public void display() {
        LinkList temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

}

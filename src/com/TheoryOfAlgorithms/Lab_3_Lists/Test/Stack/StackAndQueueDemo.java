package com.TheoryOfAlgorithms.Lab_3_Lists.Test.Stack;

public class StackAndQueueDemo {
    public static void main(String[] args) {
        LinkListStack st = new LinkListStack();
        LinkListQueue qu = new LinkListQueue();

        //stack
        st.push(50);
        st.push(70);
        st.push(190);
        st.displayStack();
        st.pop();
        st.displayStack();
        //

        //queue
        qu.push(10);
        qu.push(50);
        qu.push(30);
        qu.push(20);
        qu.displayQueue();
        qu.pop();
        qu.displayQueue();
    }
}

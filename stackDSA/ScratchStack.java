package stackDSA;

import java.util.Iterator;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class ScratchStack {

    Node head;

    public boolean isEmpty(){
        return head==null;
    }

    public void push(int data){
        Node node = new Node(data);
        if(isEmpty()){
            head = node;
            return;
        }

        node.next = head;
        head = node;
    }

    public int pop(){
        if(isEmpty()){
            return -1;
        }

        int top = head.data;
        head = head.next;
        return top;
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }

        return head.data;
    }

    public static void main(String[] args){

        ScratchStack st = new ScratchStack();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.peek();
        st.push(5);


        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }


    
}

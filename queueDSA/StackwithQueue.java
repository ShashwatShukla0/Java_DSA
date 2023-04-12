package queueDSA;

import java.util.LinkedList;
import java.util.Queue;

public class StackwithQueue {

    static class Queue{

        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        static int curr_size;
    }

    static void push(int data){

        q2.add(data);

        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.remove();
        }

        Queue<Integer> q = q1;
        q1=q2;
        q2=q;

    }

    public static void main(String[] args){

    }
    
}

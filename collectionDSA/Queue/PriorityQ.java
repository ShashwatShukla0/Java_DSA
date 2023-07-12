package collectionDSA.Queue;

import java.util.PriorityQueue;

public class PriorityQ {

    public static void main(String[] args) {

        PriorityQueue<Integer> st = new PriorityQueue<>();
        st.add(30);
        st.add(10);
        st.add(30);
        st.add(25);
        st.add(10);
        st.add(20);

        System.out.println(st);
        System.out.println(st.peek());
        while(!st.isEmpty()) {
            System.out.print(st.peek()+" ");
            st.poll();
        }
    }
    
}

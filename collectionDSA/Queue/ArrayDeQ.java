package collectionDSA.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeQ {

    public static void main(String[] args) {

        Deque<Integer> st = new ArrayDeque<>();

        st.add(30);
        st.add(10);
        st.add(30);
        st.add(25);
        st.add(10);
        st.add(20);

        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.getLast());

        st.addLast(45);
        System.out.println(st.element());
        System.out.println(st.getLast());
        while(!st.isEmpty()) {
            System.out.print(st.peek()+" ");
            st.poll();
        }
    }
    
}

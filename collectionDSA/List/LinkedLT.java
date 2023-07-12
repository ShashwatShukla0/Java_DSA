package collectionDSA.List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLT {

    public static void main(String[] args) {

        LinkedList<Integer> st = new LinkedList<>();
 
        st.add(45);
        st.add(32);
        st.add(45);
        st.add(76);
        st.add(76);

        st.remove(4);
        st.set(3, 4);
        int a = st.lastIndexOf(45);  //gives index of last 
        System.out.println(st);

        System.out.println(a);

        Iterator<Integer> i = st.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
    
}

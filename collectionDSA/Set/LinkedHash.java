package collectionDSA.Set;

import java.util.LinkedHashSet;

public class LinkedHash {

    public static void main(String[] args) {

        LinkedHashSet<Integer> st = new LinkedHashSet<>();

        st.add(10);
        st.add(20);
        st.add(10);
        st.add(50);
        st.add(40);


        System.out.println(st);
    }
    
}

package collectionDSA.Set;

import java.util.HashSet;
import java.util.Set;

public class SetC {

    public static void main(String[] args) {

        Set<Integer> st = new HashSet<>();

        st.add(10);
        st.add(30);
        st.add(10);
        st.add(20);
        st.add(40);
        st.add(35);

        System.out.println(st);
    }
    
}

package Hashing;

import java.util.*;

public class HashSetExm {
    
    public static void main(String args[]){

        HashSet<Integer> st = new HashSet<>();

        st.add(1);
        st.add(3);
        st.add(5);
        st.add(3);

        System.out.println(st);

        if(st.contains(3)){
            System.out.println("Found ");
        }

        Iterator it = st.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

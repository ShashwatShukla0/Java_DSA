package collectionDSA.List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLt {

    public static void main(String[] args) {

        ArrayList<Integer> st = new ArrayList<>();

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

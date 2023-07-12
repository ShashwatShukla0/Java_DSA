package collectionDSA.List;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;

public class AbstractLt {

    public static void main(String[] args ){

        AbstractList<Integer> st = new ArrayList<>();

        st.add(45);
        st.add(32);
        st.add(45);
        st.add(76);
        st.add(76);

        st.remove(4);
        int a = st.lastIndexOf(45);  //gives index of last 
        System.out.println(st);

        System.out.println(a);

        Iterator<Integer> i = st.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
    
}

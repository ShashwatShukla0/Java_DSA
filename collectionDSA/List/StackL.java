package collectionDSA.List;
import java.util.Stack;

public class StackL {

    public static void main(String[] args) {

        Stack st = new Stack<>();

        st.push(43);
        st.push("ascs");
        st.push(32);
        st.push(43);
        st.push("ascs");
        st.push(65);
        st.push(76);

        System.out.println(st);

        st.pop();

        // Iterator i = st.iterator();

        // while(i.hasNext()){
        //     System.out.println(i.next()+" ");
        // }

        while(!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
        
    }
    
}

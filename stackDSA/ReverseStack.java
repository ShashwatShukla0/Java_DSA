package stackDSA;

import java.util.Stack;

public class ReverseStack {

    public static void pushAtBottom(int data, Stack<Integer> s) {

        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(data, s);
        
        s.push(top);
    }

    public static void reverse(Stack<Integer> s){

        if(s.isEmpty()){
            return;
        }

        int top = s.pop();
        reverse(s);
        
        pushAtBottom(top, s);
    }

    public static void main(String args[]){

        Stack<Integer> st = new Stack<>();

        st.push(2);
        st.push(1);
        st.push(3);
        st.push(4);

        reverse(st);

        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }

       
    }
    
}

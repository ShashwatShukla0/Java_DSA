package stackDSA;

public class StackwithLL {

    static class Node{
        int data;
        Node next;

        Node( int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Stack{
         Node head;

        public boolean isEmpty(){
            return head==null;
        }

        public void push(int data){
            Node new_node = new Node(data);
            if(isEmpty()){
                head = new_node;
                return;
            }

            new_node.next = head;
            head = new_node;
        }

        public int pop(){
            if(isEmpty()){
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        public int peek(){
            if(isEmpty()){
                return -1;
            }

            return head.data;
        }

        public static void main(String args[]){

            Stack st = new Stack();
    
            st.push(2);
            st.push(1);
            st.push(3);
            st.push(4);
    
            while(!st.isEmpty()){
                System.out.println(st.peek());
                st.pop();
            }
        }
    }

    
    
}

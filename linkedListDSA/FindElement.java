package linkedListDSA;

public class FindElement {

    Node head;

    class Node {
        int data;
        Node next;
        
        public Node(int data){
            this.data=data;
            this.next= null;

        }
    }
    public void pushNode(int data){
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    public void printNode(){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }

    }
    
    public int getLen() {
        int len=0;
        Node temp = head;
        while(temp!=null) {
            len++;
            temp = temp.next;
        }
        return len;

    }

    public void printMiddle() {
        if(head!=null){
            int len = getLen();
            Node temp = head;

            int middle = len/2;

            while(middle!=0){
                temp = temp.next;
                middle--;
            }
            System.out.println("Middle element is: "+ temp.data);
            System.out.println();
        }
    }

    public static void main(String args[]){

        FindElement list = new FindElement();

        for(int i=5;i>0;i--){
            list.pushNode(i);
        }
        list.printNode();
        list.printMiddle();
    }
    
}

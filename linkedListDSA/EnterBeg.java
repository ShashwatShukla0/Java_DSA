package linkedListDSA;

public class EnterBeg {
    
    Node head;
    
    class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void pushNode(int data) {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    public void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String args[]){

        EnterBeg list = new EnterBeg();
        for(int i=5;i>0;i--){
            list.pushNode(i);

        }

        list.printList();
        list.pushNode(10);
        list.printList();
    }
    
}

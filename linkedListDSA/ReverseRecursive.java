package linkedListDSA;

public class ReverseRecursive {

    Node head;
    Node tail;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void addNode(int data) {
        Node new_node = new Node(data);
        if(head==null){
            head = new_node;
            tail = new_node;
        } else{
            tail.next = new_node;
            tail = new_node;
        }
        
    }

    public void printList() {
        Node temp= head;

        while(temp!= null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("NULL");

    }

    public Node revRecur(Node head) {

        if(head == null || head.next == null){
            return head;
        }

        Node newNode = revRecur(head.next);
        head.next.next = head;
        head.next = null;

        return newNode;

    }

    public static void main(String args[]){
        ReverseRecursive list = new ReverseRecursive();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);

        list.printList();

        list.head=list.revRecur(list.head);
        list.printList();
    }
    
}

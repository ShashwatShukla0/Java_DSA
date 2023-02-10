package linkedListDSA;

public class ReverseLL {

    static Node head;

    static class Node{
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node reverse(Node node) {

        Node prev = null;
        Node current = node;
        Node next = null;

        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        node = prev;
        return node;
    }

    void printL(Node node) {
        while(node!=null){
            System.out.print(node.data+"->");
            node = node.next;
        }
    }

    public static void main(String args[]) {

        ReverseLL list = new ReverseLL();

        list.head = new Node(85);
        list.head.next = new Node(63);
        list.head.next.next = new Node(93);
        list.head.next.next.next = new Node(32);

        System.out.println("Before reverse: ");
        list.printL(head);
        head = list.reverse(head);
        System.out.println();
        System.out.println("After reverse: ");
        list.printL(head);
    }
    
}

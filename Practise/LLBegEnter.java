package Practise;

public class LLBegEnter {

    Node head;

class Node{

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

void pushBeg(int data){
    Node n = new Node(data);
    n.next = head;
    head = n;

}



void printList() {
    Node temp = head;

    while(temp!=null){
        System.out.print(temp.data+"->");
        temp = temp.next;
    }
    System.out.println("NULL");
}

    public static void main(String[] args) {

        LLBegEnter e = new LLBegEnter();

        for(int i=5;i>0;i--){
            e.pushBeg(i);
        }
        e.pushBeg(10);
        e.printList();
    }
    
}

package linkedListDSA;

import java.util.Scanner;

public class EnterMiddle {

    Node head;

    class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addList(int data) {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    public void printList() {
        Node temp = head;

        while(temp!= null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("NULL");

    }

    public int middleEle(){
        Node temp = head;
        int len=0;
        while(temp!=null) {
            len++;
            temp = temp.next;
        }
        int middle = len/2;
        return middle;
    }

    public void enterMid(int data) {
        
        int mid = middleEle();
        Node ptr = head;
        Node n = new Node(data);
        if(head==null){
            head = new Node(data);
        } else
        {
            while(mid-- >1){
                ptr = ptr.next;
            }
            n.next = ptr.next;
            ptr.next = n;

        }
        
    }

    public static void main(String args[]) {

        EnterMiddle list = new EnterMiddle();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of element to be inserted: ");
        int n = sc.nextInt();

        for(int i=0;i<n;i++) {
            int a=0;
            a = sc.nextInt();
            list.addList(a);
        }
        list.printList();
        System.out.println("Enter element to be entered at mid: ");
        int b = sc.nextInt();
        list.enterMid(b);
        list.printList();

        sc.close();
    }
    
}

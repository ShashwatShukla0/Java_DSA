package queueDSA;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class ScratchQueue {

    Node front, rear;

    ScratchQueue(){
        this.front = this.rear =null;
    }

    void enque(int data){
        Node node = new Node(data);

        if(rear = null){
            rear = front = null;
        }
        
    }
    
}

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

    boolean isEmpty(){
        return front == null & rear == null;
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty: ");
            return -1;
        }
        return front.data;
    }

    void enque(int data){
        Node node = new Node(data);

        if(this.rear == null){
            this.rear = this.front = null;
            return;
        }

        this.rear.next = node;
        this.rear = node;
        
    }

    int deque(){
        if(this.front == null){
            return -1;
        }

        int node = this.front.data;
        this.front = this.front.next;

        if(this.front == null){
            this.rear = null;
        }
        return node;
    }

    public static void main(String[] args){

        ScratchQueue q = new ScratchQueue();
        q.enque(1);
        q.enque(2);
        q.enque(3);
        q.enque(4);
        q.enque(5);
        q.enque(6);
        q.enque(7);
        q.enque(8);
        
        while(!q.isEmpty()){
            System.out.println("Queue is: "+ q.peek());
            q.deque();
        }
    }
    
}

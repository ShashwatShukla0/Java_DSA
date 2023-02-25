package linkedListDSA;

public class DeleteNode {

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

    public Node deleteNode(int pos) {
        Node temp = head;
        Node prev = head;

        for(int i=0;i<pos;i++){
            if(i==0 && pos==1) {
                head = head.next;
            } else
            {
                if(i == pos-1 && temp!= null){
                    prev.next = temp.next;
                } else {
                    prev = temp;

                    if(prev == null){
                        break;

                    }
                    temp = temp.next;
                }
            }
        }
        return head;
    }

    public static void main(String args[]) {

        DeleteNode list = new DeleteNode();

        for(int i=5;i>0;i--) {
            list.pushNode(i);
        }

        list.printList();

        list.deleteNode(5);
        list.printList();

        list.deleteNode(3);
        list.printList();

        list.deleteNode(1);
        list.printList();

    }
    
}

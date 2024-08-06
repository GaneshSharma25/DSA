package SinglyLinkedList;

public class CircularLinkedList {

    private Node head;

    public CircularLinkedList() {
        head = null;
    }

    public boolean insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.setNext(head);
            return true;
        }
        Node temp = head;
        do {
            temp = temp.getNext();
        } while (temp.getNext() != head);
        temp.setNext(newNode);
        temp.getNext().setNext(head);
        return true;
    }

    //display

    public void display(){
        if(head == null){
            return;
        }
        Node temp = head;
        do{
            System.out.print(temp.getData() +" ");
            temp = temp.getNext();
        }while(temp != head);
    }

}

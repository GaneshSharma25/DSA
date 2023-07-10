package DoublyLinkedList;

public class DoublyLinkedList {
    private Node head;

    public DoublyLinkedList() {
        head = null;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void display(){
        if(head == null){
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.getData() +" ");
            temp = temp.getNext();
        }
    }

    public boolean insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return true;
        }
        Node temp = head;
        while(temp.getNext() != null){
            temp = temp.getNext();
        }
        temp.setNext(newNode);
        newNode.setPrev(temp);
        return true;
    }

    public boolean insertAtBegin(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return true;
        }
        newNode.setNext(head);
        head.setPrev(newNode);
        head = newNode;
        return true;
    }

    

}

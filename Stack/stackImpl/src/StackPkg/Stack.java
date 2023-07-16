package StackPkg;
public class Stack {

    
    public Stack() {
        head = null;
    }

    //add first -- push
    public boolean push(int data){
        Node newNode = new Node(data);
        if(head == null){
          head = newNode;
          return true; 
        }
        newNode.setNext(head);
        head = newNode;
        return true;
    }

    public boolean pop(){
        if(head == null){
            return false;
        }
        head = head.getNext();
        return true;
    }

     public boolean isEmpty(){
        if(head == null){
            return true;
        }else{
            return false;
        }
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


    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

    }

    private Node head;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

}

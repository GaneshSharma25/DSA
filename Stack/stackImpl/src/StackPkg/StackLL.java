package StackPkg;

public class StackLL {
    
    private Node top ;
    

    public StackLL() {
        top = null;
    }

    public boolean push(int data){
        Node newNode = new Node(data);
        if(top == null){
            top = newNode;
            return true;
        }
        newNode.setNext(top);
        top = newNode;
        return true;
    }

    public boolean pop(){
        if(top == null){
            return false;
        }
        if(top.getNext() == null){
            top = null;
        }
        top = top.getNext();
        return true;
    }

    public Node peek(){
        return top;
    }

    public boolean isEmpty(){
        if(top == null){
            return true;
        }else{
            return false;
        }
    }

    class Node{
        private int data;
        private Node next;
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
        public Node(int data) {
            this.data = data;
            next = null;
        }
        
    }


    public Node getTop() {
        return top;
    }


    public void setTop(Node top) {
        this.top = top;
    }

    public void display() {
        
    }
}

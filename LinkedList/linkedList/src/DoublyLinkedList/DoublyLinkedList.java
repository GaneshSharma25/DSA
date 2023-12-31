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

    public void reverseDLL(){
        if(head == null || head.getNext() == null){
            return;
        }

        Node temp = head;
        Node prev = null;
        while(temp != null){
            prev = temp.getPrev();
            temp.setPrev(temp.getNext());
            temp.setNext(prev);
            temp = temp.getPrev();
        }
        head = prev.getPrev();
        display();
    }
    public boolean deleteAtPosition(int num) {
		if(head == null) {
			return false;
		}
		int pos = 1;
		if(num ==1) {
			head.getNext().setPrev(null);
			head = head.getNext();
			return true;
		}
		Node temp = head;
		while(temp != null) {
			if(pos == num) {
				if(temp.getNext() != null) {
					temp.getPrev().setNext(temp.getNext());
					temp.getNext().setPrev(temp.getPrev());
					temp = null;
					return true;
				}else {
					temp.getPrev().setNext(null);
					temp = null;
					return true;
				}
			}
			
			temp = temp.getNext();
			pos++;
		}
		return false;
	}

    

}

package SinglyLinkedList;
public class LinkedList {

    private Node head;

    public LinkedList() {
        head = null;
    }

    public boolean insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return true;
        }

        Node temp = head;

        while (temp != null) {
            if (temp.getNext() == null) {
                temp.setNext(newNode);
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

    public boolean insertAtBegin(int data) {

        Node newNode = new Node(data);

        // if (head == null) {
        // head = newNode;
        // return true;
        // }

        // Node temp = head;
        // head = newNode;
        // newNode.setNext(temp);
        // return true;
        newNode.setNext(head);
        head = newNode;
        return true;

    }

    public void display() {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            if (temp.getNext() == null) {
                return;
            }
            temp = temp.getNext();
        }
    }

    public boolean deleteAtBegin() {
        if (head == null) {
            return false;
        }
        head = head.getNext();
        return true;
    }

    public boolean deleteLastNode() {
        if (head == null) {
            return false;
        }
        Node temp = head;
        if (temp.getNext() == null) {
            head = null;
            return true;
        }
        while (temp.getNext().getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(null);
        ;
        return true;

    }

    public boolean insertAtPosition(int data, int position) {
        int count = 1;
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            count++;
            return true;
        }
        Node temp = head;
        while (temp != null) {

            if (count == position - 1) {
                newNode.setNext(temp.getNext());
                temp.setNext(newNode);
                return true;
            }

            temp = temp.getNext();
            count++;

        }

        return false;
    }

    public int searchLinkedList(int data) {
        int pos = 1;

        if (head == null) {
            return -1;
        }

        Node temp = head;

        while (temp != null) {
            if (temp.getData() == data) {
                return pos;
            }
            temp = temp.getNext();
            pos++;
        }

        return -1;

    }

    // ---------------------------------------------------------------------------
    // recursive solution
    public int searchLLRecursive(Node node, int data) {
        if (node == null)
            return -1;
        if (node.getData() == data)
            return 1;
        else {
            int res = searchLLRecursive(node.getNext(), data);
            if (res == -1)
                return -1;
            else
                return (res + 1);
        }
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

}

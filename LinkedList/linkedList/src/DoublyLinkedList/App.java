package DoublyLinkedList;

import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insert(50);
        dll.insert(60);
        dll.insert(90);
        dll.insertAtBegin(155);
        dll.display();
        System.out.println();
        dll.reverseDLL();

        LinkedList ll =new LinkedList<>();

    }
}

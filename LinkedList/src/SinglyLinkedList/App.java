package SinglyLinkedList;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        LinkedList ll = new LinkedList();
        ll.insertAtBegin(10);
        ll.insert(50);
        ll.insert(60);
        ll.insert(90);
        ll.insert(988);
        // ll.insertAtBegin(60);
      //  ll.display();
    //    ll.deleteAtBegin();
     //   System.out.println();
       // ll.display();
     //   ll.deleteLastNode();
     //   System.out.println();
        ll.display();
        ll.reverse();
        System.out.println();
        ll.display();
        System.out.println();
        System.out.println(ll.findMid());
      //  ll.insertAtPosition(100,2);
      //  ll.display();
      // ll.deleteLast();
      //   System.out.println();
      //   ll.display();
      //   System.out.println("\nPosition : "+ll.searchLinkedList(60));
      //  System.out.println("recursive SolN : "+ll.searchLLRecursive(ll.getHead(),600));

      // CircularLinkedList cll = new CircularLinkedList();
      // cll.insert(40);
      // cll.insert(50);
      // cll.insert(60);
      // cll.display();

    }
}

import BST.BST;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
      //  BinarySearchTree bst = new BinarySearchTree();
        BST bst = new BST();

        System.out.println(bst.add(50));
        System.out.println(bst.add(30)); 
        System.out.println(bst.add(90));
        System.out.println(bst.add(10));
        System.out.println(bst.add(40));
        System.out.println(bst.add(20));
        System.out.println(bst.add(70));
        System.out.println(bst.add(100));
        System.out.println(bst.add(60));
        System.out.println(bst.add(80));
        bst.inOrderTraversal();
    }
}

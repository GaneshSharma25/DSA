public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        BinarySearchTree bst = new BinarySearchTree();
        System.out.println(bst.insert(50));
        System.out.println(bst.insert(40));
        System.out.println(bst.insert(45));
        System.out.println(bst.insert(30));
        System.out.println(bst.insert(20));
        System.out.println(bst.insert(80));
        System.out.println(bst.insert(85));
        System.out.println(bst.insert(90));
       
        bst.preOrderTraversal();
    }
}

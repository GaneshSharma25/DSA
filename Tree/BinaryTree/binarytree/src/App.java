import BST.BST;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
      //  BinarySearchTree bst = new BinarySearchTree();
        BST bst = new BST();
        bst.add(50);
        bst.add(30); 
        bst.add(90);
        bst.add(10);
        bst.add(40);
        bst.add(20);
        bst.add(70);
        bst.add(100);
        bst.add(60);
        bst.add(80);
        bst.insert(110);
        bst.insert(56);
        bst.findHeight(bst.getRoot());

       // bst.inOrderTraversal();
        bst.preOrderTrav();
        bst.delNode(bst.getRoot(),110);
        System.out.println();
        bst.preOrderTrav();
        
        // bst.preOrderTraversal(bst.getRoot());
        // System.out.println();
        // bst.preOrderTrav();
        // System.out.println();
        // bst.bfs(80);
        // System.out.println("DFS : "+bst.dfs(80));
        // System.out.println("BinarySearch : "+bst.binarySearch(80));
    }
}

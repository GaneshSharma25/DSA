package BST;

public class BST {
    Node root;

    public boolean add(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node trav = root;
        while (true) {
            if (trav.getData() > data) {
                if (trav.getLeft() != null) {
                    trav = trav.getLeft();
                } else {
                    trav.setLeft(newNode);
                    return true;
                }
            } else {
                if (trav.getRight() != null) {
                    trav = trav.getRight();
                } else {
                    trav.setRight(newNode);
                    return true;
                }
            }

        }

    }

    public void preOrderTraversal(Node root){
        if(root == null){
            return;
        }
        Node trav = root;
        System.out.print(trav.getData() +" ");
        preOrderTraversal(trav.getLeft());
        preOrderTraversal(trav.getRight());
    }

    public void postOrderTraversal(Node root){
        if(root == null){
            return;
        }
        Node trav = root;
        postOrderTraversal(trav.getLeft());
        postOrderTraversal(trav.getRight());
        System.out.print(trav.getData() +" ");

    }

    public void inOrderTraversal(Node root){
        if(root == null){
            return;
        }
        Node trav = root;
        inOrderTraversal(trav.getLeft());
        System.out.print(trav.getData() +" ");
        inOrderTraversal(trav.getRight());
    }
  //wrapper method..
    public void inOrderTraversal(){
        inOrderTraversal(root);
    }





    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}

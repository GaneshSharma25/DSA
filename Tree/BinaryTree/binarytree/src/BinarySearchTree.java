import java.util.Stack;

public class BinarySearchTree {

    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    public boolean insert(int data) {

        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (temp.getData() == data) {
                return false;
            }

            if (temp.getData() > data) {
                if (temp.getLeft() == null) {
                    temp.setLeft(newNode);
                    return true;
                } else {
                    temp = temp.getLeft();
                }
            } else {
                if (temp.getRight() == null) {
                    temp.setRight(newNode);
                    return true;
                } else {
                    temp = temp.getRight();
                }
            }
        }

    }

    public void preOrderTraversal() {
        Node temp = root;
        Stack<Node> stack = new Stack<>();

        System.out.println("In PreOrder: ");
        while (temp != null || !stack.empty()) {
            while (temp != null) {
                System.out.print(temp.getData() +" ");
                stack.push(temp);
                temp = temp.getLeft();
            }

            temp = stack.pop().getRight();

        }

    }

    public void inOrderTraversal(){
        Node temp = root;
        Stack<Node> stack = new Stack<>();

        System.out.println("In Inorder : ");

        while(temp != null){
            
        }
    }

}
package BST;

import java.util.LinkedList;
import java.util.Stack;

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

    public void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        Node trav = root;
        System.out.print(trav.getData() + " ");
        preOrderTraversal(trav.getLeft());
        preOrderTraversal(trav.getRight());
    }

    public void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        Node trav = root;
        postOrderTraversal(trav.getLeft());
        postOrderTraversal(trav.getRight());
        System.out.print(trav.getData() + " ");

    }

    // non recursive method...
    public void preOrderTrav() {
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node trav = root;
        while (trav != null || !stack.empty()) {
            while (trav != null) {
                System.out.print(trav.getData() + " ");
                if (trav.getRight() != null) {
                    stack.push(trav.getRight());
                }
                trav = trav.getLeft();
            }
            if (!stack.isEmpty())
                trav = stack.pop();
        }
    }

    public void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        Node trav = root;
        inOrderTraversal(trav.getLeft());
        System.out.print(trav.getData() + " ");
        inOrderTraversal(trav.getRight());
    }

    // wrapper method..
    public void inOrderTraversal() {
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

    // breadth first search..
    public boolean bfs(int data) {
        LinkedList<Node> queue = new LinkedList<>();
        Node trav = null;
        queue.add(root);
        while (!queue.isEmpty()) {
            trav = queue.poll();
            if (trav.getData() == data) {
                System.out.println("Data found: " + trav.getData());
                return true;
            }
            if (trav.getLeft() != null) {
                queue.add(trav.getLeft());
            }
            if (trav.getRight() != null) {
                queue.add(trav.getRight());
            }
        }
        System.out.println("Data not found!!");
        return false;
    }

    // depth first search
    public boolean dfs(int data) {

        Stack<Node> stack = new Stack<>();
        stack.push(root);
        Node trav = null;
        while (!stack.isEmpty()) {
            trav = stack.pop();

            if (trav.getData() == data) {
                return true;
            }
            if (trav.getRight() != null) {
                stack.push(trav.getRight());
            }
            if (trav.getLeft() != null) {
                stack.push(trav.getLeft());
            }
        }
        return false;
    }

    // better option
    // Binary search..
    public boolean binarySearch(int data) {

        Node trav = root;
        while (trav != null) {
            if (trav.getData() == data) {
                return true;
            }
            if (data < trav.getData()) {
                trav = trav.getLeft();
            } else {
                trav = trav.getRight();
            }
        }
        return false;
    }

    // Insert element in bst
    public boolean insert(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node trav = root;

        while (true) {
            if (trav.getData() == data) {
                return false;
            }
            if (data < trav.getData()) {
                if (trav.getLeft() == null) {
                    trav.setLeft(newNode);
                    return true;
                }
                trav = trav.getLeft();
            } else {
                if (trav.getRight() == null) {
                    trav.setRight(newNode);
                    return true;
                }
                trav = trav.getRight();
            }

        }
    }

    // recursive method for search
    public boolean searchRec(Node root, int data) {
        if (root == null) {
            return false;
        } else if (root.getData() == data) {
            return true;
        } else if (root.getData() < data) {
            return searchRec(root.getRight(), data);
        } else {
            return searchRec(root.getLeft(), data);
        }
    }

    // recursive method to delete a node from a binary search tree
    public Node delNode(Node root, int data) {
        // base case: if the root is null, return null
        if (root == null) {
            return null;
        }
        // if the data value of the root is greater than the data value to be deleted,
        // recursively call the method on the left subtree
        if (root.getData() > data) {
            root.setLeft(delNode(root.getLeft(), data));
        }
        // if the data value of the root is less than the data value to be deleted,
        // recursively call the method on the right subtree
        else if (root.getData() < data) {
            root.setRight(delNode(root.getRight(), data));
        }
        // if the data value of the root is equal to the data value to be deleted,
        else {
            // if the root has no left child, return its right child
            if (root.getLeft() == null)
                return root.getRight();
            // if the root has no right child, return its left child
            else if (root.getRight() == null)
                return root.getLeft();
            // if the root has both left and right children,
            else {
                // find its inorder successor
                Node succ = getSucc(root);
                // copy its data value to the root
                root.setData(succ.getData());
                // recursively delete that successor from the right subtree
                root.setRight(delNode(root.getRight(), succ.getData()));
            }
        }
        // return the root of the modified tree
        return root;
    }

    // helper method to find and return the inorder successor of a given node
    private Node getSucc(Node root) {
        // go to its right child
        Node curr = root.getRight();
        // then repeatedly go to its left child until it reaches a leaf node
        while (curr != null && curr.getLeft() != null) {
            curr = curr.getLeft();
        }
        // return that leaf node (the inorder successor)
        return curr;
    }

    public int findHeight(Node root) {
        // Check if the root is null, which means the tree is empty
        if (root == null) {
            return 0;
        }
        // Recursively calculate the height of the left subtree
        int lh = findHeight(root.getLeft());
        // Recursively calculate the height of the right subtree
        int rh = findHeight(root.getRight());
        // Compare the heights of the left and right subtrees
        if (rh > lh) {
            // If the right subtree is taller, return its height plus 1
            return 1 + rh;
        } else {
            // Otherwise, return the height of the left subtree plus 1
            return 1 + lh;
        }
    }
    

}

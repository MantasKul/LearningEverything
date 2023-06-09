package BinaryTree;

public class BinaryTree {
    public Node root;


    private Node addRecursive(Node current, int value) {
        if(current == null) return new Node(value);

        if(value < current.value) current.left = addRecursive(current.left, value);
        else if (value > current.value) current.right = addRecursive(current.right, value);
        else return current;

        return current;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }
}

class Node {
    int value;
    Node left;
    Node right;
    Node (int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
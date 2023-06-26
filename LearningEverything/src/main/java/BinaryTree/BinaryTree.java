package BinaryTree;

public class BinaryTree {
    public BinaryNode root;


    private BinaryNode addRecursive(BinaryNode current, int value) {
        if(current == null) return new BinaryNode(value);

        if(value < current.value) current.left = addRecursive(current.left, value);
        else if (value > current.value) current.right = addRecursive(current.right, value);
        else return current;

        return current;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    // depth-first search
    public void DFS(BinaryNode node) {
        if (node != null) {
            DFS(node.left);
            System.out.print(" " + node.value);
            DFS(node.right);
        }
    }
}

class BinaryNode {
    int value;
    BinaryNode left;
    BinaryNode right;
    BinaryNode (int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
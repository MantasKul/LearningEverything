package NaryTree;

import java.util.ArrayList;
import java.util.List;

public class Node {
    public int value;
    public List<Node> child;

    public Node(int value){
        this.value = value;
        this.child = new ArrayList<>();
    }

    public Node addChild(int value) {
        Node newChild = new Node(value);
        child.add(newChild);
        return newChild;
    }
}

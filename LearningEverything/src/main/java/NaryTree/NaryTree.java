package NaryTree;

import java.util.*;

public class NaryTree {

    public void BFSIterative(Node root){
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            for(Node i : queue) {
                System.out.print(i.value);
            }
            System.out.println();

            Node currentNode = queue.remove();

            queue.addAll(currentNode.child);
        }

    }

}


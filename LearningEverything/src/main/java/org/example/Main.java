package org.example;

import Graphs.Graph;
import Graphs.GraphTraverse;
import Graphs.TestGraph;
import Graphs.Vertex;
import NaryTree.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*// Sorted array is required
        BinarySearch bs = new BinarySearch();
        int array[] = new int[]{1, 2, 5, 13, 14, 16, 125, 953, 999};
        int valueToFind = 125;
        int answer = bs.find(array, valueToFind);
        if(answer == -1) System.out.println("Value " + valueToFind + " does not exist in the array");
            else System.out.println("Value " + valueToFind + " is at position " + answer);
         */

        // Construct binary tree and print out using depth-first algorithm
//        BinaryTree bt = new BinaryTree();
//
//        bt.add(6);
//        bt.add(4);
//        bt.add(8);
//        bt.add(3);
//        bt.add(5);
//        bt.add(7);
//        bt.add(9);
//
//        System.out.println("Depth-First Search");
//        bt.DFS(bt.root);

        // Construct n-ary Tree and print it out using breadth-first search
//        Node root = new Node(1);
//        Node newChild1 = root.addChild(2);
//        root.addChild(3);
//        root.addChild(4);

        // Graph class testing
//        Graph graph = new Graph(true, false);
//        Vertex v1 = graph.addVertex("1");
//        Vertex v2 = graph.addVertex("2");
//
//        graph.addEdge(v1, v2, 3);
//
//        graph.print();

        // DFS
        TestGraph test = new TestGraph();
        ArrayList<Vertex> visited = new ArrayList<>();
        visited.add(test.getStartingVertex());
        GraphTraverse.DFS(test.getStartingVertex(), visited);
    }
}

package Graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class GraphTraverse {

    public static void DFS(Vertex start, ArrayList<Vertex> visited) {
        System.out.println(start.getData());

        for(Edge e : start.getEdges()) {
            Vertex neighbor = e.getEnd();

            if(!visited.contains(neighbor)) {
                visited.add(neighbor);
                DFS(neighbor, visited);
            }
        }
    }

    public static void BFS(Vertex start, ArrayList<Vertex> visited) {
        Queue<Vertex> visitedQueue = new ArrayDeque<>();
        visitedQueue.add(start);
        while(!visitedQueue.isEmpty()) {
            Vertex current = visitedQueue.remove();
            System.out.println(current.getData());

            for(Edge e : current.getEdges()) {
                Vertex neighbor = e.getEnd();
                if(!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    visitedQueue.add(neighbor);
                }
            }
        }
    }
}

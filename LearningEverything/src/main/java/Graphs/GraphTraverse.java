package Graphs;

import java.util.ArrayList;

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

//    void BFS() {
//
//    }
}

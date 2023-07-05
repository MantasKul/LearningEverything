package Graphs;

import java.util.*;

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

    public static Hashtable[] Dijkstra(Graph g, Vertex start) {
        Hashtable<String, Integer> distances = new Hashtable<>();
        Hashtable<String, Vertex> previous = new Hashtable<>();
        PriorityQueue<QueueObject> queue = new PriorityQueue<QueueObject>();

        queue.add(new QueueObject(start, 0));

        for(Vertex v : g.getVertices()) {
            if(v != start) {
                distances.put(v.getData(), Integer.MAX_VALUE);
            }
            previous.put(v.getData(), new Vertex("Null"));
        }

        distances.put(start.getData(), 0);

        while(!queue.isEmpty()) {
            Vertex current = queue.poll().vertex;
            for(Edge e : current.getEdges()) {
                Integer alternative = distances.get(current.getData()) + e.getWeight();
                String neighborValue = e.getEnd().getData();
                
                if(alternative < distances.get(neighborValue)) {
                    distances.put(neighborValue, alternative);
                    previous.put(neighborValue, current);
                    queue.add(new QueueObject(e.getEnd(), distances.get(neighborValue)));
                }
            }
        }

        return new Hashtable[] {distances, previous};
    }

    public static void dijkstraResultPrinter(Dictionary[] d){
        System.out.println("Distances:\n");
        for (Enumeration keys = d[0].keys(); keys.hasMoreElements();){
            String nextKey = keys.nextElement().toString();
            System.out.println(nextKey + ": " + d[0].get(nextKey));
        }
        System.out.println("\nPrevious:\n");
        for (Enumeration keys = d[1].keys(); keys.hasMoreElements();) {
            String nextKey = keys.nextElement().toString();
            Vertex nextVertex = (Vertex) d[1].get(nextKey);
            System.out.println(nextKey + ": " + nextVertex.getData());
        }
    }

    public static void shortestPath(Graph g, Vertex start, Vertex target) {
        Hashtable[] dijkstraHashtable = Dijkstra(g, start);
        Hashtable distances = dijkstraHashtable[0];
        Hashtable previous = dijkstraHashtable[1];

        Integer distance = (Integer) distances.get(target.getData());
        System.out.println("Shortest Distance between " + start.getData() + " and " + target.getData());
        System.out.println(distance);

        ArrayList<Vertex> path = new ArrayList<>();
        Vertex v = target;

        while(v.getData() != "Null") {
            path.add(0, v);
            v = (Vertex) previous.get(v.getData());
        }
        System.out.println("Shortest Path");
        for (Vertex pathVertex: path){
            System.out.println(pathVertex.getData());
        }
    }
}

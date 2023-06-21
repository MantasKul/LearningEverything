package Graphs;

import java.util.ArrayList;

public class Graph {

    private ArrayList<Vertex> vertices;
    private boolean isWeighted;
    private boolean isDirected;

    public Graph(boolean isWeighted, boolean isDirected) {
        this.vertices = new ArrayList<Vertex>();
        this.isWeighted = isWeighted;
        this.isDirected = isDirected;
    }

    public Vertex addVertex(String data) {
        Vertex newVertex = new Vertex(data);
        this.vertices.add(newVertex);
        return newVertex;
    }

    public void removeVertex(Vertex vertex) {
        this.vertices.remove(vertex);
    }

    public void addEdge(Vertex startVertex, Vertex endVertex, Integer weight) {
        if(!this.isWeighted) {
            weight = null;
        }
        startVertex.addEdge(endVertex, weight);
        if(!this.isDirected) {
            endVertex.addEdge(startVertex, weight);
        }
    }

    public void removeEdge(Vertex startVertex, Vertex endVertex) {
        startVertex.removeEdge(endVertex);
        if(!this.isDirected) {
            endVertex.removeEdge(startVertex);
        }
    }

    public ArrayList<Vertex> getVertices() {
        return vertices;
    }

    public boolean isWeighted() {
        return isWeighted;
    }

    public boolean isDirected() {
        return isDirected;
    }

    public Vertex getVertexByValue(String data) {
        for(Vertex v : this.vertices) {
            if(v.getData() == data) return v;
        }
        return null;
    }
}

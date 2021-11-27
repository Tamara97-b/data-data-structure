package graph;


import java.util.*;

public class Graph<T, W> {

    private HashMap<T, LinkedList<Vertex<T, W>>> nodes;
    private long size;

    public Graph() {
        nodes = new HashMap<>();
    }

    public long getSize() {
        return size;
    }

    public T addNode(T value) {
        nodes.put(value, new LinkedList<>());
        size++;
        return value;
    }

    public void addEdge(T firstNode, T secondValue) {
        if (!nodes.containsValue(firstNode) || !nodes.containsValue(secondValue)) {
            return;
        }


    }
}

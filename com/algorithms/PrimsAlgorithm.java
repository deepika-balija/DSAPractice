package com.algorithms;
import java.util.*;


//Represents an edge in the graph.
 class Edge {
    int dest, weight;

    Edge(int dest, int weight) {
        this.dest = dest;
        this.weight = weight;
    }
}

public class PrimsAlgorithm {

    public static void main(String[] args) {
        // Sample graph representation (adjacency matrix)
        int vertices = 5;
        int[][] edges = {
                {0, 1, 2}, {0, 3, 6},
                {1, 2, 3}, {1, 3, 8}, {1, 4, 5},
                {2, 4, 7},
                {3, 4, 9}
        };

        int totalWeight = primsAlgorithm(vertices, edges);
        System.out.println("Total Weight of Minimum Spanning Tree: " + totalWeight);
    }

    // Prim's algorithm implementation
    public static int primsAlgorithm(int vertices, int[][] edges) {

        // Step 1: Build adjacency list from edge list
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());//Create an empty adjacency list for vertices
        }


        for (int[] edge : edges) {
            int src = edge[0], dest = edge[1], weight = edge[2];
            graph.get(src).add(new Edge(dest, weight)); // Add edge to source
            graph.get(dest).add(new Edge(src, weight)); // Add reverse edge for undirected graph
        }

        // Step 2: Initialize variables
        PriorityQueue<Edge> minHeap = new PriorityQueue<>(Comparator.comparingInt(e -> e.weight));
        //A PriorityQueue is used to maintain edges in increasing order of weight.
        //Smallest weight edges are processed first.

        boolean[] visited = new boolean[vertices]; //Tracks whether a vertex has been included in the MST to avoid cycles.
        int totalWeight = 0;//Keeps track of the sum of all edge weights in the MST.

        // Step 3: Start with vertex 0
        minHeap.add(new Edge(0, 0)); // Start with a dummy edge to vertex 0

        while (!minHeap.isEmpty()) {
            //The loop runs until all edges in the heap are processed or all vertices are visited.
            Edge current = minHeap.poll(); // Pick the smallest edge
          // Remove and retrieve the edge with the smallest weight.

            if (visited[current.dest]) {
                continue; // Skip if the vertex is already visited
            }

//            Avoid Cycles:
//            If the destination vertex of the edge is already included in the MST, skip it.

            visited[current.dest] = true; // Mark the vertex as visited
            totalWeight += current.weight; // Add the weight to total MST weight

//            Include Vertex in MST:
//            Mark the destination vertex as visited.
//            Add the weight of the edge to the MST's total weight.

            for (Edge edge : graph.get(current.dest)) { // Explore adjacent edges
                if (!visited[edge.dest]) { // Only consider unvisited vertices
                    minHeap.add(edge); // Add the edge to the heap
                }
            }
        }

//        Add Adjacent Edges to Min-Heap:
//        Loop through all edges of the current vertex.
//        If the destination vertex of an edge is unvisited, add it to the heap.


        return totalWeight; // Return the total weight of the MST
}
}
package com.TheoryOfAlgorithms.Project;

import java.util.*;

public class Dijkstra {

    public static void computePaths(Vertex source) {

        source.minDistance = 0.;
        PriorityQueue<Vertex> vertexQueue = new PriorityQueue<>();
        vertexQueue.add(source);

        while (!vertexQueue.isEmpty()) {
            Vertex u = vertexQueue.poll();

            // Visit each edge exiting u
            for (Edge e : u.adjacencies) {

                Vertex v = e.target;
                double weight = e.getWeight();
                double distanceThroughU = u.minDistance + weight;

                if (distanceThroughU < v.minDistance) {
                    vertexQueue.remove(u);
                    v.minDistance = distanceThroughU;
                    v.previous = u;
                    vertexQueue.add(v);
                }

            }
        }

    }

    public static List<Vertex> getShortestPathTo(Vertex target) {

        LinkedList<Vertex> path = new LinkedList<>();
        for (Vertex vertex = target; vertex != null; vertex = vertex.previous)
            path.add(vertex);

        Collections.reverse(path);
        return path;

    }


}
package com.TheoryOfAlgorithms.Project;

class Edge {

    public final Vertex target;
    private final double weight;

    public Edge(Vertex argTarget, double argWeight) {
        target = argTarget;
        weight = argWeight;
    }

    public double getWeight() {
        return weight;
    }
}
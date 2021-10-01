package com.TheoryOfAlgorithms.Project;

import java.util.List;

public class Processor {

    public static void main(String[] args) {

        // mark all the vertexes
        Vertex A = new Vertex("A");
        Vertex B = new Vertex("B");
        Vertex D = new Vertex("D");
        Vertex F = new Vertex("F");
        Vertex K = new Vertex("K");
        Vertex J = new Vertex("J");
        Vertex M = new Vertex("M");
        Vertex O = new Vertex("O");
        Vertex P = new Vertex("P");
        Vertex R = new Vertex("R");
        Vertex Z = new Vertex("Z");

        // set the edges and weight
        A.adjacencies = new Edge[]{new Edge(M, 8)};
        B.adjacencies = new Edge[]{new Edge(D, 11)};
        D.adjacencies = new Edge[]{new Edge(B, 11)};
        F.adjacencies = new Edge[]{new Edge(K, 23)};
        K.adjacencies = new Edge[]{new Edge(O, 40)};
        J.adjacencies = new Edge[]{new Edge(K, 25)};
        M.adjacencies = new Edge[]{new Edge(R, 8)};
        O.adjacencies = new Edge[]{new Edge(K, 40)};
        P.adjacencies = new Edge[]{new Edge(Z, 18)};
        R.adjacencies = new Edge[]{new Edge(P, 15)};
        Z.adjacencies = new Edge[]{new Edge(P, 18)};

        Dijkstra.computePaths(A); // run Dijkstra
        System.out.println("Distance to " + Z + ": " + Z.minDistance);
        List<Vertex> path = Dijkstra.getShortestPathTo(Z);
        System.out.println("Path: " + path);
        

        /*
        // km from one city to another
        double POtoKY = 342.3;
        double KYtoKH = 481.6;
        double KHtoVI = 745.4;
        double VItoLV = 363.8;

        double KYtoVI = 268.2;
        double KYtoLV = 539.6;
        double POtoVI = 599.7;
        double POtoKH = 143.0;


        String[] ivanovichiMembers = new String[] {"Ivan", "Petro", "Galina"};
        String[] ivanovichiCities = new String[] {"PO", "KY", "KH", "VI", "LV"};
        Family Ivanovichi = new Family("Ivanovichi", ivanovichiMembers, ivanovichiCities);

        Vertex PO = new Vertex("PO");
        Vertex KY = new Vertex("KY");
        Vertex KH = new Vertex("KH");
        Vertex VI = new Vertex("VI");
        Vertex LV = new Vertex("LV");

        PO.adjacencies = new Edge[]{new Edge(KY, POtoKY)};
        KY.adjacencies = new Edge[]{new Edge(KH, KYtoKH)};
        KH.adjacencies = new Edge[]{new Edge(VI, KHtoVI)};
        VI.adjacencies = new Edge[]{new Edge(LV, VItoLV)};

        KY.adjacencies = new Edge[]{new Edge(VI, KYtoVI)};
        KY.adjacencies = new Edge[]{new Edge(LV, KYtoLV)};
        PO.adjacencies = new Edge[]{new Edge(VI, POtoVI)};
        PO.adjacencies = new Edge[]{new Edge(KH, POtoKH)};

        Dijkstra.computePaths(KY); // run Dijkstra
        System.out.println("Distance to " + VI + ": " + VI.minDistance);
        List<Vertex> path1 = Dijkstra.getShortestPathTo(VI);
        System.out.println("Path: " + path1);
        
         */


    }

}

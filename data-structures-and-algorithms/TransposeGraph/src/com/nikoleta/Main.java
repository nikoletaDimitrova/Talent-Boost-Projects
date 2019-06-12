package com.nikoleta;


public class Main {

    public static void main(String[] args) {
       Graph graph = new Graph();
       graph.addVertex();
       graph.addVertex();
       graph.addVertex();
       graph.addEdge(0,1);
       graph.addEdge(0,2);
       graph.addEdge(1,0);
//       System.out.println(graph.getTranposeVertex());
       graph.BFS();


    }
}

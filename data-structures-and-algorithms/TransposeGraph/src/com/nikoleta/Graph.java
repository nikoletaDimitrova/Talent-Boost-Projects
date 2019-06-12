package com.nikoleta;

import java.util.*;

public class Graph {
    public List<List<Integer>> graph;

    public Graph() {
        this.graph = new LinkedList<List<Integer>>();

    }

    public void addVertex(){
        graph.add(new LinkedList<Integer>());
    }

    public void addEdge(int vertex1, int y){
        graph.get(vertex1).add(y);
    }

    public List<List<Integer>> getTranposeVertex(){
       List<List<Integer>> transposeGraph = new LinkedList<List<Integer>>();
       for(int i=0; i<graph.size(); i++){
           transposeGraph.add(new LinkedList<Integer>());
       }
       for(int i=0; i<graph.size(); i++){
           for(int j=0; j<graph.get(i).size(); j++){
               transposeGraph.get(graph.get(i).get(j)).add(i);
           }
       }
       return transposeGraph;
    }

    public void BFS(){
        boolean[] visited = new boolean[graph.size()];
        Queue<Integer> queue = new ArrayDeque<Integer>();
        queue.add(0);
        visited[0] = true;
        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            List<Integer> children = graph.get(currentNode);
           for(Integer child: children){
               if(visited[child] == false) {
                   queue.add(child);
                   visited[child] = true;
                   System.out.println(child);
               }
               }
        }
    }
}

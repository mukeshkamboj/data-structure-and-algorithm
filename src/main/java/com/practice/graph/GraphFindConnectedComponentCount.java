package com.practice.graph;

import com.practice.graph.GraphAL.Edge;

public class GraphFindConnectedComponentCount {

  public int findCount(int[][] edges, int vertices) {
    int connectedComponentCount = 0;
    GraphAL graph = new GraphAL(edges, vertices);
    boolean[] visited = new boolean[vertices + 1];
    for (int v = 1; v <= vertices; v++) {
      visited[v] = true;
      for (Edge edge : graph.getEdges()[v]) {
        if (!visited[edge.getDestination()]) {
          connectedComponentCount++;
          iterateAllConnectedComponent(graph, edge.getDestination(), visited);
        }
      }
    }
    return connectedComponentCount;
  }

  private void iterateAllConnectedComponent(GraphAL graph, int source, boolean[] visited) {
    visited[source] = true;
    for (Edge edge : graph.getEdges()[source]) {
      if (!visited[edge.getDestination()]) {
        iterateAllConnectedComponent(graph, edge.getDestination(), visited);
      }
    }
  }
}

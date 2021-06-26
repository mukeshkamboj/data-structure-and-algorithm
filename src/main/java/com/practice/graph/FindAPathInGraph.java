package com.practice.graph;

import com.practice.graph.GraphAL.Edge;

public class FindAPathInGraph {

  public boolean pathExistsDfs(int[][] edges, int vertices, int source, int destination) {
    GraphAL graph = new GraphAL(edges, vertices);
    return findPath(graph, new boolean[vertices+1], source, destination);
  }

  private boolean findPath(GraphAL graph, boolean[] visited, int source, int destination) {
    if (source == destination) {
      return true;
    }

    visited[source] = true;
    for (Edge edge : graph.getEdges()[source]) {
      if (!visited[edge.getDestination()]) {
        boolean foundPath = findPath(graph, visited, edge.getDestination(), destination);
        if (foundPath) {
          return true;
        }
      }
    }

    return false;
  }
}

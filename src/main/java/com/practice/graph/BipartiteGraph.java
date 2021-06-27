package com.practice.graph;

import com.practice.graph.GraphAL.Edge;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BipartiteGraph {

  public boolean isBipartiteGraph(int[][] edges, int vertices) {
    GraphAL graph = new GraphAL(edges, vertices);
    int[] visited = new int[vertices + 1];
    Arrays.fill(visited, -1);
    for (int i = 1; i <= vertices; i++) {
      if (visited[i] == -1) {
        if (!checkBipartiteComponent(graph, visited, i)) {
          return false;
        }
      }
    }
    return true;
  }

  private boolean checkBipartiteComponent(GraphAL graph, int[] visited, int source) {
    Queue<Pair> queue = new LinkedList<>();
    queue.add(new Pair(source, 0));
    while ((queue.size() != 0)) {
      Pair p = queue.poll();
      if (visited[p.v] == -1) {
        visited[p.v] = p.level;
      } else if (visited[p.v] != p.level) {
        return false;
      }

      for (Edge edge : graph.getEdges()[p.v]) {
        if (visited[edge.getDestination()] == -1) {
          queue.add(new Pair(edge.getDestination(), p.level + 1));
        }
      }
    }
    return true;
  }

  private static class Pair {

    private int v;
    private int level;

    Pair(int v, int level) {
      this.v = v;
      this.level = level;
    }
  }
}

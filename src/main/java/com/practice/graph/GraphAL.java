package com.practice.graph;

import java.util.HashSet;
import java.util.Set;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
public class GraphAL {

  private Set<Edge>[] edges;
  private int v;

  public GraphAL(int[][] graph, int v) {
    edges = new HashSet[v + 1];

    for (int i = 0; i < v + 1; i++) {
      edges[i] = new HashSet<>();
    }

    for (int[] e : graph) {
      Edge e1 = new Edge(0, e[0], e[1]);
      Edge e2 = new Edge(0, e[1], e[0]);
      edges[e[0]].add(e1);
      edges[e[1]].add(e2);
      if (e.length == 3) {
        e1.setWeight(e[2]);
        e2.setWeight(e[2]);
      }
    }
  }

  @Data
  @EqualsAndHashCode
  public static class Edge {

    private int weight;
    private int source;
    private int destination;

    Edge(int weight, int source, int destination) {
      this.weight = weight;
      this.source = source;
      this.destination = destination;
    }
  }
}

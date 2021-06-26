package com.practice.graph;

public class IslandCountsMatrixGraph {

  public int countIsland(int[][] graph) {
    boolean[][] visited = new boolean[graph.length][graph[0].length];
    int count = 0;
    for (int i = 0; i < graph.length; i++) {
      for (int j = 0; j < graph[i].length; j++) {

        if (!visited[i][j] && graph[i][j] == 0) {
          findConnectedNode(graph, visited, i, j);
          count++;
        }
      }
    }
    return count;
  }

  private void findConnectedNode(int[][] graph, boolean[][] visited, int i, int j) {
    if (i >= graph.length || i < 0 || j >= graph[i].length || j < 0 || visited[i][j]
        || graph[i][j] == 1) {
      return;
    }
    visited[i][j] = true;
    findConnectedNode(graph, visited, i + 1, j);
    findConnectedNode(graph, visited, i - 1, j);
    findConnectedNode(graph, visited, i, j + 1);
    findConnectedNode(graph, visited, i, j - 1);
  }
}

package com.practice.graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

//https://leetcode.com/problems/all-paths-from-source-to-target/
public class AllPathsFromSourceToTarget {

  public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
    Stack<Integer> path = new Stack<>();
    List<List<Integer>> result = new LinkedList<>();
    path.add(0);
    dfs(graph, 0, path, result);
    return result;
  }

  private static void dfs(int[][] graph, int startVertex, Stack<Integer> path,
      List<List<Integer>> result) {
    if (startVertex == graph.length - 1) {
      result.add(new LinkedList<>(path));
      return;
    }

    for (int vertex : graph[startVertex]) {
      path.add(vertex);
      dfs(graph, vertex, path, result);
      path.pop();
    }
  }
}

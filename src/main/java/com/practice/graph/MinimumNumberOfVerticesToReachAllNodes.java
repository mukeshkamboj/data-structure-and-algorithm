package com.practice.graph;

import java.util.LinkedList;
import java.util.List;

public class MinimumNumberOfVerticesToReachAllNodes {

  public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
    int[] inDegree = new int[n];
    for (List<Integer> edge : edges) {
      inDegree[edge.get(1)] += 1;
    }

    List<Integer> result = new LinkedList<>();
    for (int i = 0; i < inDegree.length; i++) {
      if (inDegree[i] == 0) {
        result.add(i);
      }
    }
    return result;
  }
}
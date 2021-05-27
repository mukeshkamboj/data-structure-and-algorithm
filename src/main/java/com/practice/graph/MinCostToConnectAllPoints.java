package com.practice.graph;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

//https://leetcode.com/problems/min-cost-to-connect-all-points/
public class MinCostToConnectAllPoints {

  public int minCostConnectPoints(int[][] points) {
    int pointsCount = points.length;
    int[][] dist = new int[pointsCount][pointsCount];
    int[] disjointSet = new int[pointsCount];
    IntStream.range(0, pointsCount).forEach(i -> disjointSet[i] = i);
    int visitedPoints = pointsCount;
    int minCost = 0;
    PriorityQueue<int[]> sortedEdges = new PriorityQueue<>(
        Comparator.comparingInt(p -> dist[p[0]][p[1]]));

    for (int i = 0; i < pointsCount; i++) {
      for (int j = i + 1; j < pointsCount; j++) {
        dist[i][j] = Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);
        sortedEdges.add(new int[]{i, j});
      }
    }

    while (!sortedEdges.isEmpty() && visitedPoints > 1) {
      int[] edge = sortedEdges.poll();
      if (union(disjointSet, edge[0], edge[1])) {
        minCost += dist[edge[0]][edge[1]];
        visitedPoints--;
      }
    }

    return minCost;
  }

  private static boolean union(int[] disjointSet, int i, int i1) {

    int rootI = findRoot(disjointSet, i);
    int rootI1 = findRoot(disjointSet, i1);

    if (rootI == rootI1) {
      return false;
    }
    disjointSet[rootI] = rootI1;

    return true;
  }

  private static int findRoot(int[] disjointSet, int i) {
    int ip = disjointSet[i];
    if (ip != i) {
      disjointSet[i] = findRoot(disjointSet, ip);
    }
    return disjointSet[i];
  }
}

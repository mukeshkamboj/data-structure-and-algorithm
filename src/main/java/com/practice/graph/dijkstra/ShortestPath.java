package com.practice.graph.dijkstra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

public class ShortestPath {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(shortestReach(3, new int[][]{{1, 2, 10}, {2, 3, 5}}, 1)));
    System.out.println(Arrays
        .toString(shortestReach(4, new int[][]{{1, 2, 24}, {1, 4, 20}, {3, 1, 3}, {4, 3, 12}}, 1)));
    System.out.println(
        Arrays.toString(shortestReach(5, new int[][]{{1, 2, 10}, {1, 3, 6}, {2, 4, 8}}, 2)));
  }

  static int[] shortestReach(int n, int[][] edges, int startVertexIndex) {
    int[] distanceFromStartVertexIndex = new int[n];
    boolean[] settledNode = new boolean[n];
    PriorityQueue<Integer> queue = new PriorityQueue<>(
        Comparator.comparingInt(node -> distanceFromStartVertexIndex[node]));
    List<Map<Integer, Integer>> adjacencyList = new ArrayList<>(n);

    IntStream.range(0, n).forEach(i -> {
      distanceFromStartVertexIndex[i] = -1;
      adjacencyList.add(new HashMap<>());
    });

    IntStream.range(0, edges.length).forEach(i -> {
      int[] edge = edges[i];
      if (adjacencyList.get(edge[0] - 1).containsKey(edge[1] - 1)) {
        if (adjacencyList.get(edge[0] - 1).get(edge[1] - 1) > edge[2]) {
          adjacencyList.get(edge[0] - 1).put(edge[1] - 1, edge[2]);
        }
      } else {
        adjacencyList.get(edge[0] - 1).put(edge[1] - 1, edge[2]);
      }

      if (adjacencyList.get(edge[1] - 1).containsKey(edge[0] - 1)) {
        if (adjacencyList.get(edge[1] - 1).get(edge[0] - 1) > edge[2]) {
          adjacencyList.get(edge[1] - 1).put(edge[0] - 1, edge[2]);
        }
      } else {
        adjacencyList.get(edge[1] - 1).put(edge[0] - 1, edge[2]);
      }
    });

    distanceFromStartVertexIndex[startVertexIndex - 1] = 0;

    queue.add(startVertexIndex - 1);
    while (!queue.isEmpty()) {

      int currentNode = queue.poll();
      queue.remove(currentNode);
      if (!settledNode[currentNode]) {
        Map<Integer, Integer> adjacentVertices = adjacencyList.get(currentNode);
        for (int adjacentVertex : adjacentVertices.keySet()) {
          if (!settledNode[adjacentVertex]) {
            if (distanceFromStartVertexIndex[adjacentVertex] == -1
                || distanceFromStartVertexIndex[adjacentVertex]
                > adjacentVertices.get(adjacentVertex)
                + distanceFromStartVertexIndex[currentNode]) {
              distanceFromStartVertexIndex[adjacentVertex] =
                  adjacentVertices.get(adjacentVertex) + distanceFromStartVertexIndex[currentNode];
            }
            queue
                .add(adjacentVertex);
          }
        }
      }
      settledNode[currentNode] = true;
    }

    return IntStream.range(0, n).filter(i -> i != startVertexIndex - 1)
        .map(i -> distanceFromStartVertexIndex[i]).toArray();
  }
}

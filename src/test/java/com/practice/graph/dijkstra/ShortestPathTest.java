package com.practice.graph.dijkstra;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ShortestPathTest {

  @DisplayName("GIVEN a graph and starting vertex without duplicate edges WHEN shortestReach function is called THEN shortest array containing distances from start vertex to all other vertices is returned and -1 if vertex is not reachable")
  @Test
  public void testFindShortestPathFromStartVertexToAllOtherNodesInTheGraph() {
    //GIVEN
    int verticesCount = 5;
    int[][] graph = new int[][]{{1, 2, 10}, {1, 3, 6}, {2, 4, 8}};
    int startingVertex = 2;

    //WHEN
    int[] shortestDistancesFromStartNode = ShortestPath
        .shortestReach(verticesCount, graph, startingVertex);

    //THEN
    assertThat(new int[]{10, 16, 8, -1}, is(shortestDistancesFromStartNode));
  }

  @DisplayName("GIVEN a graph and starting vertex with duplicate edges with different weights WHEN shortestReach function is called THEN shortest array containing distances from start vertex to all other nodes is returned.")
  @Test
  public void test() {
    //GIVEN
    int verticesCount = 5;
    int[][] graph = new int[][]{{1, 2, 10}, {1, 2, 20}, {1, 3, 6}, {1, 3, 8}, {2, 4, 8}, {2, 4, 9}};
    int startingVertex = 2;

    //WHEN

    int[] shortestDistancesFromStartNode = ShortestPath
        .shortestReach(verticesCount, graph, startingVertex);

    //THEN
    assertThat(new int[]{10, 16, 8, -1}, is(shortestDistancesFromStartNode));
  }
}
package com.practice.graph.dijkstra;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ShortestPathTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testShortestReach(int[][] edges, int verticesCount, int startingVertex,
      int[] expectedShortestPath) {
    //WHEN
    var shortestPaths = new ShortestPath().shortestReach(verticesCount, edges, startingVertex);
    // THEN
    Assertions.assertArrayEquals(expectedShortestPath, shortestPaths);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[][]{{1, 2, 10}, {1, 3, 6}, {2, 4, 8}}, 5, 2,
            new int[]{10, 16, 8, -1}),
        Arguments.arguments(
            new int[][]{{1, 2, 10}, {1, 2, 20}, {1, 3, 6}, {1, 3, 8}, {2, 4, 8}, {2, 4, 9}}, 5, 2,
            new int[]{10, 16, 8, -1})
    );
  }
}
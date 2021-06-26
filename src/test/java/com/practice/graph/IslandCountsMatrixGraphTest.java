package com.practice.graph;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class IslandCountsMatrixGraphTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testContIsland(int[][] edges, int expectedCount) {
    //WHEN
    var actualCount = new IslandCountsMatrixGraph().countIsland(edges);
    //THEN
    Assertions.assertEquals(expectedCount, actualCount);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[][]{
            {0, 0, 1, 1, 1, 1},
            {0, 0, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 0},
            {1, 0, 0, 0, 1, 0},
            {1, 1, 1, 0, 1, 0},
            {1, 1, 1, 0, 1, 0},
            {1, 1, 1, 1, 1, 0},
            {1, 1, 1, 1, 1, 0},
        }, 3),
        Arguments.arguments(new int[][]{
            {0, 0, 1, 1, 1, 1},
            {0, 0, 1, 1, 1, 1},
            {1, 0, 1, 1, 1, 0},
            {1, 0, 0, 0, 1, 0},
            {1, 1, 1, 0, 1, 0},
            {1, 1, 1, 0, 1, 0},
            {1, 1, 1, 1, 1, 0},
            {1, 1, 1, 1, 1, 0},
        }, 2),
        Arguments.arguments(new int[][]{
            {0, 0, 1, 1, 1, 1},
            {0, 0, 1, 1, 1, 1},
            {1, 0, 1, 1, 1, 0},
            {1, 0, 0, 0, 1, 0},
            {1, 1, 1, 0, 1, 0},
            {1, 1, 1, 0, 0, 0},
            {1, 1, 1, 1, 1, 0},
            {1, 1, 1, 1, 1, 0},
        }, 1),
        Arguments.arguments(new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
        }, 1),
        Arguments.arguments(new int[][]{
            {1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1},
        }, 0)
    );
  }

}
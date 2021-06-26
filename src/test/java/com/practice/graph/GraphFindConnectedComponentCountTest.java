package com.practice.graph;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphFindConnectedComponentCountTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFindCount(int[][] edges, int vertices, int expectedCount) {
    //WHEN
    var actualCount = new GraphFindConnectedComponentCount().findCount(edges, vertices);
    //THEN
    Assertions.assertEquals(expectedCount, actualCount);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[][]{{1, 2}, {2, 3}, {4, 5}, {6, 7}}, 7, 3),
        Arguments.arguments(new int[][]{{1, 2}, {2, 3}, {4, 5}, {3, 4}}, 5, 1),
        Arguments.arguments(new int[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}}, 8, 4),
        Arguments.arguments(new int[][]{{1, 2}}, 2, 1)
        );
  }

}
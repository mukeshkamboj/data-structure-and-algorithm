package com.practice.graph;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class BipartiteGraphTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testIsBipartiteGraph(int[][] edges, int vertices, boolean expected) {
    //WHEN
    var isBipartiteGraph = new BipartiteGraph().isBipartiteGraph(edges, vertices);

    //THEN
    Assertions.assertEquals(expected, isBipartiteGraph);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[][]{
            {1, 2},
            {2, 3},
            {3, 4},
            {1, 4},
            {5, 6},
            {6, 7},
            {7, 5},
            {9, 10},
        }, 10, false),
        Arguments.arguments(new int[][]{
            {1, 2},
            {2, 3},
            {3, 4},
            {1, 4},
            {5, 6},
            {6, 7},
            {7, 8},
            {9, 10},
        }, 10, true)
    );
  }
}
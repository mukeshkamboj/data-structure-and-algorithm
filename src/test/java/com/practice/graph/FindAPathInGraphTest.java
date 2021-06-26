package com.practice.graph;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class FindAPathInGraphTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testPathExists(int[][] graph, int vertices, int source, int destination,
      boolean expected) {

    //WHEN
    var exists = new FindAPathInGraph().pathExistsDfs(graph, vertices, source, destination);
    //THEN
    Assertions.assertEquals(expected, exists);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {2, 4}}, 5, 1, 5, true),
        Arguments
            .arguments(new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {2, 4}, {6, 7}}, 7, 1, 6, false)
    );
  }

}
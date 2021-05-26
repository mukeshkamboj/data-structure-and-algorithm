package com.practice.graph;

import static com.practice.test.TestUtil.areEqual;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class AllPathsFromSourceToTargetTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testAllPathsSourceTarget(int[][] g, int[][] expected) {
    //WHEN
    var result = new AllPathsFromSourceToTarget()
        .allPathsSourceTarget(g);
    //THEN
    Assertions.assertTrue(areEqual(expected, result));
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[][]{{4, 3, 1}, {3, 2, 4}, {3}, {4}, {}},
            new int[][]{{0, 4}, {0, 3, 4}, {0, 1, 3, 4}, {0, 1, 2, 3, 4}, {0, 1, 4}})
    );
  }
}
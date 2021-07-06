package com.practice.dynamic_programming;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class UniquePathsIITest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFindUniquePaths(int[][] m, int expectedUniquePaths) {
    //WHEN
    var uniquePaths = new UniquePathsII().findUniquePaths(m);
    //THEN
    Assertions.assertEquals(expectedUniquePaths, uniquePaths);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}, 2),
        Arguments.arguments(new int[][]{{0, 1}, {0, 0}}, 1)
    );
  }
}
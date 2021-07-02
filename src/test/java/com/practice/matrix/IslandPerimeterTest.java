package com.practice.matrix;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class IslandPerimeterTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testIslandPerimeter(int[][] matrix, int expected) {
    //WHEN
    var perimeter = new IslandPerimeter().islandPerimeter(matrix);
    //THEN
    Assertions.assertEquals(expected, perimeter);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[][]{
            {0, 1, 0, 0},
            {1, 1, 1, 0},
            {0, 1, 0, 0},
            {1, 1, 0, 0}
        }, 16)
    );
  }
}
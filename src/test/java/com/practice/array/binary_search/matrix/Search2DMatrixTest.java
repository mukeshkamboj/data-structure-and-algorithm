package com.practice.array.binary_search.matrix;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Search2DMatrixTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testNumberExist(int[][] matrix, int num, boolean expected) {
    //WHEN
    var numExists = new Search2DMatrix().numberExist(matrix, num);

    //THEN
    Assertions.assertEquals(expected, numExists);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 3, true),
        Arguments
            .arguments(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 70, false),
        Arguments
            .arguments(new int[][]{{1}}, 1, true),
        Arguments
            .arguments(new int[][]{{1}, {2}, {3}, {4}}, 4, true)
    );
  }
}
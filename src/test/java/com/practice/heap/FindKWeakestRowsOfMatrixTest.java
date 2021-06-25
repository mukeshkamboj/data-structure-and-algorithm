package com.practice.heap;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class FindKWeakestRowsOfMatrixTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFindWeakestRow(int[][] mat, int k, int[] expected) {
    //WHEN
    var weakestRows = new FindKWeakestRowsOfMatrix().findWeakestRow(mat, k);
    //THEN
    Assertions.assertArrayEquals(expected, weakestRows);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[][]{{1, 1, 0, 0, 0},
            {1, 1, 1, 1, 0},
            {1, 0, 0, 0, 0},
            {1, 1, 0, 0, 0},
            {1, 1, 1, 1, 1}}, 3, new int[]{2, 0, 3}),
        Arguments.arguments(new int[][]{{1, 0, 0, 0},
            {1, 1, 1, 1},
            {1, 0, 0, 0},
            {1, 1, 0, 0}}, 2, new int[]{0, 2})
    );
  }
}
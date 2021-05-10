package com.practice.slow_fast_pointers;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SquaresOfASortedArrayTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testSortedSquare(int[] arr, int[] expected) {
    //WHEN
    var sortedSquareArray = new SquaresOfASortedArray().sortedSquare(arr);

    //THEN
    Assertions.assertArrayEquals(expected, sortedSquareArray);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{-4, -1, 0, 3, 10}, new int[]{0, 1, 9, 16, 100}),
        Arguments.arguments(new int[]{-7, -3, 2, 3, 11}, new int[]{4, 9, 9, 49, 121}),
        Arguments.arguments(new int[]{-11, -7, -3, -2}, new int[]{4, 9, 49, 121}),
        Arguments.arguments(new int[]{-1}, new int[]{1})
    );
  }

}
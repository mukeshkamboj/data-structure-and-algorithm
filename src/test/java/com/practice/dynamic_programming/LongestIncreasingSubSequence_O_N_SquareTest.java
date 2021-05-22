package com.practice.dynamic_programming;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class LongestIncreasingSubSequence_O_N_SquareTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFindMax(int[] arr, int expectedMax) {
    //WHEN
    var max = new LongestIncreasingSubSequence_O_N_Square().findMax(arr);
    //THEN
    Assertions.assertEquals(expectedMax, max);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{10, 9, 8, 7, 6, 5, 4, 3}, 1),
        Arguments.arguments(new int[]{10, 11, 12, 13, 14, 15}, 6),
        Arguments.arguments(new int[]{10}, 1),
        Arguments.arguments(new int[]{}, 0),
        Arguments.arguments(new int[]{10, 9, 2, 5, 3, 7, 101, 18}, 4)
    );
  }
}
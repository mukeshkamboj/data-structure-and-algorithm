package com.practice.sliding_window;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class MaxSumOfContiguousSubArrayTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFindMaxSum(int subArraySize, int[] arr, int expected) {
    //WHEN
    var actualSum = MaxSumOfContiguousSubArray.findMaxSum(subArraySize, arr);
    //THEN
    Assertions.assertEquals(expected, actualSum);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(3, new int[]{2, 1, 5, 1, 3, 2}, 9),
        Arguments.arguments(6, new int[]{2, 1, 5, 1, 3, 2}, 14),
        Arguments.arguments(1, new int[]{2}, 2),
        Arguments.arguments(0, new int[]{}, 0),
        Arguments.arguments(2, new int[]{2, 3, 4, 1, 5}, 7)
    );
  }
}
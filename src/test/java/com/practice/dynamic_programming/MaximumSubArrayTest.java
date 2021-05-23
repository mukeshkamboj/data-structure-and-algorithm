package com.practice.dynamic_programming;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class MaximumSubArrayTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFindMaxSum(int[] arr, int expectedMaxSum) {
    //WHEN
    var maxValue = new MaximumSubArray().findMaxSum(arr);
    //THEN
    Assertions.assertEquals(expectedMaxSum, maxValue);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{-1, -2, -3, -4, -5}, -1),
        Arguments.arguments(new int[]{-5, -4, -3, -2, -1}, -1),
        Arguments.arguments(new int[]{-5}, -5),
        Arguments.arguments(new int[]{}, 0),
        Arguments.arguments(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}, 6)
    );
  }
}
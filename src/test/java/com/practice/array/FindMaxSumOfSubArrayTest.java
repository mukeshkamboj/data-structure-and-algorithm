package com.practice.array;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class FindMaxSumOfSubArrayTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testMaxSubArraySum(int[] arr, int expectedMaxSum) {
    //WHEN
    var maxSum = new FindMaxSumOfSubArray().maxSubArraySum(arr);
    //THEN
    Assertions.assertEquals(expectedMaxSum, maxSum);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}, 6),
        Arguments.arguments(new int[]{1}, 1),
        Arguments.arguments(new int[]{1, 2, 3, 4, 5}, 15),
        Arguments.arguments(new int[]{-2, -1, -3, 100, -1, -2, -1, -5, -4}, 100)
    );
  }
}
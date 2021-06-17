package com.practice.array;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class MaximumAscendingSubArraySumTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testMaxAscendingSum(int[] arr, int expected) {
    //WHEN
    var sum = new MaximumAscendingSubArraySum().maxAscendingSum(arr);
    //THEN
    Assertions.assertEquals(expected, sum);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{12, 17, 15, 13, 10, 11, 12, 5, 6, 7}, 33),
        Arguments.arguments(new int[]{100, 12, 17, 15, 13, 10, 11, 12, 5, 6, 7}, 100),
        Arguments.arguments(new int[]{10, 11, 12}, 33),
        Arguments.arguments(new int[]{50, 34, 21, 12}, 50),
        Arguments.arguments(new int[]{10, 10, 10, 10, 10}, 10),
        Arguments.arguments(new int[]{10}, 10),
        Arguments.arguments(new int[]{}, 0)
    );
  }
}
package com.practice.dynamic_programming.knapsack.zero_one;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TargetSumTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFindTargetSumWays(int[] arr, int target, int expectedCount) {
    //WHEN
    var actualCount = new TargetSum().findTargetSumWays(arr, target);
    //THEN
    Assertions.assertEquals(expectedCount, actualCount);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{4, 4, 4, 4, 2, 2}, 20, 1),
        Arguments.arguments(new int[]{4, 4, 4, 4, 2, 2}, 100, 0),
        Arguments.arguments(new int[]{4, 4, 4, 4, 2, 2}, -20, 1),
        Arguments.arguments(new int[]{4, 4, 4, 4, 2, 2, 5, 5, 5, 5}, -20, 18),
        Arguments.arguments(new int[]{4, 4, 4, 4, 2, 2, 5, 5, 5, 5}, 20, 18),
        Arguments.arguments(new int[]{1}, 1, 1),
        Arguments.arguments(new int[]{1}, 0, 0)
    );
  }
}
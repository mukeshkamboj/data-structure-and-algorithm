package com.practice.dynamic_programming;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class MinCostClimbingStairsTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFindMinCost(int[] cost, int expectedMinCode) {
    //WHEN
    var minCost = new MinCostClimbingStairs().findMinCost(cost);
    //THEN
    Assertions.assertEquals(expectedMinCode, minCost);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{10, 15, 20}, 15),
        Arguments.arguments(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}, 6)
    );
  }
}
package com.practice.dynamic_programming.unbounded_knapsack;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class RodCuttingTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFindMaxCostWithRecursive(int[] prices, int[] length, int rodLength,
      int expectedProfit) {
    //WHEN
    var maxProfit = new RodCutting().findMaxCostWithRecursive(prices, length, rodLength);

    //THEN
    Assertions.assertEquals(expectedProfit, maxProfit);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments
            .arguments(new int[]{3, 5, 8, 9, 10, 17, 17, 20}, new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 8,
                24),
        Arguments
            .arguments(new int[]{1, 5, 8, 9, 10, 17, 17, 20}, new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 8,
                22)
    );
  }
}
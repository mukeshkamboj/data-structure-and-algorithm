package com.practice.dynamic_programming.knapsack.zero_one;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class MaxProfitAfterKeepingItemsInGivenBagTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFindMaxProfit(int[] weight, int[] price, int knapsackWeight, int expectedProfit) {
    //WHEN
    var maxProfit = new MaxProfitAfterKeepingItemsInGivenBag()
        .findMaxProfit(weight, price, knapsackWeight);
    //THEN
    Assertions.assertEquals(expectedProfit, maxProfit);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{3, 4, 5}, new int[]{30, 40, 50}, 8, 80),
        Arguments
            .arguments(new int[]{1, 1, 1, 1, 1, 1, 1, 1}, new int[]{10, 10, 10, 10, 10, 10, 10, 10},
                8, 80),
        Arguments.arguments(new int[]{3}, new int[]{30}, 4, 30),
        Arguments.arguments(new int[]{3}, new int[]{30}, 2, 0),
        Arguments.arguments(new int[]{}, new int[]{}, 2, 0)
    );
  }
}
package com.practice.dynamic_programming;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class BestTimeToBuyAndSellStockTest {

  @ParameterizedTest
  @MethodSource("testDataMethod")
  public void testMaxProfit(int[] arr, int expectedMaxProfit) {
    //WHEN
    var maxProfit = new BestTimeToBuyAndSellStock().maxProfit(arr);
    //THEN
    Assertions.assertEquals(expectedMaxProfit, maxProfit);
  }

  static Stream<Arguments> testDataMethod() {
    return Stream.of(
        Arguments.arguments(new int[]{7, 1, 5, 3, 6, 4}, 5),
        Arguments.arguments(new int[]{7}, 0),
        Arguments.arguments(new int[]{7, 6, 5, 4, 3, 2, 1}, 0),
        Arguments.arguments(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 7),
        Arguments.arguments(new int[]{50, 40, 30, 20, 10, 1, 100}, 99)
    );
  }
}
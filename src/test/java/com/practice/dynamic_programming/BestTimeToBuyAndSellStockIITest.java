package com.practice.dynamic_programming;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class BestTimeToBuyAndSellStockIITest {

  @ParameterizedTest
  @MethodSource("testDataMethod")
  public void testMaxProfit(int[] arr, int expectedMaxProfit) {
    //WHEN
    var maxProfit = new BestTimeToBuyAndSellStockII().maxProfit(arr);
    //THEN
    Assertions.assertEquals(expectedMaxProfit, maxProfit);
  }

  static Stream<Arguments> testDataMethod() {
    return Stream.of(
        Arguments.arguments(new int[]{7, 1, 5, 3, 6, 4}, 7),
        Arguments.arguments(new int[]{1, 2, 3, 4, 5}, 4),
        Arguments.arguments(new int[]{1, 10, 9, 100}, 100),
        Arguments.arguments(new int[]{7, 6, 4, 3, 1}, 0),
        Arguments.arguments(new int[]{7}, 0)
    );
  }
}
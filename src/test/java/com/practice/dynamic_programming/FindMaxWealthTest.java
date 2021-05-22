package com.practice.dynamic_programming;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class FindMaxWealthTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testMaximumWealth(int[][] customerWealth, int expectedWealth) {
    //WHEN
    var maxWealth = new FindMaxWealth().maximumWealth(customerWealth);
    //THEN
    Assertions.assertEquals(expectedWealth, maxWealth);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[][]{{1, 5}, {7, 3}, {3, 5}}, 10),
        Arguments.arguments(new int[][]{{0}, {0}, {0}}, 0)
    );
  }
}
package com.practice.dynamic_programming.knapsack.zero_one;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class MinimumSubsetSumDifferenceTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testMinimumSubsetDifference(int[] arr, int expected) {
    //WHEN
    var minimumDiff = new MinimumSubsetSumDifference().minimumSubsetDifference(arr);
    //THEN
    assertEquals(expected, minimumDiff);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{1, 6, 11, 5}, 1),
        Arguments.arguments(new int[]{21,22}, 1),
        Arguments.arguments(new int[]{200, 400, 500}, 100)
    );
  }
}
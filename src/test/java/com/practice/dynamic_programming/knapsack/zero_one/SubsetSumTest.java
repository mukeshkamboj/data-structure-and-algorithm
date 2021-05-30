package com.practice.dynamic_programming.knapsack.zero_one;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SubsetSumTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFind(int[] arr, int sum, boolean expected) {
    //WHEN
    var subSetExists = new SubsetSum().find(arr, sum);
    //THEN
    Assertions.assertEquals(expected, subSetExists);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{1, 2, 3, 4, 5, 6}, 15, true),
        Arguments.arguments(new int[]{1}, 0, true),
        Arguments.arguments(new int[]{1}, 1, true),
        Arguments.arguments(new int[]{0}, 1, false),
        Arguments.arguments(new int[]{}, 0, true),
        Arguments.arguments(new int[]{20, 34, 23, 54}, 999, false)
    );
  }
}
package com.practice.dynamic_programming.tabulation;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TargetSumSubSetTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testExists(int[] arr, int sum, boolean expected) {
    //WHEN
    var exists = new TargetSumSubSet().exists(arr, sum);
    //THEN
    Assertions.assertEquals(expected, exists);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{3, 4, 5, 6}, 9, true),
        Arguments.arguments(new int[]{3, 4, 5, 6}, 15, true),
        Arguments.arguments(new int[]{3}, 3, true),
        Arguments.arguments(new int[]{3, 1}, 4, true),
        Arguments.arguments(new int[]{1, 1, 1, 1}, 4, true),
        Arguments.arguments(new int[]{3, 4, 5, 6}, 100, false)
    );
  }
}
package com.practice.dynamic_programming.tabulation;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TargetSumSubSetCountTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testCount(int[] arr, int sum, int expected) {
    //WHEN
    var exists = new TargetSumSubSetCount().count(arr, sum);
    //THEN
    Assertions.assertEquals(expected, exists);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{3, 4, 5, 6}, 9, 2),
        Arguments.arguments(new int[]{3, 4, 5, 6}, 15, 1),
        Arguments.arguments(new int[]{3}, 3, 1),
        Arguments.arguments(new int[]{3, 1}, 4, 1),
        Arguments.arguments(new int[]{1, 1, 1, 1, 1}, 4, 5),
        Arguments.arguments(new int[]{3, 4, 5, 6}, 100, 0)
    );
  }

}
package com.practice.dynamic_programming.knapsack.zero_one;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class PartitionEqualSubsetSumTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testCanPartition(int[] arr, boolean expected) {
    //WHEN
    var canPartition = new PartitionEqualSubsetSum().canPartition(arr);
    //THEN
    Assertions.assertEquals(expected, canPartition);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{1, 2, 3, 4}, true),
        Arguments.arguments(new int[]{1, 2, 3, 4, 1}, false),
        Arguments.arguments(new int[]{1}, false),
        Arguments.arguments(new int[]{1, 1}, true)
    );
  }
}
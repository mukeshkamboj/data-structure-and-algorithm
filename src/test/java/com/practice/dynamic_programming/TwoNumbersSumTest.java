package com.practice.dynamic_programming;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TwoNumbersSumTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testTwoSum(int[] arr, int target, int[] expected) {
    //WHEN
    var actual = new TwoNumbersSum().twoSum(arr, target);
    //THEN
    Assertions.assertArrayEquals(expected, actual);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{2, 3, 4}, 6, new int[]{0, 2}),
        Arguments.arguments(new int[]{1, 2}, 3, new int[]{0, 1})
    );
  }
}
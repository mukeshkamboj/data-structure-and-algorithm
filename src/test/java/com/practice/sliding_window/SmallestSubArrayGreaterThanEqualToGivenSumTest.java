package com.practice.sliding_window;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SmallestSubArrayGreaterThanEqualToGivenSumTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFindSmallestSubArrayLength(int givenSum, int[] arr, int expected) {
    //WHEN
    int smallestSubArrayLength = new SmallestSubArrayGreaterThanEqualToGivenSum()
        .minSubArrayLen(givenSum, arr);
    //THEN
    Assertions.assertEquals(expected, smallestSubArrayLength);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(100, new int[]{7, 2, 1, 5, 2, 3, 2}, 0),
        Arguments.arguments(7, new int[]{2, 1, 5, 2, 3, 2}, 2),
        Arguments.arguments(7, new int[]{2, 1, 5, 2, 8}, 1),
        Arguments.arguments(8, new int[]{3, 4, 1, 1, 6}, 3),
        Arguments.arguments(7, new int[]{7, 2, 1, 5, 2, 3, 2}, 1)
    );
  }
}
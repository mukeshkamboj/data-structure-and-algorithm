package com.practice.sliding_window;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class LongestBinarySubArrayTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFind(int[] arr, int maxReplacementAllowed, int expectedLongestArrayLength) {
    //WHEN
    var longestArray = new LongestBinarySubArray().find(maxReplacementAllowed, arr);
    //THEN
    Assertions.assertEquals(expectedLongestArrayLength, longestArray);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1}, 2, 6),
        Arguments.arguments(new int[]{0, 1, 1, 0, 0, 0}, 2, 4),
        Arguments.arguments(new int[]{0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1}, 3, 9),
        Arguments.arguments(new int[]{1, 0, 0, 1, 0, 1, 0, 1}, 2, 5)
    );
  }
}
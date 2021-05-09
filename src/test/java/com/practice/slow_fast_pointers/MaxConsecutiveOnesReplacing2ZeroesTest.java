package com.practice.slow_fast_pointers;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class MaxConsecutiveOnesReplacing2ZeroesTest {

  @ParameterizedTest
  @MethodSource("testDataProviders")
  public void testLongestOnes(int[] arr, int k, int expected) {
    //WHEN
    var longestOnes = new MaxConsecutiveOnesReplacing2Zeroes().longestOnes(arr, k);
    //THEN
    Assertions.assertEquals(expected, longestOnes);
  }

  static Stream<Arguments> testDataProviders() {
    return Stream.of(
        Arguments.arguments(new int[]{0, 0}, 2, 2),
        Arguments.arguments(new int[]{0}, 1, 1),
        Arguments.arguments(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2, 6),
        Arguments
            .arguments(new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 3, 10),
        Arguments
            .arguments(new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 20,
                20)
    );
  }

}
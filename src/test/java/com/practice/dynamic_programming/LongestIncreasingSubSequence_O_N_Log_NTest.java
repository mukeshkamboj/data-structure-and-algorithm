package com.practice.dynamic_programming;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class LongestIncreasingSubSequence_O_N_Log_NTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFindLis(int[] arr, int expectedLis) {
    //WHEN
    var lis = new LongestIncreasingSubSequence_O_N_Log_N().findMax(arr);

    //THEN
    Assertions.assertEquals(expectedLis, lis);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{10, 9, 8, 7, 6, 5, 4, 3}, 1),
        Arguments.arguments(new int[]{10, 9, 2, 5, 3, 7, 101, 18}, 4),
        Arguments.arguments(new int[]{10}, 1),
        Arguments.arguments(new int[]{5, 20, 6, 7, 8, 9}, 5),
        Arguments.arguments(new int[]{}, 0),
        Arguments.arguments(new int[]{10, 11, 12, 13, 14, 15}, 6)
    );
  }
}
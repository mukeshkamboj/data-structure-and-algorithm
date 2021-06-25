package com.practice.heap;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class RelativeRanksTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFindRank(int[] arr, String[] expected) {
    //WHEN
    var ranks = new RelativeRanks().findRank(arr);
    //THEN
    Assertions.assertArrayEquals(expected, ranks);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{5, 4, 3, 2, 1},
            new String[]{"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"}),
        Arguments.arguments(new int[]{5, 4, 3},
            new String[]{"Gold Medal", "Silver Medal", "Bronze Medal"}),
        Arguments.arguments(new int[]{1},
            new String[]{"Gold Medal"})
    );
  }
}
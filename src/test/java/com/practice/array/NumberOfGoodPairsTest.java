package com.practice.array;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class NumberOfGoodPairsTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testNumIdenticalPairs(int[] arr, int expectedNumIdenticalPairs) {
    //WHEN
    var numIdenticalPairs = new NumberOfGoodPairs().numIdenticalPairs(arr);
    //THEN
    Assertions.assertEquals(expectedNumIdenticalPairs, numIdenticalPairs);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{1, 2, 3, 1, 1, 3}, 4),
        Arguments.arguments(new int[]{1, 2, 3, 4, 5, 6}, 0),
        Arguments.arguments(new int[]{}, 0)
    );
  }
}
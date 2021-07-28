package com.practice.hash_map;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TupleWithSameProductTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFindTuple(int[] arr, int expectedCount) {
    //WHEN
    var count = new TupleWithSameProduct().findTupleCount(arr);
    //THEN
    Assertions.assertEquals(expectedCount, count);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{2, 3, 4, 6}, 8),
        Arguments.arguments(new int[]{1, 2, 4, 5, 10}, 16),
        Arguments.arguments(new int[]{2, 3, 4, 6, 8, 12}, 40),
        Arguments.arguments(new int[]{2, 3, 4, 5}, 0),
        Arguments.arguments(new int[]{2}, 0)
    );
  }

}
package com.practice.binary_search;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SearchInRotatedSortedArrayTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFindTarget(int[] arr, int target, int expected) {
    //WHEN
    var index = new SearchInRotatedSortedArray().findTarget(arr, target);

    //THEN
    Assertions.assertEquals(expected, index);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{5, 1, 3}, 5, 0),
        Arguments.arguments(new int[]{4, 5, 6, 7, 1, 2, 3}, 3, 6),
        Arguments.arguments(new int[]{4, 5, 6, 7, 1, 2, 3}, 0, -1),
        Arguments.arguments(new int[]{1}, 1, 0),
        Arguments.arguments(new int[]{1}, 2, -1)
    );
  }
}
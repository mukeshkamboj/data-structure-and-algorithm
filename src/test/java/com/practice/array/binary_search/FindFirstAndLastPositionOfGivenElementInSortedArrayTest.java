package com.practice.array.binary_search;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class FindFirstAndLastPositionOfGivenElementInSortedArrayTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFindPosition(int[] arr, int element, int[] expected) {
    //WHEN
    var position = new FindFirstAndLastPositionOfGivenElementInSortedArray()
        .findPosition(arr, element);

    //THEN
    Assertions.assertArrayEquals(expected, position);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{5, 7, 7, 8, 8, 10}, 8, new int[]{3, 4}),
        Arguments.arguments(new int[]{5, 7, 7, 8, 8, 10}, 20, new int[]{-1, -1}),
        Arguments.arguments(new int[]{1}, 1, new int[]{0, 0}),
        Arguments.arguments(new int[]{2, 2}, 2, new int[]{0, 1})
    );
  }

}
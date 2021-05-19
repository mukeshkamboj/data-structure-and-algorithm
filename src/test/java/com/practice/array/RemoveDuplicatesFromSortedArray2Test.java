package com.practice.array;

import java.util.Arrays;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class RemoveDuplicatesFromSortedArray2Test {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testRemoveDuplicates(int[] arr, int[] expected) {
    //WHEN
    var newSize = new RemoveDuplicatesFromSortedArray2().removeDuplicates(arr);
    //THEN
    Assertions.assertArrayEquals(expected, Arrays.copyOfRange(arr, 0, newSize));
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4},
            new int[]{1, 1, 2, 2, 3, 3, 4, 4}),
        Arguments.arguments(new int[]{1, 2, 3}, new int[]{1, 2, 3}),
        Arguments.arguments(new int[]{1}, new int[]{1})
    );
  }
}
package com.practice.sorting_algo;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SortingAlgorithmTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testSort(int[] arr, int[] expected) {
    //WHEN
    BubbleSort.sort(arr);
    //THEN
    Assertions.assertArrayEquals(expected, arr);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments
            .arguments(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}),
        Arguments
            .arguments(new int[]{9, 1, 8, 2, 7, 3, 6, 4, 5}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}),
        Arguments
            .arguments(new int[]{8, 9}, new int[]{8, 9}),
        Arguments
            .arguments(new int[]{9}, new int[]{9})
    );
  }

}
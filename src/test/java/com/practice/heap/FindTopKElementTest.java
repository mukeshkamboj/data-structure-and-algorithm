package com.practice.heap;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class FindTopKElementTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFindTopKElement(int[] arr, int k, int[] expected) {
    //WHEN
    var topKElement = new FindTopKElement().findTopKElement(arr, k);
    //THEN
    Assertions.assertArrayEquals(expected, topKElement);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 4, new int[]{6, 7, 8, 9}),
        Arguments.arguments(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1}, 4, new int[]{6, 7, 8, 9}),
        Arguments.arguments(new int[]{1}, 1, new int[]{1}),
        Arguments.arguments(new int[]{-1, -2, -3, -4}, 2, new int[]{-2, -1})
    );
  }
}
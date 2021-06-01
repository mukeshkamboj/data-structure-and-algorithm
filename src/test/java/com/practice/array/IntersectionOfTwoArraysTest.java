package com.practice.array;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class IntersectionOfTwoArraysTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testIntersection(int[] arr1, int[] arr2, int[] expected) {
    //WHEN
    var intersection = new IntersectionOfTwoArrays().intersection(arr1, arr2);
    //THEN
    Assertions.assertArrayEquals(expected, intersection);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{1, 2, 2, 1}, new int[]{1, 2}, new int[]{1, 2}),
        Arguments.arguments(new int[]{1, 2, 2, 1}, new int[]{3, 4}, new int[]{}),
        Arguments.arguments(new int[]{}, new int[]{}, new int[]{})
    );
  }
}
package com.practice.sliding_window;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class NumberOfUniqueElementsInASortedArrayTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testNumberOfUniqueElement(int[] arr, int expectedNumber) {
    //WHEN
    var uniqueElements = new NumberOfUniqueElementsInASortedArray().find(arr);
    //THEN
    Assertions.assertEquals(expectedNumber, uniqueElements);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{2, 3, 3, 3, 6, 9, 9}, 4),
        Arguments.arguments(new int[]{2, 3, 4, 5, 6}, 5),
        Arguments.arguments(new int[]{}, 0),
        Arguments.arguments(new int[]{100}, 1),
        Arguments.arguments(new int[]{2, 2, 2, 11}, 2)
    );
  }
}
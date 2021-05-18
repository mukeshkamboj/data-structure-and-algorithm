package com.practice.array;

import java.util.stream.Stream;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class PlusOneTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testPlusOne(int[] arr, int[] expected) {
    //WHEN
    var result = new PlusOne().plusOne(arr);
    //THEN
    Assertions.assertArrayEquals(expected, result);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{1, 2, 3}, new int[]{1, 2, 4}),
        Arguments.arguments(new int[]{9, 9, 9}, new int[]{1, 0, 0, 0}),
        Arguments.arguments(new int[]{9}, new int[]{1, 0}),
        Arguments.arguments(new int[]{0}, new int[]{1})
    );
  }
}
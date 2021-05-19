package com.practice.array;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class MoveZeroesTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testMoveZeros(int[] arr, int[] expected) {
    //WHEN
    new MoveZeroes().moveZeroes(arr);
    //THEN
    Assertions.assertArrayEquals(expected, arr);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{0, 0, 0, 1, 2, 3}, new int[]{1, 2, 3, 0, 0, 0}),
        Arguments.arguments(new int[]{1, 2, 3, 0, 0, 0}, new int[]{1, 2, 3, 0, 0, 0}),
        Arguments.arguments(new int[]{1, 0}, new int[]{1, 0}),
        Arguments.arguments(new int[]{0, 1}, new int[]{1, 0}),
        Arguments.arguments(new int[]{1}, new int[]{1}),
        Arguments.arguments(new int[]{}, new int[]{}),
        Arguments.arguments(new int[]{0}, new int[]{0})
    );
  }
}
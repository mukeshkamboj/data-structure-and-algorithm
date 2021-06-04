package com.practice.array;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class HowManyNumbersAreSmallerThanTheCurrentNumberTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFindSmallerNumbersCount(int[] arr, int[] expected) {
    //WHEN
    var result = new HowManyNumbersAreSmallerThanTheCurrentNumber().findSmallerNumbersCount(arr);
    //THEN
    Assertions.assertArrayEquals(expected, result);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{8, 0, 1, 1, 2, 2}, new int[]{5, 0, 1, 1, 3, 3}),
        Arguments.arguments(new int[]{8, 19, 32, 34, 1, 4}, new int[]{2, 3, 4, 5, 0, 1}),
        Arguments.arguments(new int[]{8}, new int[]{0}),
        Arguments.arguments(new int[]{8, 8, 8, 8, 8}, new int[]{0, 0, 0, 0, 0}),
        Arguments.arguments(new int[]{}, new int[]{})
    );
  }
}
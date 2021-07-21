package com.practice.dynamic_programming;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class RemoveAllOccurrencesOfValueToGetMaxSumOfArrayTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testDataProvider(int[] arr, int expected) {
    //WHEN
    int result = RemoveAllOccurrencesOfValueToGetMaxSumOfArray.find(arr);

    //THEN
    Assertions.assertEquals(expected, result);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{1, 2, 3, 4, 5, 1, 1, 1}, 2),
        Arguments.arguments(new int[]{1, 2}, 1),
        Arguments.arguments(new int[]{}, -1),
        Arguments.arguments(new int[]{1}, -1)
    );
  }
}
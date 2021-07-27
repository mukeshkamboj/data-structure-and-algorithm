package com.practice.bit_manipulation;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class FindSingleNumberWhichIsNotDuplicatedTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFindSingleNumber(int[] arr, int expected) {
    //WHEN
    var number = new FindSingleNumberWhichIsNotDuplicated().singleNumber(arr);
    //THEN
    Assertions.assertEquals(expected, number);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{1, 2, 2, 3, 3}, 1),
        Arguments.arguments(new int[]{-1, -2, -2, -3, -3}, -1),
        Arguments.arguments(new int[]{-1}, -1),
        Arguments.arguments(new int[]{1}, 1)
    );
  }

}
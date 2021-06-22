package com.practice.array;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Find3MaxNumbersTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFind3MaxNumbers(int[] arr, int[] expected) {
    //WHEN
    var max3Numbers = new Find3MaxNumbers().find3MaxNumbers(arr);

    //THEN
    Assertions.assertArrayEquals(expected, max3Numbers);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{34, 12, 65, 31, 67, 43, 83}, new int[]{83, 67, 65}),
        Arguments.arguments(new int[]{10, 11, 12}, new int[]{12, 11, 10}),
        Arguments.arguments(new int[]{98, 88, 76}, new int[]{98, 88, 76})
        );
  }
}
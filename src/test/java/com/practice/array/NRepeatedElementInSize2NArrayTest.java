package com.practice.array;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class NRepeatedElementInSize2NArrayTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testRepeatedNTimes(int[] arr, int expected) {
    //WHEN
    var val = new NRepeatedElementInSize2NArray().repeatedNTimes(arr);
    //THEN
    Assertions.assertEquals(expected, val);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{1, 2, 3, 2}, 2),
        Arguments.arguments(new int[]{5, 1, 5, 2, 5, 3, 5, 4}, 5)
    );
  }

}
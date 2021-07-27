package com.practice.hash_map;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class CheckIfNAndItsDoubleExistTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testCheckIfExists(int[] arr, boolean expected) {
    //WHEN
    var exists = new CheckIfNAndItsDoubleExist().checkIfExists(arr);
    //THEN
    Assertions.assertEquals(expected, exists);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{1, 2, 3, 4}, true),
        Arguments.arguments(new int[]{2, 3, 5}, false),
        Arguments.arguments(new int[]{10, 2, 5, 3}, true),
        Arguments.arguments(new int[]{1}, false),
        Arguments.arguments(new int[]{4, 3, 2, 1}, true)
    );
  }

}
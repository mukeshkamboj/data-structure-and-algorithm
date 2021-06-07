package com.practice.array;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductOfArrayExceptSelfTest {

  @ParameterizedTest
  @MethodSource("testDataSource")
  public void testProductExceptSelf(int[] arr, int[] expected) {
    //WHEN
    var actual = new ProductOfArrayExceptSelf().productExceptSelf(arr);
    //THEN
    Assertions.assertArrayEquals(expected, actual);
  }

  static Stream<Arguments> testDataSource() {
    return Stream.of(
        Arguments.arguments(new int[]{1, 2, 3, 4, 5}, new int[]{120, 60, 40, 30, 24}),
        Arguments.arguments(new int[]{1, 2, -3, 4, 5}, new int[]{-120, -60, 40, -30, -24}),
        Arguments.arguments(new int[]{1, 2, 0, 4, 5}, new int[]{0, 0, 40, 0, 0}),
        Arguments.arguments(new int[]{1, 2, 0, 4, 5, 0}, new int[]{0, 0, 0, 0, 0, 0}),
        Arguments.arguments(new int[]{1, 2, 0, 4, 5, 0}, new int[]{0, 0, 0, 0, 0, 0}),
        Arguments.arguments(new int[]{}, new int[]{})
    );
  }
}
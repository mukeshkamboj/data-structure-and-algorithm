package com.practice.heap;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class MaxProductOfTwoElementInArrayTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFindMaxProduct(int[] arr, int expected) {
    //WHEN
    var maxProduct = new MaxProductOfTwoElementInArray().findMaxProduct(arr);
    //THEN
    Assertions.assertEquals(expected, maxProduct);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{4, 3, 6, 2, 7}, 30),
        Arguments.arguments(new int[]{6, 7}, 30)
    );
  }

}
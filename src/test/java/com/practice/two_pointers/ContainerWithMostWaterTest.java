package com.practice.two_pointers;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ContainerWithMostWaterTest {

  @ParameterizedTest
  @MethodSource("testDataMethod")
  public void testMaxArea(int[] arr, int expected) {
    //WHEN
    var maxArea = new ContainerWithMostWater().maxArea(arr);

    //THEN
    Assertions.assertEquals(expected, maxArea);
  }

  static Stream<Arguments> testDataMethod() {
    return Stream.of(
        Arguments.arguments(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}, 49),
        Arguments.arguments(new int[]{4, 3, 2, 1, 4}, 16),
        Arguments.arguments(new int[]{1, 1}, 1),
        Arguments.arguments(new int[]{0, 0}, 0),
        Arguments.arguments(new int[]{1, 2, 1}, 2)
    );
  }
}
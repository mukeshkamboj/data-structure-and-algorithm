package com.practice.greedy;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class CanPlaceFlowersTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testCanPlaceFlowers(int[] flowerbed, int n, boolean expected) {
    //WHEN
    var canBePlaced = new CanPlaceFlowers().canPlaceFlowers(flowerbed, n);
    //THEN
    Assertions.assertEquals(expected, canBePlaced);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{0, 0, 0, 0, 0}, 3, true),
        Arguments.arguments(new int[]{0, 0, 0, 0, 0}, 2, true),
        Arguments.arguments(new int[]{0, 0, 0, 0, 0}, 1, true),
        Arguments.arguments(new int[]{0, 0, 0, 0, 0}, 4, false),
        Arguments.arguments(new int[]{1, 0, 0, 0, 1}, 1, true),
        Arguments.arguments(new int[]{1, 0, 0, 0, 1}, 2, false),
        Arguments.arguments(new int[]{0, 0, 1, 0, 0, 0, 1}, 2, true),
        Arguments.arguments(new int[]{0, 0, 1, 0, 0, 0, 1}, 3, false)
    );
  }

}
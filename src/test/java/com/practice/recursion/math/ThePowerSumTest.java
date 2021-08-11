package com.practice.recursion.math;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ThePowerSumTest {

  @ParameterizedTest
  @MethodSource("testDataMethod")
  public void testPowerSum(int num, int pow, int expectedCount) {
    //WHEN
    var count = new ThePowerSum().powerSum(num, pow);
    //THEN
    Assertions.assertEquals(expectedCount, count);
  }

  static Stream<Arguments> testDataMethod() {
    return Stream.of(
        Arguments.arguments(10, 2, 1),
        Arguments.arguments(100, 2, 3),
        Arguments.arguments(100, 3, 1)
    );
  }

}
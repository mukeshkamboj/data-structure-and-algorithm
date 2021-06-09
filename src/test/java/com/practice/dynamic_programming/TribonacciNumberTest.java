package com.practice.dynamic_programming;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TribonacciNumberTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFind(int n, int expectedFibNum) {
    //WHEN
    var fibNum = new TribonacciNumber().find(n);
    //THEN
    Assertions.assertEquals(expectedFibNum, fibNum);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(25, 1389537),
        Arguments.arguments(4, 4),
        Arguments.arguments(0, 0)
    );
  }
}
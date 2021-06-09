package com.practice.dynamic_programming;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class FibonacciNumberTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFind(int num, int expected) {
    //WHEN
    var fibNumber = new FibonacciNumber().find(num);
    //THEN
    assertEquals(expected, fibNumber);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(10, 55)
    );
  }
}
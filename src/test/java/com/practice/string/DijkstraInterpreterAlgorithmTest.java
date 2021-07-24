package com.practice.string;

import static java.lang.Double.POSITIVE_INFINITY;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class DijkstraInterpreterAlgorithmTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testInterpret(String expression, double expected) {
    //WHEN
    var result = new DijkstraInterpreterAlgorithm().interpret(expression);
    //THEN
    Assertions.assertEquals(expected, result);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments("( 100 / ( ( ( 2 + 1 ) - 1 ) * 5 ) )", 10.0),
        Arguments.arguments("( 100 / ( ( ( 2 + 1 ) - 3 ) * 5 ) )", POSITIVE_INFINITY)
    );
  }
}
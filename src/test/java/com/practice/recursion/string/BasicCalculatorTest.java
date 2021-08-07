package com.practice.recursion.string;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class BasicCalculatorTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testEval(String expression, int expected) {
    //WHEN
    var result = new BasicCalculator().eval(expression);
    //THEN
    Assertions.assertEquals(expected, result);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(" 1 + 1 ", 2),
        Arguments.arguments(" 2-1 + 2 ", 3),
        Arguments.arguments(" -(1)-(1) ", -2),
        Arguments.arguments(" -(1)+(1) ", 0),
        Arguments.arguments("(1+(4+5+2)-3)+(6+8)", 23)
    );
  }

}
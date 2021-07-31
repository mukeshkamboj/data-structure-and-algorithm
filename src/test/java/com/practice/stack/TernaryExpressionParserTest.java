package com.practice.stack;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TernaryExpressionParserTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testParseTernaryExpression(String expression, String expected) {
    //WHEN
    var result = new TernaryExpressionParser().parseTernaryExpression(expression);
    //THEN
    Assertions.assertEquals(expected, result);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments("T?2:3", "2"),
        Arguments.arguments("F?2:3", "3"),
        Arguments.arguments("F?T:F?T?1:2:F?3:4", "4"),
        Arguments.arguments("T?T?F:5:3", "F"),
        Arguments.arguments("F?1:T?4:5", "4")
    );
  }

}
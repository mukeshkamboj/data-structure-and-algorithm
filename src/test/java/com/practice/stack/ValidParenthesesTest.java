package com.practice.stack;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ValidParenthesesTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testValidBrackets(String str, boolean expected) {
    //WHEN
    var isValidBracket = new ValidParentheses().validBrackets(str);
    //THEN
    Assertions.assertEquals(expected, isValidBracket);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments("()", true),
        Arguments.arguments("(){}[]", true),
        Arguments.arguments("(){}[", false),
        Arguments.arguments("[{()}]", true),
        Arguments.arguments("[{}()]", true),
        Arguments.arguments("[{}(())]", true),
        Arguments.arguments("[{{}}(())]", true),
        Arguments.arguments("[{{()}}(())]", true)
    );
  }

}
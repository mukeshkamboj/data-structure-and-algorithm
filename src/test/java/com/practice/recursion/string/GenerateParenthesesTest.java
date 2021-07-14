package com.practice.recursion.string;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class GenerateParenthesesTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testGenerateParenthesis(int n, List<String> expected) {
    //WHEN
    var parenthesis = new GenerateParentheses().generateParenthesis(n);

    //THEN
    Assertions.assertIterableEquals(expected, parenthesis);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(3, asList("((()))", "(()())", "(())()", "()(())", "()()()")),
        Arguments.arguments(1, singletonList("()"))
    );
  }

}
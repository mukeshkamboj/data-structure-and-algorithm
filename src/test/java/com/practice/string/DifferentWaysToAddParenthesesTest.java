package com.practice.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class DifferentWaysToAddParenthesesTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testDiffWaysToCompute(String expression, List<Integer> expected) {
    //WHEN
    var diffWaysToCompute = new DifferentWaysToAddParentheses().diffWaysToCompute(expression);

    //THEN
    Assertions.assertIterableEquals(expected, diffWaysToCompute);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
//        Arguments.arguments("2-1-1", Arrays.asList(2, 0)),
        Arguments.arguments("2*3-4*5", Arrays.asList(-34, -10, -14, -10, 10))
    );
  }
}
package com.practice.stack;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class BaseballGameTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testCalPoint(String[] ops, int expectedResult) {
    //WHEN
    var result = new BaseballGame().calPoint(ops);
    //THEN
    Assertions.assertEquals(expectedResult, result);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new String[]{"1"}, 1),
        Arguments.arguments(new String[]{"5", "2", "C", "D", "+"}, 30),
        Arguments.arguments(new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"}, 27)
    );
  }
}
package com.practice.recursion.string;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class StrobogrammticNumberIIITest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testStrobogrammaticNumberCount(String low, String high, int expected) {
    //WHEN
    var count = new StrobogrammticNumberIII().strobogrammaticNumbersCount(low, high);
    //THEN
    Assertions.assertEquals(expected, count);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments("0", "999999999999999", 312499),
        Arguments.arguments("50", "100", 3),
        Arguments.arguments("0", "9", 3),
        Arguments.arguments("1", "9", 2)
    );
  }

}
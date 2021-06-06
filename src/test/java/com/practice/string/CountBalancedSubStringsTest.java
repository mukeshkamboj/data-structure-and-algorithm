package com.practice.string;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class CountBalancedSubStringsTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFindCount(String string, int expected) {
    //WHEN
    var count = new CountBalancedSubStrings().findCount(string);
    //THEN
    Assertions.assertEquals(expected, count);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments("", 0),
        Arguments.arguments("L", 0),
        Arguments.arguments("R", 0),
        Arguments.arguments("LR", 1),
        Arguments.arguments("RLRRLLRLRL", 4),
        Arguments.arguments("RLLLLRRRLR", 3),
        Arguments.arguments("LLLLRRRR", 1),
        Arguments.arguments("RLRRRLLRLL", 2)
    );
  }
}
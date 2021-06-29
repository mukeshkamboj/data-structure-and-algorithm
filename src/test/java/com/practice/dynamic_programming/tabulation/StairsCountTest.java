package com.practice.dynamic_programming.tabulation;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class StairsCountTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFindCount(int n, int expected) {
    //WHEN
    var count = new StairsCount().findCount(n);
    //THEN
    Assertions.assertEquals(expected, count);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(6, 24),
        Arguments.arguments(4, 7),
        Arguments.arguments(3, 4),
        Arguments.arguments(2, 2),
        Arguments.arguments(1, 1),
        Arguments.arguments(0, 1)
    );
  }
}
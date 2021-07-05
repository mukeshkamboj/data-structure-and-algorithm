package com.practice.dynamic_programming;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class UniquePathsTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFindUniquePaths(int m, int n, int expectedUniquePaths) {
    //WHEN
    var uniquePaths = new UniquePaths().findUniquePaths(m, n);
    //THEN
    Assertions.assertEquals(expectedUniquePaths, uniquePaths);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(3, 3, 6),
        Arguments.arguments(7, 3, 28),
        Arguments.arguments(3, 2, 3)
    );
  }

}
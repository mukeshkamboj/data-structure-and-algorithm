package com.practice.dynamic_programming;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ClimbingStairsTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testCountPaths(int steps, int expectedPaths) {
    //WHEN
    var paths = new ClimbingStairs().countPaths(steps);
    //THEN
    assertEquals(expectedPaths, paths);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(2, 2),
        Arguments.arguments(4, 5)
    );
  }
}
package com.practice.dynamic_programming;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class MinimumSideWayJumpsTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testMinSideJumps(int[] obstacles, int expectedMinSideJumps) {
    //WHEN
    var minSideJumps = new MinimumSideWayJumps().minSideJumps(obstacles);
    //THEN
    Assertions.assertEquals(expectedMinSideJumps, minSideJumps);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{0, 1, 2, 3, 0}, 2),
        Arguments.arguments(new int[]{0, 1, 1, 3, 3, 0}, 0),
        Arguments.arguments(new int[]{0, 2, 1, 0, 3, 0}, 2)
    );
  }
}
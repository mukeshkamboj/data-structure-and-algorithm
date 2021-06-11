package com.practice.recursion;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class FindMinimumAndMaximumStepsInMazeTest {


  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFindMinSteps(int[][] maze, int expectedMinSteps) {
    //WHEN
    var minSteps = new FindMinimumAndMaximumStepsInMaze().findMinSteps(maze);
    //THEN
    Assertions.assertEquals(expectedMinSteps, minSteps);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[][]{
            {0, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 1, 0},
            {1, 0, 1, 0, 1, 0},
            {0, 0, 0, 1, 0, 0},
            {1, 0, 0, 0, 1, 0},
            {1, 1, 0, 0, 0, 0}
        }, 10)
    );
  }
}
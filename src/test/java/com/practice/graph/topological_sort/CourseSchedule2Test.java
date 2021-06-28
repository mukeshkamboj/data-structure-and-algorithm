package com.practice.graph.topological_sort;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class CourseSchedule2Test {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFindSchedule(int[][] g, int nv, int[] expected) {
//WHEN
    var schedule = new CourseSchedule2().findSchedule(g, nv);
    //THEN
    Assertions.assertArrayEquals(expected, schedule);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[][]{
            {1, 0}
        }, 2, new int[]{0, 1}),
        Arguments.arguments(new int[][]{
            {1, 0},
            {2, 0},
            {3, 1},
            {3, 2},
        }, 4, new int[]{0, 1, 2, 3}),
        Arguments.arguments(new int[][]{
            {1, 0},
            {2, 1},
            {3, 2},
            {1, 3},
        }, 4, new int[]{})
    );
  }
}
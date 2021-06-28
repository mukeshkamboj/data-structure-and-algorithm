package com.practice.graph.topological_sort;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class CourseScheduleTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testCanComplete(int[][] g, int nv, boolean expected) {
    //WHEN
    var actual = new CourseSchedule().canComplete(g, nv);
    //THEN
    Assertions.assertEquals(expected, actual);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[][]{{1, 0}}, 2, true),
        Arguments.arguments(new int[][]{{1, 0}, {0, 1}}, 2, false)
    );
  }
}
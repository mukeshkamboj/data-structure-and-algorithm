package com.practice.graph;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class FindTheTownJudgeTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFindJudge(int[][] g, int people, int expected) {
    //WHEN
    var judge = new FindTheTownJudge().findJudge(people, g);
    //THEN
    Assertions.assertEquals(expected, judge);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[][]{{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}}, 4, 3),
        Arguments.arguments(new int[][]{{1, 3}, {3, 1}, {2, 3}}, 3, -1)
    );
  }
}
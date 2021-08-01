package com.practice.string;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class OutputContestMatchesTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFindContestMatch(int n, String expected) {
    //WHEN
    var contestMatch = new OutputContestMatches().findContestMatch(n);
    //THEN
    Assertions.assertEquals(expected, contestMatch);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(2, "(1,2)"),
        Arguments.arguments(4, "((1,4),(2,3))"),
        Arguments.arguments(8, "(((1,8),(4,5)),((2,7),(3,6)))"),
        Arguments.arguments(8, "(((1,8),(4,5)),((2,7),(3,6)))"),
        Arguments
            .arguments(16, "((((1,16),(8,9)),((4,13),(5,12))),(((2,15),(7,10)),((3,14),(6,11))))")
    );
  }

}
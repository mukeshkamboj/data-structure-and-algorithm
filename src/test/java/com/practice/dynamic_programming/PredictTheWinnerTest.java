package com.practice.dynamic_programming;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class PredictTheWinnerTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testPredictWinner(int[] arr, boolean expected) {
    //WHEN
    var isPlayer1Winner = new PredictTheWinner().predictTheWinner(arr);

    //THEN
    Assertions.assertEquals(expected, isPlayer1Winner);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{1, 5, 2}, false),
        Arguments.arguments(new int[]{1, 5, 233, 7}, true)
    );
  }
}
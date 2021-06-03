package com.practice.heap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class LastStoneWeightTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFindLastStoneWeight(int[] stones, int expectedLastStoneWeight) {
    //WHEN
    var lastStoneWeight = new LastStoneWeight().findLastStoneWeight(stones);
    //THEN
    assertEquals(expectedLastStoneWeight, lastStoneWeight);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{1}, 1),
        Arguments.arguments(new int[]{2, 7, 4, 1, 8, 1}, 1)
    );
  }
}
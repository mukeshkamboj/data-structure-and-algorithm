package com.practice.graph;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class MinCostToConnectAllPointsTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testMinCostConnectPoints(int[][] arr, int expectedMinCost) {
    //WHEN
    var minCost = new MinCostToConnectAllPoints().minCostConnectPoints(arr);
    //THEN
    Assertions.assertEquals(expectedMinCost, minCost);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[][]{{0, 0}, {2, 2}, {3, 10}, {5, 2}, {7, 0}}, 20)
    );
  }
}
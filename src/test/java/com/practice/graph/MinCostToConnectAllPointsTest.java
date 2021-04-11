package com.practice.graph;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MinCostToConnectAllPointsTest {

  @DisplayName("GIVEN the points WHEN minCostConnectPoints method is invoked THEN it returns the minimum cost of edges connecting all the points.")
  @Test
  public void testFindTheMinCostToConnectAllPoints() {
    //GIVEN
    int[][] points = {{0, 0}, {2, 2}, {3, 10}, {5, 2}, {7, 0}};

    //WHEN
    int cost = MinCostToConnectAllPoints.minCostConnectPoints(points);

    //THEN
    MatcherAssert.assertThat(cost, Is.is(20));
  }
}
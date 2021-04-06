package com.practice.graph;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FindCenterOfStarGraphTest {

  @DisplayName("Find the center star")
  @Test
  public void findCenterStar() {
    int[][] input = {{1, 2}, {5, 1}, {1, 3}, {1, 4}};
    int centerStar = new FindCenterOfStarGraph().findCenter(input);
    assertThat(centerStar, is(1));
  }
}
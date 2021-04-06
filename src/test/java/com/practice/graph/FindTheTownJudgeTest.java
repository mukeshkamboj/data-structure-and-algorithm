package com.practice.graph;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FindTheTownJudgeTest {

  @DisplayName("Test with Possible Town Judge")
  @Test
  public void testWithPossibleTownJudge() {
    int number = 4;
    int[][] input = {{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}};
    int judge = new FindTheTownJudge().findJudge(number, input);
    assertThat(judge, is(3));
  }

  @DisplayName("Test with no Town Judge")
  @Test
  public void testWithNoTownJudge() {
    int number = 3;
    int[][] input = {{1, 3}, {3, 1}, {2, 3}};
    int judge = new FindTheTownJudge().findJudge(number, input);
    assertThat(judge, is(-1));
  }
}
package com.practice.array;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MergeIntervalsTest {

  @DisplayName("GIVEN an array with overlapping intervals WHEN merge is called THEN it merged the overlapping intervals and returns the new array of intervals")
  @Test
  public void testMergeWithOverlappingIntervals() {
    //GIVEN
    int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
    //WHEN
    int[][] mergedInterval = new MergeIntervals().merge(intervals);
    //THEN
    MatcherAssert.assertThat(mergedInterval, Is.is(new int[][]{{1, 6}, {8, 10}, {15, 18}}));
  }

  @DisplayName("GIVEN an array with only 1 interval WHEN merge is called THEN it returns the given array")
  @Test
  public void testMergeWith1Intervals() {
    //GIVEN
    int[][] intervals = {{1, 3}};
    //WHEN
    int[][] mergedInterval = new MergeIntervals().merge(intervals);
    //THEN
    MatcherAssert.assertThat(mergedInterval, Is.is(new int[][]{{1, 3}}));
  }

  @DisplayName("GIVEN an array with only 2 intervals one contained another one within it WHEN merge is called THEN it returns the array of merged intverval")
  @Test
  public void testMergeWith2Intervals1Contains2ndWithinIt() {
    //GIVEN
    int[][] intervals = {{1, 10}, {2, 5}};
    //WHEN
    int[][] mergedInterval = new MergeIntervals().merge(intervals);
    //THEN
    MatcherAssert.assertThat(mergedInterval, Is.is(new int[][]{{1, 10}}));
  }
}

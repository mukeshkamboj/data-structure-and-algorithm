package com.practice.dynamic_programming;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LongestIncreasingSubSequence_O_N_SquareTest {

  @DisplayName("GIVEN an array with no increase sequence WHEN findMax is invoked THEN it returns 1")
  @Test
  public void testFindMaxWithDecreasingSequences() {
    //WHEN
    int[] arr = {10, 9, 8, 7, 6, 5, 4, 3};
    //GIVEN
    int max = new LongestIncreasingSubSequence_O_N_Square().findMax(arr);
    //THEN
    MatcherAssert.assertThat(max, Is.is(1));
  }

  @DisplayName("GIVEN an array with the multiple increase sequence WHEN findMax is invoked THEN it returns the size of longest LIS")
  @Test
  public void testFindMaxWithMultipleIncreasingSequences() {
    //WHEN
    int[] arr = {10, 9, 2, 5, 3, 7, 101, 18};
    //GIVEN
    int max = new LongestIncreasingSubSequence_O_N_Square().findMax(arr);
    //THEN
    MatcherAssert.assertThat(max, Is.is(4));
  }

  @DisplayName("GIVEN an array with elements sorted in the increasing order WHEN findMax is invoked THEN it returns the size of the array")
  @Test
  public void testFindMaxWithSortedArrayInIncreasingOrder() {
    //WHEN
    int[] arr = {10, 11, 12, 13, 14, 15};
    //GIVEN
    int max = new LongestIncreasingSubSequence_O_N_Square().findMax(arr);
    //THEN
    MatcherAssert.assertThat(max, Is.is(arr.length));
  }

  @DisplayName("GIVEN an array with single element WHEN findMax is invoked THEN it returns 1")
  @Test
  public void testFindMaxWithArrayWithSingleElement() {
    //WHEN
    int[] arr = {10};
    //GIVEN
    int max = new LongestIncreasingSubSequence_O_N_Square().findMax(arr);
    //THEN
    MatcherAssert.assertThat(max, Is.is(1));
  }

  @DisplayName("GIVEN an empty array WHEN findMax is invoked THEN it returns 0")
  @Test
  public void testFindMaxWithEmptyArray() {
    //WHEN
    int[] arr = {};
    //GIVEN
    int max = new LongestIncreasingSubSequence_O_N_Square().findMax(arr);
    //THEN
    MatcherAssert.assertThat(max, Is.is(0));
  }
}
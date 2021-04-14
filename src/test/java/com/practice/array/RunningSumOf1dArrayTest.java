package com.practice.array;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RunningSumOf1dArrayTest {

  @DisplayName("GIVEN 1D array WHEN runningSum is invoked THEN array with running sum is returned")
  @Test
  public void testFindRunningSumGiven1DArray() {
    //GIVE
    int[] arr = {3, 1, 2, 10, 1};
    //WHEN
    int[] result = RunningSumOf1dArray.runningSum(arr);
    //THEN
    MatcherAssert.assertThat(result, Is.is(new int[]{3, 4, 6, 16, 17}));
  }

  @DisplayName("GIVEN 1D array with no elements WHEN runningSum is invoked THEN empty array is returned")
  @Test
  public void testFindRunningSumGiven1DArrayWithNoElement() {
    //GIVE
    int[] arr = {3, 1, 2, 10, 1};
    //WHEN
    int[] result = RunningSumOf1dArray.runningSum(arr);
    //THEN
    MatcherAssert.assertThat(result, Is.is(new int[]{3, 4, 6, 16, 17}));
  }

  @DisplayName("GIVEN 1D array with -ve and + ve elements WHEN runningSum is invoked THEN array with running sum is returned")
  @Test
  public void testFindRunningSumGiven1DArrayWithNegativeAndPositive() {
    //GIVE
    int[] arr = {3, -1, -2, 10, 1};
    //WHEN
    int[] result = RunningSumOf1dArray.runningSum(arr);
    //THEN
    MatcherAssert.assertThat(result, Is.is(new int[]{3, 2, 0, 10, 11}));
  }
}
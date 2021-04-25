package com.practice.array;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FindMaxSumOfSubArrayTest {

  @DisplayName("GIVEN an array WHEN maxSubArraySum is invoked THEN max sum of sub array is returned")
  @Test
  public void testMaxSubArraySum() {
    //GIVEN
    int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    //WHEN
    int maxSum = new FindMaxSumOfSubArray().maxSubArraySum(arr);
    //THEN
    MatcherAssert.assertThat(maxSum, Is.is(6));
  }

  @DisplayName("GIVEN an array where only one number is positive and rest are -ve WHEN maxSubArraySum is invoked THEN positive number is returned")
  @Test
  public void testMaxSubArraySumOnlyOneElementIsPositive() {
    //GIVEN
    int[] arr = {-2, -1, -3, 100, -1, -2, -1, -5, -4};
    //WHEN
    int maxSum = new FindMaxSumOfSubArray().maxSubArraySum(arr);
    //THEN
    MatcherAssert.assertThat(maxSum, Is.is(100));
  }

  @DisplayName("GIVEN an array with single element THEN maxSubArraySum is invoked THEN given single element is returned")
  @Test
  public void testMaxSubArraySumArrayHasSingleElement() {
    //GIVEN
    int[] arr = {1};
    //WHEN
    int maxSum = new FindMaxSumOfSubArray().maxSubArraySum(arr);
    //THEN
    MatcherAssert.assertThat(maxSum, Is.is(1));
  }
}
package com.practice.sliding_window;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

public class MaxSumOfContiguousSubArrayTest {

  @Test
  public void test_1() {
    int maxSumOfSubArray = MaxSumOfContiguousSubArray.findMaxSum(3, new int[]{2, 1, 5, 1, 3, 2});
    assertThat(9, is(maxSumOfSubArray));
  }

  @Test
  public void test_2() {
    int maxSumOfSubArray = MaxSumOfContiguousSubArray.findMaxSum(2, new int[]{2, 3, 4, 1, 5});
    assertThat(7, is(maxSumOfSubArray));
  }
}
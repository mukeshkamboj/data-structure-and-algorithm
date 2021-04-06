package com.practice.sliding_window;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

public class AvgOfContiguousSubArrayTest {

  @Test
  public void test_1() {
    double[] avgOfContiguousSubArray = AvgOfContiguousSubArray
        .findAvgOfContiguousSubArray(5, new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2});
    assertThat(avgOfContiguousSubArray, is(new double[]{2.2, 2.8, 2.4, 3.6, 2.8}));
  }
}
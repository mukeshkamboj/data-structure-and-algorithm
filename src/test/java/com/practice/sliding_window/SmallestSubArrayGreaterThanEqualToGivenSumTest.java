package com.practice.sliding_window;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

public class SmallestSubArrayGreaterThanEqualToGivenSumTest {

  @Test
  public void test_1() {
    int smallestSubArrayLength = SmallestSubArrayGreaterThanEqualToGivenSum
        .findSmallestSubArrayLength(100, new int[]{7, 2, 1, 5, 2, 3, 2});
    assertThat(0, is(smallestSubArrayLength));
  }

  @Test
  public void test_2() {
    int smallestSubArrayLength = SmallestSubArrayGreaterThanEqualToGivenSum
        .findSmallestSubArrayLength(7, new int[]{7, 2, 1, 5, 2, 3, 2});
    assertThat(1, is(smallestSubArrayLength));
  }

  @Test
  public void test_3() {
    int smallestSubArrayLength = SmallestSubArrayGreaterThanEqualToGivenSum
        .findSmallestSubArrayLength(7, new int[]{2, 1, 5, 2, 3, 2});
    assertThat(2, is(smallestSubArrayLength));
  }

  @Test
  public void test_4() {
    int smallestSubArrayLength = SmallestSubArrayGreaterThanEqualToGivenSum
        .findSmallestSubArrayLength(7, new int[]{2, 1, 5, 2, 8});
    assertThat(1, is(smallestSubArrayLength));
  }

  @Test
  public void test_5() {
    int smallestSubArrayLength = SmallestSubArrayGreaterThanEqualToGivenSum
        .findSmallestSubArrayLength(8, new int[]{3, 4, 1, 1, 6});
    assertThat(3, is(smallestSubArrayLength));
  }
}
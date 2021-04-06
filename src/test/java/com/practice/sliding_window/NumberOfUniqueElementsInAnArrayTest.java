package com.practice.sliding_window;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;

public class NumberOfUniqueElementsInAnArrayTest {

  @Test
  public void test_1() {
    int uniqueElements = NumberOfUniqueElementsInAnArray.find(new int[]{2, 3, 3, 3, 6, 9, 9});
    MatcherAssert.assertThat(uniqueElements, is(4));
  }

  @Test
  public void test_2() {
    int uniqueElements = NumberOfUniqueElementsInAnArray.find(new int[]{2, 2, 2, 11});
    MatcherAssert.assertThat(uniqueElements, is(2));
  }
}
package com.practice.dynamic_programming;

import static org.hamcrest.core.Is.is;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SortIntegerByPowerOfValueTest {

  @DisplayName("GIVEN low and high value and kth position WHEN getKth function is invoked THEN it returns the kth element from the list of number between low to high in the ascending order with their power")
  @Test
  public void test() {
    //GIVEN
    int low = 12;
    int high = 15;
    int k = 2;

    //WHEN
    int kth = new SortIntegerByPowerOfValue().getKth(1, 1000, 777);

    //THEN
    MatcherAssert.assertThat(kth, is(570));
  }

}
package com.practice.dynamic_programming;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FindMaxWealthTest {

  @DisplayName("GIVEN customer and their wealth WHEN maximumWealth function is invoked THEN max customer wealth is returned")
  @Test
  public void testFindTheMaxWealth() {
    //GIVEN
    int[][] customersWealth = {{1, 5}, {7, 3}, {3, 5}};
    //WHEN
    int maxWealth = FindMaxWealth.maximumWealth(customersWealth);
    //THEN
    MatcherAssert.assertThat(maxWealth, Is.is(10));
  }

  @DisplayName("GIVEN customer and their zero balance wealth WHEN maximumWealth function is invoked THEN 0 is returned")
  @Test
  public void testFindTheMaxWealthWhenWealthIsZero() {
    //GIVEN
    int[][] customersWealth = {{0}, {0}, {0}};
    //WHEN
    int maxWealth = FindMaxWealth.maximumWealth(customersWealth);
    //THEN
    MatcherAssert.assertThat(maxWealth, Is.is(0));
  }
}
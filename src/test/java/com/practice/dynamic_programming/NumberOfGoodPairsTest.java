package com.practice.dynamic_programming;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NumberOfGoodPairsTest {

  @DisplayName("GIVEN an array with duplicate values WHEN numIdenticalPairs is called THEN it returns the count of pairs")
  @Test
  public void testFindGoodPaisCount() {
    //GIVEN
    int[] arr = {1, 2, 3, 1, 1, 3};
    //WHEN
    int pairCount = NumberOfGoodPairs.numIdenticalPairs(arr);
    //THEN
    MatcherAssert.assertThat(pairCount, Is.is(4));
  }

  @DisplayName("GIVEN an array with no duplicate values WHEN numIdenticalPairs is called THEN it returns 0")
  @Test
  public void testFindGoodPaisCountWithNoDuplicates() {
    //GIVEN
    int[] arr = {1, 2, 3, 4, 5, 6};
    //WHEN
    int pairCount = NumberOfGoodPairs.numIdenticalPairs(arr);
    //THEN
    MatcherAssert.assertThat(pairCount, Is.is(0));
  }

  @DisplayName("GIVEN an array with no values WHEN numIdenticalPairs is called THEN it returns 0")
  @Test
  public void testFindGoodPaisCountWithEmptyArray() {
    //GIVEN
    int[] arr = {};
    //WHEN
    int pairCount = NumberOfGoodPairs.numIdenticalPairs(arr);
    //THEN
    MatcherAssert.assertThat(pairCount, Is.is(0));
  }
}
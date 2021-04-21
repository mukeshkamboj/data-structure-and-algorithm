package com.practice.array;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HowManyNumbersAreSmallerThanTheCurrentNumberTest {

  @DisplayName("GIVEN an non array with duplicate numbers WHEN findSmallerNumbersCount is called THEN it returns an array with count of smaller numbers for each element in the array")
  @Test
  public void testFindSmallerNumbersCountForEachElementInTheArrayWithDuplicates() {
    //GIVEN
    int[] arr = {8, 0, 1, 1, 2, 2};
    //WHEN
    int[] result = new HowManyNumbersAreSmallerThanTheCurrentNumber().findSmallerNumbersCount(arr);
    //THEN
    assertThat(result, is(new int[]{5, 0, 1, 1, 3, 3}));
  }

  @DisplayName("GIVEN an non array with no duplicate numbers WHEN findSmallerNumbersCount is called THEN it returns an array with count of smaller numbers for each element in the array")
  @Test
  public void testFindSmallerNumbersCountForEachElementInTheArrayWithNoDuplicates() {
    //GIVEN
    int[] arr = {8, 19, 32, 34, 1, 4};
    //WHEN
    int[] result = new HowManyNumbersAreSmallerThanTheCurrentNumber().findSmallerNumbersCount(arr);
    //THEN
    assertThat(result, is(new int[]{2, 3, 4, 5, 0, 1}));
  }

  @DisplayName("GIVEN an non array with only 1 element WHEN findSmallerNumbersCount is called THEN it returns an array with one element only with count 0")
  @Test
  public void testFindSmallerNumbersCountForEachElementInTheArrayWithSingleElementOnly() {
    //GIVEN
    int[] arr = {8};
    //WHEN
    int[] result = new HowManyNumbersAreSmallerThanTheCurrentNumber().findSmallerNumbersCount(arr);
    //THEN
    assertThat(result, is(new int[]{0}));
  }

  @DisplayName("GIVEN an non array with only 1 unique element multiple times WHEN findSmallerNumbersCount is called THEN it returns an array 0 same number time as array length")
  @Test
  public void testFindSmallerNumbersCountForEachElementInTheArrayWithOnlyOneUniqueElementMultipleTime() {
    //GIVEN
    int[] arr = {10, 10, 10, 10, 10, 10};
    //WHEN
    int[] result = new HowManyNumbersAreSmallerThanTheCurrentNumber().findSmallerNumbersCount(arr);
    //THEN
    assertThat(result, is(new int[]{0, 0, 0, 0, 0, 0}));
  }

  @DisplayName("GIVEN an empty array WHEN findSmallerNumbersCount is called THEN it returns an empty array")
  @Test
  public void testEmptyArray() {
    //GIVEN
    int[] arr = {};
    //WHEN
    int[] result = new HowManyNumbersAreSmallerThanTheCurrentNumber().findSmallerNumbersCount(arr);
    //THEN
    assertThat(result, is(new int[]{}));
  }
}
package com.practice.array;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MaximumAscendingSubArraySumTest {

  @DisplayName("GIVEN an array with multiple subArrays containing elements in ascending order WHEN maxAscendingSum is invoked THEN it returns the max sum of elements of the subArray")
  @Test
  public void testMaxAscendingSumMultipleSubArrayWithElementsInAscendingOrder() {
    //GIVEN
    int[] arr = {12, 17, 15, 13, 10, 11, 12, 5, 6, 7};
    //WHEN
    int sum = new MaximumAscendingSubArraySum().maxAscendingSum(arr);
    //THEN
    MatcherAssert.assertThat(sum, Is.is(33));
  }

  @DisplayName("GIVEN an array with multiple subArrays containing elements in ascending order and there is sub array array with single element which larger then the sum of all other sub array WHEN maxAscendingSum is invoked THEN it returns the subArray with single element")
  @Test
  public void testMaxAscendingSumArrayWithAnElementGreaterThenSumOfSubArrays() {
    //GIVEN
    int[] arr = {100, 12, 17, 15, 13, 10, 11, 12, 5, 6, 7};
    //WHEN
    int sum = new MaximumAscendingSubArraySum().maxAscendingSum(arr);
    //THEN
    MatcherAssert.assertThat(sum, Is.is(100));
  }

  @DisplayName("GIVEN an array with all elements in ascending order WHEN maxAscendingSum is invoked THEN it returns the sum of all elements.")
  @Test
  public void testMaxAscendingSumArrayElementsAreInAscendingOrder() {
    //GIVEN
    int[] arr = {10, 11, 12};
    //WHEN
    int sum = new MaximumAscendingSubArraySum().maxAscendingSum(arr);
    //THEN
    MatcherAssert.assertThat(sum, Is.is(33));
  }

  @DisplayName("GIVEN an array with all elements in descending order WHEN maxAscendingSum is invoked THEN it returns the first element of the array.")
  @Test
  public void testMaxAscendingSumArrayHasAllElementInDescendingOrder() {
    //GIVEN
    int[] arr = {50, 34, 21, 12};
    //WHEN
    int sum = new MaximumAscendingSubArraySum().maxAscendingSum(arr);
    //THEN
    MatcherAssert.assertThat(sum, Is.is(50));
  }

  @DisplayName("GIVEN an array with one number's duplicate WHEN maxAscendingSum is invoked THEN it returns the first element of the array.")
  @Test
  public void testMaxAscendingSumArrayHasDuplicatesOfSingleNumber() {
    //GIVEN
    int[] arr = {10, 10, 10, 10, 10};
    //WHEN
    int sum = new MaximumAscendingSubArraySum().maxAscendingSum(arr);
    //THEN
    MatcherAssert.assertThat(sum, Is.is(10));
  }

  @DisplayName("GIVEN an array with one number WHEN maxAscendingSum is invoked THEN it returns the first element of the array.")
  @Test
  public void testMaxAscendingSumArrayHasSingleElement() {
    //GIVEN
    int[] arr = {10};
    //WHEN
    int sum = new MaximumAscendingSubArraySum().maxAscendingSum(arr);
    //THEN
    MatcherAssert.assertThat(sum, Is.is(10));
  }

  @DisplayName("GIVEN an empty array WHEN maxAscendingSum is invoked THEN it returns 0")
  @Test
  public void testMaxAscendingSumArrayIsEmpty() {
    //GIVEN
    int[] arr = {};
    //WHEN
    int sum = new MaximumAscendingSubArraySum().maxAscendingSum(arr);
    //THEN
    MatcherAssert.assertThat(sum, Is.is(0));
  }
}
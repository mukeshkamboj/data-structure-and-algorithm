package com.practice.dynamic_programming;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntersectionOfTwoSortedArraysTest {

  @DisplayName("GIVEN two sorted array with common elements WHEN intersection method is invoked THEN an array containing the common elements uniquely is returned")
  @Test
  public void testFindIntersectionOfTwoSortedArrays() {
    //GIVEN
    int[] arr1 = {0, 1, 2, 3, 3, 4};
    int[] arr2 = {0, 0, 0, 3, 3, 4, 5, 6, 9, 9};
    //WHEN
    int[] intersection = IntersectionOfTwoSortedArrays.intersection(arr1, arr2);
    //THEN
    MatcherAssert.assertThat(intersection, Is.is(new int[]{0, 3, 4}));
  }

  @DisplayName("GIVEN two sorted array with no common elements WHEN intersection method is invoked THEN an empty array is returned")
  @Test
  public void testFindIntersectionOfTwoSortedArraysWithNoCommonElement() {
    //GIVEN
    int[] arr1 = {1, 2, 3, 4, 5};
    int[] arr2 = {6, 7, 8, 9};
    //WHEN
    int[] intersection = IntersectionOfTwoSortedArrays.intersection(arr1, arr2);
    //THEN
    MatcherAssert.assertThat(intersection, Is.is(new int[]{}));
  }

  @DisplayName("GIVEN two empty arrays WHEN intersection method is invoked THEN an empty array is returned")
  @Test
  public void testFindIntersectionOfTwoEmptyArrays() {
    //GIVEN
    int[] arr1 = {};
    int[] arr2 = {};
    //WHEN
    int[] intersection = IntersectionOfTwoSortedArrays.intersection(arr1, arr2);
    //THEN
    MatcherAssert.assertThat(intersection, Is.is(new int[]{}));
  }
}
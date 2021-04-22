package com.practice.array;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntersectionOfTwoArraysTest {

  @DisplayName("GIVEN two arrays with some intersecting elements WHEN intersection is called THEN it returns the array with intersection")
  @Test
  public void testIntersection() {
    //GIVEN
    int[] arr1 = {1, 2, 2, 1};
    int[] arr2 = {1, 2};
    //WHEN
    int[] intersection = new IntersectionOfTwoArrays().intersection(arr1, arr2);
    //THEN
    MatcherAssert.assertThat(intersection, Is.is(new int[]{1, 2}));
  }

  @DisplayName("GIVEN two arrays with no intersecting elements WHEN intersection is called THEN it returns an empty array")
  @Test
  public void testIntersectionWithNoCommonElements() {
    //GIVEN
    int[] arr1 = {1, 2, 2, 1};
    int[] arr2 = {3, 4};
    //WHEN
    int[] intersection = new IntersectionOfTwoArrays().intersection(arr1, arr2);
    //THEN
    MatcherAssert.assertThat(intersection, Is.is(new int[]{}));
  }

  @DisplayName("GIVEN two empty arrays WHEN intersection is called THEN it returns an empty array")
  @Test
  public void testIntersectionWithTwoEmptyArrays() {
    //GIVEN
    int[] arr1 = {};
    int[] arr2 = {};
    //WHEN
    int[] intersection = new IntersectionOfTwoArrays().intersection(arr1, arr2);
    //THEN
    MatcherAssert.assertThat(intersection, Is.is(new int[]{}));
  }
}
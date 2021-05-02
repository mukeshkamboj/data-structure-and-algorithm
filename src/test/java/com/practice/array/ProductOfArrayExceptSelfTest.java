package com.practice.array;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProductOfArrayExceptSelfTest {

  @DisplayName("GIVEN an array with natural numbers WHEN productExceptSelf is invoked THEN it returns an array with products except itself")
  @Test
  public void testProductExceptSelfWithNaturalNumber() {
    //GIVEN
    int[] arr = {1, 2, 3, 4, 5};
    //WHEN
    int[] result = new ProductOfArrayExceptSelf().productExceptSelf(arr);
    //THEN
    MatcherAssert.assertThat(result, Is.is(new int[]{120, 60, 40, 30, 24}));
  }

  @DisplayName("GIVEN an array with non zeroes and one negative numbers WHEN productExceptSelf is invoked THEN it returns an array with products except itself")
  @Test
  public void testProductExceptSelfWithArrayContainingNonZeroNegativeNumbers() {
    //GIVEN
    int[] arr = {1, 2, -3, 4, 5};
    //WHEN
    int[] result = new ProductOfArrayExceptSelf().productExceptSelf(arr);
    //THEN
    MatcherAssert.assertThat(result, Is.is(new int[]{-120, -60, 40, -30, -24}));
  }

  @DisplayName("GIVEN an array containing one zero WHEN productExceptSelf is invoked THEN it returns an array with products except itself")
  @Test
  public void testProductExceptSelfWithArrayContainingZero() {
    //GIVEN
    int[] arr = {1, 2, 0, 4, 5};
    //WHEN
    int[] result = new ProductOfArrayExceptSelf().productExceptSelf(arr);
    //THEN
    MatcherAssert.assertThat(result, Is.is(new int[]{0, 0, 40, 0, 0}));
  }

  @DisplayName("GIVEN an array containing more than one zeroes WHEN productExceptSelf is invoked THEN it returns an array with products except itself")
  @Test
  public void testProductExceptSelfWithArrayContainingMoreThanOneZeroes() {
    //GIVEN
    int[] arr = {1, 2, 0, 4, 5, 0};
    //WHEN
    int[] result = new ProductOfArrayExceptSelf().productExceptSelf(arr);
    //THEN
    MatcherAssert.assertThat(result, Is.is(new int[]{0, 0, 0, 0, 0, 0}));
  }

  @DisplayName("GIVEN an empty array WHEN productExceptSelf is invoked THEN it returns an empty array")
  @Test
  public void testProductExceptSelfWithEmptyArray() {
    //GIVEN
    int[] arr = {};
    //WHEN
    int[] result = new ProductOfArrayExceptSelf().productExceptSelf(arr);
    //THEN
    MatcherAssert.assertThat(result, Is.is(new int[]{}));
  }
}
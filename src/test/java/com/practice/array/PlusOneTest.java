package com.practice.array;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PlusOneTest {

  @DisplayName("GIVEN an array with digits WHEN plusOne method is invoked THEN an array with next number is returned")
  @Test
  public void testPlusOne() {
    //GIVEN
    int[] arr = {1, 2, 3};
    //WHEN
    int[] result = new PlusOne().plusOne(arr);
    //THEN
    MatcherAssert.assertThat(result, Is.is(new int[]{1, 2, 4}));
  }

  @DisplayName("GIVEN an array with 3 digits and adding 1 makes it 4 digit WHEN plusOne method is invoked THEN an array with next number is returned")
  @Test
  public void testPlusOneAddingOneMakesNumberOneDigitLarger() {
    //GIVEN
    int[] arr = {9, 9, 9};
    //WHEN
    int[] result = new PlusOne().plusOne(arr);
    //THEN
    MatcherAssert.assertThat(result, Is.is(new int[]{1, 0, 0, 0}));
  }

  @DisplayName("GIVEN an array with 1 digit WHEN plusOne method is invoked THEN an array with next number is returned")
  @Test
  public void testPlusOneWithOneDigit() {
    //GIVEN
    int[] arr = {9};
    //WHEN
    int[] result = new PlusOne().plusOne(arr);
    //THEN
    MatcherAssert.assertThat(result, Is.is(new int[]{1, 0}));
  }

  @DisplayName("GIVEN an array with 0 digit only WHEN plusOne method is invoked THEN an array with next number is returned")
  @Test
  public void testPlusOneWithZeroOnly() {
    //GIVEN
    int[] arr = {0};
    //WHEN
    int[] result = new PlusOne().plusOne(arr);
    //THEN
    MatcherAssert.assertThat(result, Is.is(new int[]{1}));
  }
}
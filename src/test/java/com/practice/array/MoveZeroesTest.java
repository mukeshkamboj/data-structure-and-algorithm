package com.practice.array;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MoveZeroesTest {

  @DisplayName("GIVEN an array with zeros and other numeric values WHEN moveZeroes is called THEN it shifts the zeros on the right hand sides and keep the other values in the relative order")
  @Test
  public void testMoveZeroes() {
    //GIVEN
    int[] arr = {0, 1, 0, 2, 0, 3};
    //WHEN
    new MoveZeroes().moveZeroes(arr);
    //THEN
    MatcherAssert.assertThat(arr[0], Is.is(1));
    MatcherAssert.assertThat(arr[1], Is.is(2));
    MatcherAssert.assertThat(arr[2], Is.is(3));
    MatcherAssert.assertThat(arr[3], Is.is(0));
    MatcherAssert.assertThat(arr[4], Is.is(0));
    MatcherAssert.assertThat(arr[5], Is.is(0));
  }

  @DisplayName("GIVEN an empty array WHEN moveZeroes is called THEN it doesn't do anything")
  @Test
  public void testMoveZeroesEmptyArray() {
    //GIVEN
    int[] arr = {};
    //WHEN
    new MoveZeroes().moveZeroes(arr);
    //THEN
    MatcherAssert.assertThat(arr.length, Is.is(0));
  }
}
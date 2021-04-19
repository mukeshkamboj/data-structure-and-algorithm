package com.practice.dynamic_programming;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FindSameDegreeMinSubArrayLengthTest {

  @Test
  public void GIVEN_an_array_WHEN_findSameDegreeSubArrayLength_is_invoked_THEN_size_of_an_array_is_returned() {
    //GIVEN
    int[] arr = {1, 2, 3, 4, 2, 5};

    //WHEN
    int result = FindSameDegreeSubArrayLength.findSameDegreeMinSubArrayLength(arr);

    //THEN
    assertThat(result, is(4));
  }

  @Test
  public void GIVEN_an_array_with_multiple_sub_array_of_same_degree_WHEN_findSameDegreeSubArrayLength_is_invoked_THEN_size_of_an_min_sub_array_is_returned() {
    //GIVEN
    int[] arr = {6, 1, 2, 3, 4, 2, 5, 6};

    //WHEN
    int result = FindSameDegreeSubArrayLength.findSameDegreeMinSubArrayLength(arr);

    //THEN
    assertThat(result, is(4));
  }

  @Test
  public void GIVEN_an_array_with_multiple_sub_array_of_same_degree_and_same_size_WHEN_findSameDegreeSubArrayLength_is_invoked_THEN_size_of_an_min_sub_array_is_returned() {
    //GIVEN
    int[] arr = {1, 2, 3, 4, 2, 5, 6, 1, 5, 6};

    //WHEN
    int result = FindSameDegreeSubArrayLength.findSameDegreeMinSubArrayLength(arr);

    //THEN
    assertThat(result, is(4));
  }

  @Test
  public void GIVEN_an_empty_array_WHEN_findSameDegreeSubArrayLength_is_invoked_THEN_zero_is_returned() {
    //GIVEN
    int[] arr = {};

    //WHEN
    int result = FindSameDegreeSubArrayLength.findSameDegreeMinSubArrayLength(arr);

    //THEN
    assertThat(result, is(0));
  }

  @Test
  public void GIVEN_a_null_array_WHEN_findSameDegreeSubArrayLength_is_invoked_THEN_zero_is_returned() {
    //GIVEN
    int[] arr = null;

    //WHEN
    int result = FindSameDegreeSubArrayLength.findSameDegreeMinSubArrayLength(arr);

    //THEN
    assertThat(result, is(0));
  }

  @Test
  public void GIVEN_an_array_with_one_value_WHEN_findSameDegreeSubArrayLength_is_invoked_THEN_one_is_returned() {
    //GIVEN
    int[] arr = {1};

    //WHEN
    int result = FindSameDegreeSubArrayLength.findSameDegreeMinSubArrayLength(arr);

    //THEN
    assertThat(result, is(1));
  }
}

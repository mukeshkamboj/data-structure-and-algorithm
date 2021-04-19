package com.practice.dynamic_programming;


import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class RemoveAllOccurrencesOfValueToGetMaxSumOfArrayTest {

  @Test
  public void GIVEN_an_array_WHEN_find_function_is_invoked_THEN_element_is_returned() {

    //GIVEN
    int[] arr = {1, 2, 3, 4, 5, 1, 1, 1};

    //WHEN
    int result = RemoveAllOccurrencesOfValueToGetMaxSumOfArray.find(arr);

    //THEN
    assertThat(result, is(2));
  }

  @Test
  public void GIVEN_an_empty_array_WHEN_find_function_is_invoked_THEN_minus_one_is_returned() {

    //GIVEN
    int[] arr = {};

    //WHEN
    int result = RemoveAllOccurrencesOfValueToGetMaxSumOfArray.find(arr);

    //THEN
    assertThat(result, is(-1));
  }

  @Test
  public void GIVEN_null_array_WHEN_find_function_is_invoked_THEN_minus_one_is_returned() {

    //GIVEN
    int[] arr = null;

    //WHEN
    int result = RemoveAllOccurrencesOfValueToGetMaxSumOfArray.find(arr);

    //THEN
    assertThat(result, is(-1));
  }

  @Test
  public void GIVEN_an_array_with_one_element_WHEN_find_function_is_invoked_THEN_minus_one_is_returned() {

    //GIVEN
    int[] arr = {1};

    //WHEN
    int result = RemoveAllOccurrencesOfValueToGetMaxSumOfArray.find(arr);

    //THEN
    assertThat(result, is(-1));
  }

  @Test
  public void GIVEN_an_array_with_two_element_WHEN_find_function_is_invoked_THEN_element_is_returned() {

    //GIVEN
    int[] arr = {1, 2};

    //WHEN
    int result = RemoveAllOccurrencesOfValueToGetMaxSumOfArray.find(arr);

    //THEN
    assertThat(result, is(1));
  }

}
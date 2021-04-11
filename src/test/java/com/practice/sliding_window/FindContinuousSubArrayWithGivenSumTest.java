package com.practice.sliding_window;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class FindContinuousSubArrayWithGivenSumTest {

  @Test
  public void GIVEN_array_and_a_number_WHEN_find_function_is_invoked_THEN_starting_and_ending_indexes_are_returned() {

    //GIVEN
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int sum = 15;

    //WHEN
    String result = FindContinuousSubArrayWithGivenSum.find(arr, 15);

    //THEN
    assertThat(result, is("1 5"));
  }
}
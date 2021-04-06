package com.practice.dynamic_programming;


import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ArrayEquilibriumTest {

  @Test
  public void GIVEN_an_array_WHEN_find_equilibrium_function_is_invoked_THEN_equilibrium_value_is_returned() {
    //GIVEN
    int[] arr = {1, 2, 3, 4, 5, 15};

    //WHEN
    int result = ArrayEquilibrium.findEquilibrium(arr);

    //THEN
    assertThat(result, is(15));
  }

  @Test
  public void GIVEN_an_array_which_cannot_have_equilibrium_value_WHEN_find_equilibrium_function_is_invoked_THEN_minus_one_is_returned() {
    //GIVEN
    int[] arr = {1, 2, 3, 4, 5, 150};

    //WHEN
    int result = ArrayEquilibrium.findEquilibrium(arr);

    //THEN
    assertThat(result, is(-1));
  }

  @Test
  public void GIVEN_an_empty_array__WHEN_find_equilibrium_function_is_invoked_THEN_minus_one_is_returned() {
    //GIVEN
    int[] arr = {};

    //WHEN
    int result = ArrayEquilibrium.findEquilibrium(arr);

    //THEN
    assertThat(result, is(-1));
  }

  @Test
  public void GIVEN_an_array_of_size_one_WHEN_find_equilibrium_function_is_invoked_THEN_minus_one_is_returned() {
    //GIVEN
    int[] arr = {1};

    //WHEN
    int result = ArrayEquilibrium.findEquilibrium(arr);

    //THEN
    assertThat(result, is(-1));
  }

  @Test
  public void GIVEN_null_array_WHEN_find_equilibrium_function_is_invoked_THEN_minus_one_is_returned() {
    //GIVEN
    int[] arr = null;

    //WHEN
    int result = ArrayEquilibrium.findEquilibrium(arr);

    //THEN
    assertThat(result, is(-1));
  }
}

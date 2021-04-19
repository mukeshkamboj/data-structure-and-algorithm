package com.practice.dynamic_programming;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class FindMajorityElementBoyerMooreTest {

  @Test
  public void GIVEN_an_array_WHEN_find_method_is_invoked_THEN_value_is_returned() {

    //GIVEN
    int[] arr = {5, 1, 5, 2, 5, 3, 5, 4, 5, 6, 5};

    //WHEN
    String result = FindMajorityElementBoyerMoore.find(arr);

    //THEN
    assertThat(result, is("5"));
  }

  @Test
  public void GIVEN_an_empty_array_WHEN_find_method_is_invoked_THEN_No_Majority_Element_is_returned() {

    //GIVEN
    int[] arr = {};

    //WHEN
    String result = FindMajorityElementBoyerMoore.find(arr);

    //THEN
    assertThat(result, is("No Majority Element"));
  }

  @Test
  public void GIVEN_an_array_with_single_element_WHEN_find_method_is_invoked_THEN_single_element_is_returned() {

    //GIVEN
    int[] arr = {1};

    //WHEN
    String result = FindMajorityElementBoyerMoore.find(arr);

    //THEN
    assertThat(result, is("1"));
  }

  @Test
  public void GIVEN_an_array_all_element_having_same_majority_WHEN_find_method_is_invoked_THEN_No_Majority_Element_is_returned() {

    //GIVEN
    int[] arr = {1, 2, 1, 2};

    //WHEN
    String result = FindMajorityElementBoyerMoore.find(arr);

    //THEN
    assertThat(result, is("No Majority Element"));
  }
}

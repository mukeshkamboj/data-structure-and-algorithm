package com.practice.sliding_window;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class LongestBinarySubArrayTest {

  @Test
  public void GIVEN_max_replacement_allowed_and_array_WHEN_find_method_is_invoked_THEN_longest_binary_sub_array_length_is_returned_1() {
    //GIVEN
    int maxReplacementAllowed = 2;
    int[] array = {0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1};

    //WHEN
    int longestArray = LongestBinarySubArray.find(maxReplacementAllowed, array);

    //THEN
    assertThat(6, is(longestArray));
  }

  @Test
  public void GIVEN_max_replacement_allowed_and_array_WHEN_find_method_is_invoked_THEN_longest_binary_sub_array_length_is_returned_2() {
    //GIVEN
    int maxReplacementAllowed = 2;
    int[] array = {0, 1, 1, 0, 0, 0};

    //WHEN
    int longestArray = LongestBinarySubArray.find(maxReplacementAllowed, array);

    //THEN
    assertThat(4, is(longestArray));
  }

  @Test
  public void GIVEN_max_replacement_allowed_and_array_WHEN_find_method_is_invoked_THEN_longest_binary_sub_array_length_is_returned_3() {
    //GIVEN
    int maxReplacementAllowed = 3;
    int[] array = {0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1};

    //WHEN
    int longestArray = LongestBinarySubArray.find(maxReplacementAllowed, array);

    //THEN
    assertThat(9, is(longestArray));
  }

  @Test
  public void GIVEN_max_replacement_allowed_and_array_WHEN_find_method_is_invoked_THEN_longest_binary_sub_array_length_is_returned_4() {
    //GIVEN
    int maxReplacementAllowed = 2;
    int[] array = {1, 0, 0, 1, 0, 1, 0, 1};

    //WHEN
    int longestArray = LongestBinarySubArray.find(maxReplacementAllowed, array);

    //THEN
    assertThat(5, is(longestArray));
  }
}
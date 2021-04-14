package com.practice.string;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {

  @DisplayName("GIVEN an array of char WHEN reverseString is invoked THEN array's element are reversed")
  @Test
  public void testReverseArrayOfChars() {
    //GIVEN
    char[] arr = {'h', 'e', 'l', 'l', 'o'};
    //WHEN
    char[] result = ReverseString.reverseString(arr);
    //THEN
    MatcherAssert.assertThat(result, Is.is(new char[]{'o', 'l', 'l', 'e', 'h'}));
  }

  @DisplayName("GIVEN an empty array WHEN reverseString is invoked THEN an empty array is returned")
  @Test
  public void testEmptyArray() {
    //GIVEN
    char[] arr = {};
    //WHEN
    char[] result = ReverseString.reverseString(arr);
    //THEN
    MatcherAssert.assertThat(result, Is.is(new char[]{}));
  }
}
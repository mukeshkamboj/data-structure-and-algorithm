package com.practice.array;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LongestConsecutiveSequenceTest {

  @DisplayName("GIVEN an array with no duplicates and few elements forming sequence WHEN findMaxConsecutive sequence THEN it returns the length of max consecutive sequence")
  @Test
  public void testFindMaxConsecutive() {
    //GIVEN
    int[] arr = {23, 1, 22, 20, 54, 19, 24, 18, 21};
    //WHEN
    int maxConsecutiveArrayLength = new LongestConsecutiveSequence()
        .findMaxConsecutiveSubArrayLength(arr);
    //THEN
    MatcherAssert.assertThat(maxConsecutiveArrayLength, Is.is(7));
  }

  @DisplayName("GIVEN an array with duplicates and few elements forming sequence WHEN findMaxConsecutive sequence THEN it returns the length of max consecutive sequence")
  @Test
  public void testFindMaxConsecutiveWithDuplicates() {
    //GIVEN
    int[] arr = {23, 1, 22, 20, 54, 20, 23, 18, 19, 24, 18, 21};
    //WHEN
    int maxConsecutiveArrayLength = new LongestConsecutiveSequence()
        .findMaxConsecutiveSubArrayLength(arr);
    //THEN
    MatcherAssert.assertThat(maxConsecutiveArrayLength, Is.is(7));
  }

  @DisplayName("GIVEN an empty array WHEN findMaxConsecutive sequence THEN it returns 0")
  @Test
  public void testFindMaxConsecutiveEmptyArray() {
    //GIVEN
    int[] arr = {};
    //WHEN
    int maxConsecutiveArrayLength = new LongestConsecutiveSequence()
        .findMaxConsecutiveSubArrayLength(arr);
    //THEN
    MatcherAssert.assertThat(maxConsecutiveArrayLength, Is.is(0));
  }

  @DisplayName("GIVEN an array with elements forming no sequence WHEN findMaxConsecutive sequence THEN it returns 0")
  @Test
  public void testFindMaxConsecutiveWithNoSequence() {
    //GIVEN
    int[] arr = {12, 54, 745, 24, 75, 46};
    //WHEN
    int maxConsecutiveArrayLength = new LongestConsecutiveSequence()
        .findMaxConsecutiveSubArrayLength(arr);
    //THEN
    MatcherAssert.assertThat(maxConsecutiveArrayLength, Is.is(1));
  }

  @DisplayName("GIVEN an array with one element only WHEN findMaxConsecutive sequence THEN it returns 1")
  @Test
  public void testFindMaxConsecutiveWithSingleElement() {
    //GIVEN
    int[] arr = {12};
    //WHEN
    int maxConsecutiveArrayLength = new LongestConsecutiveSequence()
        .findMaxConsecutiveSubArrayLength(arr);
    //THEN
    MatcherAssert.assertThat(maxConsecutiveArrayLength, Is.is(1));
  }
}
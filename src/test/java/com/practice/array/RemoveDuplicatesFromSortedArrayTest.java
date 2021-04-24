package com.practice.array;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesFromSortedArrayTest {

  @DisplayName("GIVEN a sorted array with duplicate elements WHEN removeDuplicates is invoked THEN it returns the size of array after removing the duplicates")
  @Test
  public void testRemoveDuplicatesElement() {
    //GIVEN
    int[] arr = {1, 2, 3, 3, 4, 4, 4, 5, 5, 6, 6};
    //WHEN
    int sizeAfterRemovingDuplicates = new RemoveDuplicatesFromSortedArray().removeDuplicates(arr);
    //THEN
    MatcherAssert.assertThat(sizeAfterRemovingDuplicates, Is.is(6));
  }

  @DisplayName("GIVEN a sorted array with no duplicate elements WHEN removeDuplicates is invoked THEN it returns the size of given array")
  @Test
  public void testRemoveDuplicatesElementWithNoDuplicatesInTheArray() {
    //GIVEN
    int[] arr = {1, 2, 3, 4, 6};
    //WHEN
    int sizeAfterRemovingDuplicates = new RemoveDuplicatesFromSortedArray().removeDuplicates(arr);
    //THEN
    MatcherAssert.assertThat(sizeAfterRemovingDuplicates, Is.is(5));
  }

  @DisplayName("GIVEN aa empty array WHEN removeDuplicates is invoked THEN it returns the zero")
  @Test
  public void testRemoveDuplicatesElementEmptyArray() {
    //GIVEN
    int[] arr = {};
    //WHEN
    int sizeAfterRemovingDuplicates = new RemoveDuplicatesFromSortedArray().removeDuplicates(arr);
    //THEN
    MatcherAssert.assertThat(sizeAfterRemovingDuplicates, Is.is(0));
  }
}
package com.practice.array;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FindDuplicateInArrayTest {

  @DisplayName("GIVEN an array with duplicates WHEN containsDuplicate is invoked THEN it returns true")
  @Test
  public void testContainsDuplicate() {
    //GIVEN
    int[] arr = {1, 2, 3, 1, 2};
    //WHEN
    boolean containsDuplicate = new FindDuplicateInArray().containsDuplicate(arr);
    //THEN
    MatcherAssert.assertThat(containsDuplicate, Is.is(true));
  }

  @DisplayName("GIVEN an array with no duplicates WHEN containsDuplicate is invoked THEN it returns false")
  @Test
  public void testContainsDuplicateWithArrayWithNoDuplicates() {
    //GIVEN
    int[] arr = {1, 2, 3};
    //WHEN
    boolean containsDuplicate = new FindDuplicateInArray().containsDuplicate(arr);
    //THEN
    MatcherAssert.assertThat(containsDuplicate, Is.is(false));
  }

  @DisplayName("GIVEN an array with single element WHEN containsDuplicate is invoked THEN it returns false")
  @Test
  public void testContainsDuplicateWithArrayWithSingleElement() {
    //GIVEN
    int[] arr = {1};
    //WHEN
    boolean containsDuplicate = new FindDuplicateInArray().containsDuplicate(arr);
    //THEN
    MatcherAssert.assertThat(containsDuplicate, Is.is(false));
  }
}
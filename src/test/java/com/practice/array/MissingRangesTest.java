package com.practice.array;

import java.util.LinkedList;
import java.util.List;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MissingRangesTest {

  @DisplayName("GIVEN an array with missing numbers and all number are positive within the provided lower and upper bound WHEN findMissingRanges is invoked THEN a list of ranges is returned")
  @Test
  public void testFindMissingNumberWithNonNegativeNumbers() {
    //GIVEN
    int[] arr = {0, 1, 3, 50, 75};
    int lower = 0;
    int upper = 99;
    //WHEN
    List<String> missingRanges = new MissingRanges().findMissingRanges(arr, lower, upper);
    //THEN
    List<String> expectedResult = new LinkedList<>();
    expectedResult.add("2");
    expectedResult.add("4->49");
    expectedResult.add("51->74");
    expectedResult.add("76->99");
    MatcherAssert.assertThat(missingRanges, Is.is(expectedResult));
  }

  @DisplayName("GIVEN an array with missing numbers and some numbers are negative also within the provided lower and upper bound WHEN findMissingRanges is invoked THEN a list of ranges is returned")
  @Test
  public void testFindMissingNumberWithSomeNegativeNumbers() {
    //GIVEN
    int[] arr = {-98, -55, -10, 3, 50, 75};
    int lower = -99;
    int upper = 99;
    //WHEN
    List<String> missingRanges = new MissingRanges().findMissingRanges(arr, lower, upper);
    //THEN
    List<String> expectedResult = new LinkedList<>();
    expectedResult.add("-99");
    expectedResult.add("-97->-56");
    expectedResult.add("-54->-11");
    expectedResult.add("-9->2");
    expectedResult.add("4->49");
    expectedResult.add("51->74");
    expectedResult.add("76->99");
    MatcherAssert.assertThat(missingRanges, Is.is(expectedResult));
  }

  @DisplayName("GIVEN an array with missing numbers and some numbers are negative and provided lower and upper bound are exclusive in array values WHEN findMissingRanges is invoked THEN a list of ranges is returned")
  @Test
  public void testFindMissingNumberLowerAndUpperBoundsAreExclusiveInArraysValues() {
    //GIVEN
    int[] arr = {-98, -55, -10, 3, 50, 75};
    int lower = -99;
    int upper = 99;
    //WHEN
    List<String> missingRanges = new MissingRanges().findMissingRanges(arr, lower, upper);
    //THEN
    List<String> expectedResult = new LinkedList<>();
    expectedResult.add("-99");
    expectedResult.add("-97->-56");
    expectedResult.add("-54->-11");
    expectedResult.add("-9->2");
    expectedResult.add("4->49");
    expectedResult.add("51->74");
    expectedResult.add("76->99");
    MatcherAssert.assertThat(missingRanges, Is.is(expectedResult));
  }

  @DisplayName("GIVEN an array with missing numbers and some numbers are negative and provided lower and upper bound are inclusive in array values WHEN findMissingRanges is invoked THEN a list of ranges is returned")
  @Test
  public void testFindMissingNumberLowerAndUpperBoundsAreInclusiveInArraysValues() {
    //GIVEN
    int[] arr = {-99, -55, -10, 3, 50, 75, 99};
    int lower = -99;
    int upper = 99;
    //WHEN
    List<String> missingRanges = new MissingRanges().findMissingRanges(arr, lower, upper);
    //THEN
    List<String> expectedResult = new LinkedList<>();
    expectedResult.add("-98->-56");
    expectedResult.add("-54->-11");
    expectedResult.add("-9->2");
    expectedResult.add("4->49");
    expectedResult.add("51->74");
    expectedResult.add("76->98");
    MatcherAssert.assertThat(missingRanges, Is.is(expectedResult));
  }

  @DisplayName("GIVEN an array with missing numbers and all numbers are negative also within the provided lower and upper bound WHEN findMissingRanges is invoked THEN a list of ranges is returned")
  @Test
  public void testFindMissingNumberWithAllNegativeNumbers() {
    //GIVEN
    int[] arr = {-98, -55, -10};
    int lower = -99;
    int upper = -9;
    //WHEN
    List<String> missingRanges = new MissingRanges().findMissingRanges(arr, lower, upper);
    //THEN
    List<String> expectedResult = new LinkedList<>();
    expectedResult.add("-99");
    expectedResult.add("-97->-56");
    expectedResult.add("-54->-11");
    expectedResult.add("-9");
    MatcherAssert.assertThat(missingRanges, Is.is(expectedResult));
  }

  @DisplayName("GIVEN an array with one number within the provided lower and upper bound WHEN findMissingRanges is invoked THEN a list of ranges is returned")
  @Test
  public void testFindMissingNumberWithSingleNumber() {
    //GIVEN
    int[] arr = {-98};
    int lower = -99;
    int upper = -9;
    //WHEN
    List<String> missingRanges = new MissingRanges().findMissingRanges(arr, lower, upper);
    //THEN
    List<String> expectedResult = new LinkedList<>();
    expectedResult.add("-99");
    expectedResult.add("-97->-9");
    MatcherAssert.assertThat(missingRanges, Is.is(expectedResult));
  }

  @DisplayName("GIVEN an empty array and lower & upper bound WHEN findMissingRanges is invoked THEN a list of ranges is returned")
  @Test
  public void testFindMissingNumberWithEmptyArray() {
    //GIVEN
    int[] arr = {};
    int lower = -99;
    int upper = -9;
    //WHEN
    List<String> missingRanges = new MissingRanges().findMissingRanges(arr, lower, upper);
    //THEN
    List<String> expectedResult = new LinkedList<>();
    expectedResult.add("-99->-9");
    MatcherAssert.assertThat(missingRanges, Is.is(expectedResult));
  }
}
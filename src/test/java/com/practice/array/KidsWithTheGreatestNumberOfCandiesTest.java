package com.practice.array;

import static org.hamcrest.core.Is.is;

import java.util.LinkedList;
import java.util.List;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class KidsWithTheGreatestNumberOfCandiesTest {

  @DisplayName("GIVEN a students array with their candles quantities and extraCandleNumber WHEN kidsWithCandles is invoked THEN a list with boolean values is returned")
  @Test
  public void testFindKidsWithGreatestNumberOfCandies() {
    //GIVEN
    int[] kidsWithCandles = {4, 2, 1, 1, 2};
    int extraCandles = 1;

    //WHEN
    List<Boolean> list = KidsWithTheGreatestNumberOfCandies
        .kidsWithCandles(kidsWithCandles, extraCandles);

    //THEN
    List<Boolean> expectedList = new LinkedList<>();
    expectedList.add(true);
    expectedList.add(false);
    expectedList.add(false);
    expectedList.add(false);
    expectedList.add(false);
    MatcherAssert.assertThat(list, is(expectedList));
  }

  @DisplayName("GIVEN a students array with no values and extraCandles WHEN kidsWithCandles is invoked THEN an empty list is returned.")
  @Test
  public void testFindKidsWithGreatestNumberOfCandiesWithEmptyArray() {
    //GIVEN
    int[] kidsWithCandles = {};
    int extraCandles = 1;

    //WHEN
    List<Boolean> list = KidsWithTheGreatestNumberOfCandies
        .kidsWithCandles(kidsWithCandles, extraCandles);

    //THEN
    List<Boolean> expectedList = new LinkedList<>();
    MatcherAssert.assertThat(list, is(expectedList));
  }

  @DisplayName("GIVEN a students array with their candles quantities and 0 extraCandleNumber WHEN kidsWithCandles is invoked THEN a list with boolean values is returned")
  @Test
  public void testFindKidsWithGreatestNumberOfCandiesWith0ExtraCandles() {
    //GIVEN
    int[] kidsWithCandles = {12, 1, 12};
    int extraCandles = 0;

    //WHEN
    List<Boolean> list = KidsWithTheGreatestNumberOfCandies
        .kidsWithCandles(kidsWithCandles, extraCandles);

    //THEN
    List<Boolean> expectedList = new LinkedList<>();
    expectedList.add(true);
    expectedList.add(false);
    expectedList.add(true);
    MatcherAssert.assertThat(list, is(expectedList));
  }
}
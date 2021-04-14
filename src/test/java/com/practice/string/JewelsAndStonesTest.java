package com.practice.string;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JewelsAndStonesTest {

  @DisplayName("GIVEN the jewels and stones strings WHEN numJewelsInStones is invoked THEN it returns the count of the common stones in both")
  @Test
  public void testCountTheJewelsInStone() {
    //GIVEN
    String jewels = "aA";
    String stones = "aAAbbbb";

    //WHEN
    int count = JewelsAndStones.numJewelsInStones(jewels, stones);

    //THEN
    MatcherAssert.assertThat(count, Is.is(3));
  }

  @DisplayName("GIVEN the jewels and stones strings and there is no common stone WHEN numJewelsInStones is invoked THEN 0 is returned")
  @Test
  public void testCountTheJewelsInStoneWhenNoCommonStoneIsThere() {
    //GIVEN
    String jewels = "xY";
    String stones = "aAAbbbb";

    //WHEN
    int count = JewelsAndStones.numJewelsInStones(jewels, stones);

    //THEN
    MatcherAssert.assertThat(count, Is.is(0));
  }

  @DisplayName("GIVEN the jewels string is empty and stones string is not WHEN numJewelsInStones is invoked THEN 0 is returned")
  @Test
  public void testCountTheJewelsInStoneWhenJewelStringIsEmpty() {
    //GIVEN
    String jewels = "";
    String stones = "aAAbbbb";

    //WHEN
    int count = JewelsAndStones.numJewelsInStones(jewels, stones);

    //THEN
    MatcherAssert.assertThat(count, Is.is(0));
  }

  @DisplayName("GIVEN the jewels string is not empty and stones string is empty WHEN numJewelsInStones is invoked THEN 0 is returned")
  @Test
  public void testCountTheJewelsInStoneWhenStoneStringIsEmpty() {
    //GIVEN
    String jewels = "aA";
    String stones = "";

    //WHEN
    int count = JewelsAndStones.numJewelsInStones(jewels, stones);

    //THEN
    MatcherAssert.assertThat(count, Is.is(0));
  }

  @DisplayName("GIVEN the jewels and stones strings are empty WHEN numJewelsInStones is invoked THEN 0 is returned")
  @Test
  public void testCountTheJewelsInStoneWhenBothStringsAreEmpty() {
    //GIVEN
    String jewels = "";
    String stones = "";

    //WHEN
    int count = JewelsAndStones.numJewelsInStones(jewels, stones);

    //THEN
    MatcherAssert.assertThat(count, Is.is(0));
  }
}
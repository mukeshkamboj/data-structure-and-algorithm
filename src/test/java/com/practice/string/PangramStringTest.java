package com.practice.string;

import static org.hamcrest.core.Is.is;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PangramStringTest {

  @DisplayName("GIVEN a string with all english alphabet WHEN isPangram is invoked THEN it returns true")
  @Test
  public void testStringIsPangram() {
    //GIVEN
    String sentence = "qwertyuioppoiuytrewqasdfghjkllkjhgfdsazxcvbnmmnbvcxz";
    //WHEN
    boolean isPangram = PangramString.isPangram(sentence);
    //THEN
    MatcherAssert.assertThat(isPangram, is(true));
  }

  @DisplayName("GIVEN a string with not all english alphabet WHEN isPangram is invoked THEN it returns false")
  @Test
  public void testStringIsPangramWithNotAllEnglishAlphabets() {
    //GIVEN
    String sentence = "mnbvcxzzxcvbnmlkjhgfdsaasdfghjklpoiuytrewwertyuiop";
    //WHEN
    boolean isPangram = PangramString.isPangram(sentence);
    //THEN
    MatcherAssert.assertThat(isPangram, is(false));
  }

  @DisplayName("GIVEN an empty string WHEN isPangram is invoked THEN it returns false")
  @Test
  public void testStringIsPangramWithEmptyString() {
    //GIVEN
    String sentence = "";
    //WHEN
    boolean isPangram = PangramString.isPangram(sentence);
    //THEN
    MatcherAssert.assertThat(isPangram, is(false));
  }
}
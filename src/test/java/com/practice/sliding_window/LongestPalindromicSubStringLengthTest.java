package com.practice.sliding_window;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LongestPalindromicSubStringLengthTest {

  @DisplayName("GIVEN a string which has multiple palindrome sub strings WHEN longestPalindrome is invoked THEN longest sub string is returned")
  @Test
  public void testFindLongestPalindromeSubString() {
    //GIVEN
    String string = "abaqweewqqwertrewqlkjhgfdsasdfghjkl";
    //WHEN
    String longestSubString = LongestPalindromicSubStringLength.longestPalindrome(string);
    //THEN
    MatcherAssert.assertThat(longestSubString, Is.is("lkjhgfdsasdfghjkl"));
  }

  @DisplayName("GIVEN a string which is a palindrome string and no sub string is palindrome WHEN longestPalindrome is invoked THEN string itself is returned")
  @Test
  public void testFindLongestPalindromeWhenStringIsItselfPalindrome() {
    //GIVEN
    String string = "qwertyuioppoiuytrewq";
    //WHEN
    String longestSubString = LongestPalindromicSubStringLength.longestPalindrome(string);
    //THEN
    MatcherAssert.assertThat(longestSubString, Is.is("qwertyuioppoiuytrewq"));
  }

  @DisplayName("GIVEN a string which has no palindrome sub string WHEN longestPalindrome is invoked THEN empty string is returned")
  @Test
  public void testFindLongestPalindromeWhenStringHasNoPalindromeSubString() {
    //GIVEN
    String string = "qwertyuiopasdfghjkl";
    //WHEN
    String longestSubString = LongestPalindromicSubStringLength.longestPalindrome(string);
    //THEN
    MatcherAssert.assertThat(longestSubString, Is.is(""));
  }

  @DisplayName("GIVEN a string which has only one unique character WHEN longestPalindrome is invoked THEN string itself is returned")
  @Test
  public void testFindPalindromeSubStringGivenStringHasOnlyOneUniqueCharacter() {
    //GIVEN
    String string = "aaaaaaaaaaaaaaaaaaaaaaaaaaa";
    //WHEN
    String longestSubString = LongestPalindromicSubStringLength.longestPalindrome(string);
    //THEN
    MatcherAssert.assertThat(longestSubString, Is.is("aaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }

  @DisplayName("GIVEN an empty string WHEN longestPalindrome is invoked THEN string itself is returned")
  @Test
  public void testFIndPalindromeWithEmptyString() {
    //GIVEN
    String string = "";
    //WHEN
    String longestSubString = LongestPalindromicSubStringLength.longestPalindrome(string);
    //THEN
    MatcherAssert.assertThat(longestSubString, Is.is(""));
  }

  @DisplayName("GIVEN a string with only 1 char long WHEN longestPalindrome is invoked THEN string itself is returned")
  @Test
  public void testFindPalindromeGivenStringIsOneCharLong() {
    //GIVEN
    String string = "q";
    //WHEN
    String longestSubString = LongestPalindromicSubStringLength.longestPalindrome(string);
    //THEN
    MatcherAssert.assertThat(longestSubString, Is.is("q"));
  }
}
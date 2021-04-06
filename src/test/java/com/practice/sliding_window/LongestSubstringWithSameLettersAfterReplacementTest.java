package com.practice.sliding_window;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class LongestSubstringWithSameLettersAfterReplacementTest {

  @Test
  public void test1() {
    int longestSubString = LongestSubstringWithSameLettersAfterReplacement.find(2, "aabccbb");
    assertThat(5, is(longestSubString));
  }

  @Test
  public void test2() {
    int longestSubString = LongestSubstringWithSameLettersAfterReplacement.find(1, "abbcb");
    assertThat(4, is(longestSubString));
  }

  @Test
  public void test3() {
    int longestSubString = LongestSubstringWithSameLettersAfterReplacement.find(1, "abccde");
    assertThat(3, is(longestSubString));
  }
}
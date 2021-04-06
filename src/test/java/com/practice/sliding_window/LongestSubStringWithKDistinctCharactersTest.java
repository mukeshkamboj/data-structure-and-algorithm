package com.practice.sliding_window;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class LongestSubStringWithKDistinctCharactersTest {

  @Test
  public void test_1() {
    int length = LongestSubStringWithKDistinctCharacters.find(2, "araaci");
    assertThat(4, is(length));
  }

  @Test
  public void test_2() {
    int length = LongestSubStringWithKDistinctCharacters.find(1, "araaci");
    assertThat(2, is(length));
  }

  @Test
  public void test_3() {
    int length = LongestSubStringWithKDistinctCharacters.find(3, "cbbebi");
    assertThat(5, is(length));
  }
}
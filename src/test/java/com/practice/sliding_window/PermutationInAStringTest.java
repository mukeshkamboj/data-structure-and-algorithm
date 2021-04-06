package com.practice.sliding_window;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

public class PermutationInAStringTest {

  @Test
  public void test_1() {
    boolean foundPermutation = PermutationInAString.find("oidbcaf", "abc");
    assertThat(foundPermutation, is(true));
  }

  @Test
  public void test_2() {
    boolean foundPermutation = PermutationInAString.find("odicf", "dc");
    assertThat(foundPermutation, is(false));
  }

  @Test
  public void test_3() {
    boolean foundPermutation = PermutationInAString.find("bcdxabcdy", "bcdyabcdx");
    assertThat(foundPermutation, is(true));
  }

  @Test
  public void test_4() {
    boolean foundPermutation = PermutationInAString.find("aaacb", "aabca");
    assertThat(foundPermutation, is(true));
  }

  @Test
  public void test_5() {
    boolean foundPermutation = PermutationInAString.find("ppqp", "pq");
    assertThat(foundPermutation, is(true));
  }
}
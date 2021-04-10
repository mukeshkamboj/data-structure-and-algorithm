package com.practice.dynamic_programming;

import static org.hamcrest.core.Is.is;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BalancedBracketTest {

  @DisplayName("GIVEN a balanced bracket's string WHEN isBalanced method is invoked THEN it returns true")
  @Test
  public void testBalancedString() {
    //GIVEN
    String bracketString = "{[(())]()}";

    //WHEN
    boolean balanced = BalancedBracket.isBalanced(bracketString);

    //THEN
    MatcherAssert.assertThat(balanced, is(true));
  }

  @DisplayName("GIVEN a un balanced bracket's string WHEN isBalanced method is invoked THEN it returns false")
  @Test
  public void testUnBalancedString() {
    //GIVEN
    String bracketString = "{[(()])()}";

    //WHEN
    boolean balanced = BalancedBracket.isBalanced(bracketString);

    //THEN
    MatcherAssert.assertThat(balanced, is(false));
  }

  @DisplayName("GIVEN a empty string WHEN isBalanced method is invoked THEN it returns true")
  @Test
  public void testEmptyString() {
    //GIVEN
    String bracketString = "";

    //WHEN
    boolean balanced = BalancedBracket.isBalanced(bracketString);

    //THEN
    MatcherAssert.assertThat(balanced, is(true));
  }
}
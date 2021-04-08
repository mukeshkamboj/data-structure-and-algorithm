package com.practice.dynamic_programming;

import static org.hamcrest.core.Is.is;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FindMaxDepthOfNestedParenthesesTest {

  @DisplayName("GIVEN a valid string with parentheses WHEN findDepthFunction is invoked THEN it returns the depth of the parentheses")
  @Test
  public void testValidParenthesesStringDepth() {
    //GIVEN
    String str = "( ((X)) (((Y))) () )";

    //WHEN
    int depth = FindMaxDepthOfNestedParentheses.findDepth(str);

    //THEN
    MatcherAssert.assertThat(depth, is(4));
  }

  @DisplayName("GIVEN a string with imbalanced parentheses WHEN findDepthFunction is invoked THEN it returns the depth of the parentheses")
  @Test
  public void testInValidParenthesesStringDepth() {
    //GIVEN
    String str = "( ((X)) (((Y))) () ))))";

    //WHEN
    int depth = FindMaxDepthOfNestedParentheses.findDepth(str);

    //THEN
    MatcherAssert.assertThat(depth, is(-1));
  }

  @DisplayName("GIVEN an empty string  WHEN findDepthFunction is invoked THEN it returns the depth of the parentheses")
  @Test
  public void testEmptyStringDepth() {
    //GIVEN
    String str = "";

    //WHEN
    int depth = FindMaxDepthOfNestedParentheses.findDepth(str);

    //THEN
    MatcherAssert.assertThat(depth, is(0));
  }
}
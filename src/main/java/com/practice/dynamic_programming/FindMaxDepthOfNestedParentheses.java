package com.practice.dynamic_programming;

public class FindMaxDepthOfNestedParentheses {

  public static int findDepth(String expression) {
    int result = 0;
    int temp = 0;
    for (int i = 0; i < expression.length(); i++) {
      char c = expression.charAt(i);
      if (c == '(') {
        temp++;
        if (temp > result) {
          result = temp;
        }
      } else if (c == ')') {
        if (temp > 0) {
          temp--;
        } else {
          return -1;
        }
      }
    }
    if (temp != 0) {
      return -1;
    }
    return result;
  }
}
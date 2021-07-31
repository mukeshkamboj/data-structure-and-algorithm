package com.practice.stack;

import java.util.Stack;

//https://leetcode.com/problems/ternary-expression-parser/
public class TernaryExpressionParser {

  public String parseTernaryExpression(String expression) {
    Stack<Character> stack = new Stack<>();
    for (int i = expression.length() - 1; i >= 0; i--) {
      char ch = expression.charAt(i);
      if (!stack.isEmpty() && stack.peek() == '?') {
        stack.pop();// remove ?
        char first = stack.pop();
        stack.pop(); // remove :
        char second = stack.pop();
        if (ch == 'T') {
          stack.push(first);
        } else {
          stack.push(second);
        }
      } else {
        stack.push(ch);
      }
    }
    return String.valueOf(stack.pop());
  }
}

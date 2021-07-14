package com.practice.stack;

import java.util.Stack;

//https://leetcode.com/problems/valid-parentheses/
public class ValidParentheses {

  public boolean validBrackets(String str) {
    Stack<Character> stack = new Stack<>();
    int i = 0;
    while (i < str.length()) {
      char ch = str.charAt(i);
      switch (ch) {
        case '(', '{', '[' -> stack.push(ch);
        default -> {
          if (stack.isEmpty()) {
            return false;
          }
          if ((ch == ')' && stack.peek() == '(') || (ch == '}' && stack.peek() == '{') || (ch == ']'
              && stack.peek() == '[')) {
            stack.pop();
          } else {
            return false;
          }
        }
      }
      i++;
    }

    return stack.isEmpty();
  }
}

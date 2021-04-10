package com.practice.dynamic_programming;

import java.util.Stack;

public class BalancedBracket {

  public static boolean isBalanced(String string) {
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < string.length(); i++) {
      char ch = string.charAt(i);
      switch (ch) {
        case '{', '(', '[' -> stack.add(ch);
        case '}', ')', ']' -> {
          if (stack.size() == 0) {
            return false;
          }
          char lastBracket = stack.peek();
          if (ch == '}' && lastBracket != '{' || ch == ')' && lastBracket != '('
              || ch == ']' && lastBracket != '[') {
            return false;
          }
          stack.pop();
        }
      }
    }
    return stack.size() == 0;
  }
}

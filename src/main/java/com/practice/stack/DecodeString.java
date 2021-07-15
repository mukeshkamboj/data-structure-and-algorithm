package com.practice.stack;

import java.util.Stack;

//https://leetcode.com/problems/decode-string/
public class DecodeString {

  public String decodeString(String str) {
    Stack<String> stack = new Stack<>();
    int i = 0;
    while (i < str.length()) {
      char ch = str.charAt(i);
      switch (ch) {
        case '[':
          i++;
          break;
        case ']':
          i++;
          StringBuilder string = new StringBuilder();
          while (!stack.isEmpty() && Character.isAlphabetic(stack.peek().charAt(0))) {
            StringBuilder temp = new StringBuilder(stack.pop());
            temp.append(string);
            string = temp;
          }

          int re = 0;

          if (!stack.isEmpty()) {
            re = Integer.parseInt(stack.pop());
          }
          stack.push(String.valueOf(string).repeat(Math.max(0, re)));
          break;
        default:
          if (Character.isDigit(ch)) {
            StringBuilder sb = new StringBuilder();
            while (i < str.length() && Character.isDigit(str.charAt(i))) {
              sb.append(str.charAt(i++));
            }
            stack.push(sb.toString());
          } else {
            StringBuilder sb = new StringBuilder();
            while (i < str.length() && Character.isAlphabetic(str.charAt(i))) {
              sb.append(str.charAt(i++));
            }
            stack.push(sb.toString());
          }
      }
    }
    StringBuilder res = new StringBuilder();
    while (!stack.isEmpty()) {
      StringBuilder temp = new StringBuilder(stack.pop());
      temp.append(res);
      res = temp;
    }
    return res.toString();
  }
}

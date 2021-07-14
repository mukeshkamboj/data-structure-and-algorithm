package com.practice.recursion.string;

import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/generate-parentheses/
public class GenerateParentheses {

  private List<String> parenthesis = new LinkedList<>();

  public List<String> generateParenthesis(int n) {
    generate("", 0, 0, n);
    return parenthesis;
  }

  private void generate(String str, int open, int close, int max) {
    if (str.length() == 2 * max) {
      parenthesis.add(str);
      return;
    }
    if (open < max) {
      generate(str + "(", open + 1, close, max);
    }
    if (close < open) {
      generate(str + ")", open, close + 1, max);
    }
  }
}

package com.practice.string;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/different-ways-to-add-parentheses/
public class DifferentWaysToAddParentheses {

  Map<String, List<Integer>> map = new HashMap<>();

  public List<Integer> diffWaysToCompute(String expression) {
    List<Integer> result = new LinkedList<>();

    if (map.containsKey(expression)) {
      return map.get(expression);
    }

    if (doNotContainsOperator(expression)) {
      result.add(Integer.parseInt(expression));
      return result;
    }

    for (int i = 0; i < expression.length(); i++) {
      char ch = expression.charAt(i);
      if (ch == '-' || ch == '+' || ch == '*') {
        String substring1 = expression.substring(0, i);
        String substring2 = expression.substring(i + 1);
        List<Integer> list1 = diffWaysToCompute(substring1);
        List<Integer> list2 = diffWaysToCompute(substring2);
        for (int j : list1) {
          for (int k : list2) {
            switch (ch) {
              case '-' -> result.add(j - k);
              case '+' -> result.add(j + k);
              case '*' -> result.add(j * k);
            }
          }
        }
      }
    }
    map.put(expression, result);
    return result;
  }

  private boolean doNotContainsOperator(String expression) {
    for (char ch : expression.toCharArray()) {
      if (ch == '-' || ch == '+' || ch == '*') {
        return false;
      }
    }
    return true;
  }
}

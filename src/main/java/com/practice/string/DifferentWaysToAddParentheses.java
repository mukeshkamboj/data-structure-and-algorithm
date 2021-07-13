package com.practice.string;

import java.util.LinkedList;
import java.util.List;

public class DifferentWaysToAddParentheses {

  public List<Integer> diffWaysToCompute(String expression) {
    List<Integer> result = new LinkedList<>();

    if (expression.length() == 1) {
      result.add(Integer.parseInt(expression));
      return result;
    }

    for (int i = 0; i < expression.length(); i++) {
      char ch = expression.charAt(i);
      if (ch == '-' || ch == '+' || ch == '*') {
        List<Integer> list1 = diffWaysToCompute(expression.substring(0, i));
        List<Integer> list2 = diffWaysToCompute(expression.substring(i + 1));
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
    return result;
  }
}

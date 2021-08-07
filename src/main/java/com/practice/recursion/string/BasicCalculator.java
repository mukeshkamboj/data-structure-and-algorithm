package com.practice.recursion.string;

public class BasicCalculator {

  int i = 0;

  public int eval(String expression) {
    int val = 0;
    int lastSign = 1;
    while (i < expression.length()) {
      char ch = expression.charAt(i);
      switch (ch) {
        case '(':
          i++;
          val += lastSign * eval(expression);
          lastSign = 1;
          break;
        case ')':
          return val;
        case '+':
          lastSign = 1;
          break;
        case '-':
          lastSign = -1;
          break;
        case ' ':
          break;
        default:
          StringBuilder num = new StringBuilder();
          while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
            num.append(expression.charAt(i));
            i++;
          }
          val += lastSign * Integer.parseInt(num.toString());
          lastSign = 1;
          i--;
      }
      i++;
    }
    return val;
  }
}

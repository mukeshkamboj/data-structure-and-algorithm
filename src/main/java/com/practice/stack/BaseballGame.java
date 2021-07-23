package com.practice.stack;

import java.util.Stack;

//https://leetcode.com/problems/baseball-game/
public class BaseballGame {

  public int calPoint(String[] ops) {
    Stack<Integer> stack = new Stack<>();
    for (String op : ops) {
      switch (op) {
        case "D" -> {
          int val = stack.peek();
          stack.push((val * 2));
        }
        case "+" -> {
          int val1 = stack.pop();
          int val2 = stack.pop();
          stack.push(val2);
          stack.push(val1);
          stack.push(val1 + val2);
        }
        case "C" -> stack.pop();
        default -> stack.push(Integer.parseInt(op));
      }
    }
    int sum = 0;
    while (!stack.isEmpty()) {
      sum += stack.pop();
    }
    return sum;
  }
}

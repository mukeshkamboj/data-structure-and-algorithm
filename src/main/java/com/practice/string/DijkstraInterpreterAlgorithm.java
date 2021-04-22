package com.practice.string;

import java.util.Stack;

public class DijkstraInterpreterAlgorithm {

  private final Stack<Double> values = new Stack<>();
  private final Stack<String> operation = new Stack<>();

  public Double interpret(String expression) {
    String[] expressions_values = expression.split(" ");
    for (int i = 0; i < expressions_values.length; i++) {
      String char_under_question = expressions_values[i];
      switch (char_under_question) {
        case " ", "(":
          continue;
        case ")":
          double value_2 = values.pop();
          double value_1 = values.pop();
          String last_operator = operation.pop();
          if (last_operator.equalsIgnoreCase("+")) {
            values.push(value_1 + value_2);
          }
          if (last_operator.equalsIgnoreCase("*")) {
            values.push(value_1 * value_2);
          }
          if (last_operator.equalsIgnoreCase("-")) {
            values.push(value_1 - value_2);
          }
          if (last_operator.equalsIgnoreCase("/")) {
            values.push(value_1 / value_2);
          }
          break;
        case "+", "-", "*", "/":
          operation.push(char_under_question);
          break;
        default:
          values.push(Double.parseDouble(char_under_question + ""));
      }
    }
    return values.pop();
  }

}

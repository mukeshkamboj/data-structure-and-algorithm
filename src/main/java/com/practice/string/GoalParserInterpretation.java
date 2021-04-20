package com.practice.string;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/goal-parser-interpretation/
public class GoalParserInterpretation {

  public String interpret(String command) {
    Map<String, String> map = new HashMap<>();
    map.put("G", "G");
    map.put("()", "o");
    map.put("(al)", "al");
    StringBuilder sb = new StringBuilder();
    StringBuffer temp = new StringBuffer();
    for (int i = 0; i < command.length(); i++) {
      temp.append(command.charAt(i));
      if (map.containsKey(temp.toString())) {
        sb.append(map.get(temp.toString()));
        temp = new StringBuffer();
      }
    }
    return sb.toString();
  }
}

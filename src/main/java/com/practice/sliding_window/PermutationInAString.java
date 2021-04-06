package com.practice.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class PermutationInAString {

  public static boolean find(String str, String pattern) {
    Map<Character, Integer> patternMap = new HashMap<>();
    for (int i = 0; i < pattern.length(); i++) {
      char ch = pattern.charAt(i);
      patternMap.put(ch, patternMap.getOrDefault(ch, 0) + 1);
    }

    int windowStart = 0, windowEnd = 0, matched = 0;

    for (; windowEnd < str.length(); windowEnd++) {
      char rightChar = str.charAt(windowEnd);
      if (patternMap.containsKey(rightChar)) {
        patternMap.put(rightChar, patternMap.get(rightChar) - 1);
        Integer count = patternMap.get(rightChar);
        if (count == 0) {
          matched++;
        }
      }

      if (matched == patternMap.size()) {
        return true;
      }

      if (windowEnd >= pattern.length() - 1) {
        char leftChar = str.charAt(windowStart++);
        if (patternMap.containsKey(leftChar)) {
          Integer count = patternMap.get(leftChar);
          if (count == 0) {
            matched--;
          }
          patternMap.put(leftChar, count + 1);
        }
      }
    }

    return false;
  }

}

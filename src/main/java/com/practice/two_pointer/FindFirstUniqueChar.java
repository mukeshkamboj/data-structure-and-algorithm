package com.practice.two_pointer;

import java.util.HashMap;
import java.util.Map;

public class FindFirstUniqueChar {

  public int firstUniqueChar(String s) {
    if (s.equals("")) {
      return -1;
    }
    Map<Character, Integer> map = new HashMap<>();
    int start = 0;
    int end = 0;
    while (end < s.length()) {
      char ch = s.charAt(end);
      map.put(ch, map.getOrDefault(ch, 0) + 1);
      while (map.get(s.charAt(start)) != 1 && start < end) {
        start++;
      }
      end++;
    }
    return map.getOrDefault(s.charAt(start), -1) == 1 ? start : -1;
  }
}

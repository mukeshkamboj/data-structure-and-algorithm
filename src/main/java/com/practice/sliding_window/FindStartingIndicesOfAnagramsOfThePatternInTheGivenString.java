package com.practice.sliding_window;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FindStartingIndicesOfAnagramsOfThePatternInTheGivenString {

  public static List<Integer> findAnagrams(String str, String pattern) {
    Map<Character, Integer> map = new HashMap<>();
    List<Integer> list = new LinkedList<>();
    for (int i = 0; i < pattern.length(); i++) {
      char ch = pattern.charAt(i);
      map.put(ch, map.getOrDefault(ch, 0) + 1);
    }

    int windowStart = 0, matched = 0;
    for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {

      char rightChar = str.charAt(windowEnd);
      if (map.containsKey(rightChar)) {
        map.put(rightChar, map.get(rightChar) - 1);
        if (map.get(rightChar) == 0) {
          matched++;
        }
      }

      if (matched == map.size()) {
        list.add(windowStart);
      }

      if (windowEnd >= pattern.length() - 1) {

        char leftChar = str.charAt(windowStart++);

        if (map.containsKey(leftChar)) {
          if (map.get(leftChar) == 0) {
            matched--;
          }
          map.put(leftChar, map.get(leftChar) + 1);
        }

      }

    }
    return list;
  }

}

package com.practice.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithKDistinctCharacters {

  public static int find(int distinctChars, String str) {
    Map<Character, Integer> map = new HashMap<>();
    int longestSubStringLength = 0;
    int windowStart = 0;
    int windowEnd = 0;

    while (windowEnd < str.length()) {

      Character ch = str.charAt(windowEnd);
      map.put(ch, map.getOrDefault(ch, 0) + 1);

      while (map.size() > distinctChars) {
        int newLength = windowEnd - windowStart;
        longestSubStringLength = Math.max(longestSubStringLength, newLength);
        Character charToBeRemoved = str.charAt(windowStart);
        Integer countToBeReduced = map.get(charToBeRemoved);
        if (countToBeReduced == 1) {
          map.remove(charToBeRemoved);
        } else {
          map.put(charToBeRemoved, map.get(charToBeRemoved) - 1);
        }
        windowStart++;
      }

      windowEnd++;
    }

    return longestSubStringLength;
  }

}

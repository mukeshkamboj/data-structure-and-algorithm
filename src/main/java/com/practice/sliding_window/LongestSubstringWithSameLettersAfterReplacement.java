package com.practice.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithSameLettersAfterReplacement {

  public static int find(int allowedReplacements, String str) {
    int longestSubstring = 0;
    int windowStart = 0;
    int maxFrequencyOfChar = 0;
    Map<Character, Integer> frequencyMap = new HashMap<>();

    for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
      char ch = str.charAt(windowEnd);
      frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
      maxFrequencyOfChar = Math.max(maxFrequencyOfChar, frequencyMap.get(ch));

      if (windowEnd - windowStart + 1 - maxFrequencyOfChar > allowedReplacements) {
        ch = str.charAt(windowStart);
        frequencyMap.put(ch, frequencyMap.get(ch) - 1);
        maxFrequencyOfChar = Math.max(maxFrequencyOfChar, frequencyMap.get(ch));
        windowStart++;
      }

      longestSubstring = Math.max(longestSubstring, windowEnd - windowStart + 1);
    }

    return longestSubstring;
  }

}

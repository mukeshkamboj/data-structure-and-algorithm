package com.practice.sliding_window;

// https://leetcode.com/problems/longest-substring-with-at-most-k-distinct-characters/
public class LongestSubStringWithKDistinctCharacters {

  public int find(int distinctChars, String str) {

    int left = 0;
    int right = 0;
    int max = 0;
    int[] chMap = new int[26];
    var len = str.length();
    int u = 0;
    for (; right < len; right++) {
      char chR = str.charAt(right);
      if (chMap[chR - 'a'] == 0) {
        u++;
      }
      chMap[chR - 'a']++;
      while (u > distinctChars) {
        char chL = str.charAt(left);
        chMap[chL - 'a']--;
        if (chMap[chL - 'a'] == 0) {
          u--;
        }
        left++;
      }
      max = Math.max(max, right - left + 1);
    }
    return max;
  }

}

/*
{
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
 */
package com.practice.sliding_window;

// https://leetcode.com/problems/longest-repeating-character-replacement/
public class LongestSubstringWithSameLettersAfterReplacement {

  public int find(String str, int allowedReplacements) {
    int[] chMap = new int[26];
    int left = 0;
    int right = 0;
    int max = 1;
    int maxF = 0;
    int len = str.length();
    for (; right < len; right++) {
      char chR = str.charAt(right);
      chMap[chR - 'A']++;
      maxF = Math.max(maxF, chMap[chR - 'A']);
      while (right - left + 1 - maxF > allowedReplacements) {
        char chL = str.charAt(left);
        chMap[chL - 'A']--;
        left++;
      }
      maxF = max(chMap);
      max = Math.max(right - left + 1, max);
    }
    return max;
  }

  static int max(int[] chMap) {
    int max = chMap[0];
    for (int i = 1; i < chMap.length; i++) {
      if (max < chMap[i]) {
        max = chMap[i];
      }
    }
    return max;
  }
}

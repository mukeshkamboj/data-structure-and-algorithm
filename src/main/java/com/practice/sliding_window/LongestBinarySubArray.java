package com.practice.sliding_window;

public class LongestBinarySubArray {

  public int find(int maxReplacementAllowed, int[] array) {
    int longestSubArray = 0;
    int windowStart = 0;
    int windowEnd = 0;
    int numberOfZeros = 0;
    while (windowEnd < array.length) {
      if (array[windowEnd] == 0) {
        numberOfZeros++;
      }

      if (numberOfZeros <= maxReplacementAllowed) {
        longestSubArray = Math.max(longestSubArray, windowEnd - windowStart + 1);
      }

      while (numberOfZeros > maxReplacementAllowed) {
        if (array[windowStart] == 0) {
          numberOfZeros--;
        }
        windowStart++;
      }
      windowEnd++;
    }
    return longestSubArray;
  }
}

package com.practice.slow_fast_pointers;

// https://leetcode.com/problems/max-consecutive-ones-iii/
public class MaxConsecutiveOnesReplacing2Zeroes {

  public int longestOnes(int[] arr, int k) {
    int start = 0;
    int end = 0;
    int zeroCount = 0;
    int max = 0;
    while (end < arr.length) {
      if (arr[end] == 0) {
        zeroCount++;
      }

      while (zeroCount > k) {
        if (arr[start] == 0) {
          zeroCount--;
        }
        start++;
      }

      max = Math.max(max, end - start + 1);
      end++;
    }
    return max;
  }
}

package com.practice.array;

import java.util.Arrays;

// https://leetcode.com/problems/longest-consecutive-sequence/submissions/
public class LongestConsecutiveSequence {

  public int findMaxConsecutiveSubArrayLength(int[] arr) {
    if (arr == null || arr.length == 0) {
      return 0;
    }
    Arrays.sort(arr);
    int max = 1;
    int previousValue = arr[0];
    int endingMax = 1;
    for (int i = 1; i < arr.length; i++) {
      if (previousValue - arr[i] == 0) {
        continue;
      }

      if (Math.abs(previousValue - arr[i]) == 1) {
        endingMax++;
      } else {
        endingMax = 1;
      }
      previousValue = arr[i];
      max = Math.max(max, endingMax);
    }
    return max;
  }
}

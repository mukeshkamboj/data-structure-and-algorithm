package com.practice.sliding_window;

import static java.lang.Integer.MIN_VALUE;

public class MaxSumOfContiguousSubArray {

  public static int findMaxSum(int subArraySize, int[] array) {
    int maxSum = MIN_VALUE;
    int windowSum = 0;
    int windowStart = 0;
    for (int windowEnd = 0; windowEnd < array.length; windowEnd++) {
      windowSum += array[windowEnd];
      if (windowEnd >= subArraySize - 1) {
        maxSum = Math.max(maxSum, windowSum);
        windowSum -= array[windowStart];
        windowStart++;
      }
    }
    return maxSum;
  }
}

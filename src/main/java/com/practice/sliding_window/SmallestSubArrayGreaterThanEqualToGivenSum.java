package com.practice.sliding_window;

import static java.lang.Integer.MAX_VALUE;

public class SmallestSubArrayGreaterThanEqualToGivenSum {

  public static int findSmallestSubArrayLength(int givenSum, int[] array) {
    int smallestSubArrayLength = MAX_VALUE;
    int windowSum = 0;
    int windowStart = 0;
    int windowEnd = 0;

    while (windowEnd < array.length) {
      windowSum += array[windowEnd];
      while (windowSum >= givenSum) {
        int newLength = windowEnd - windowStart + 1;
        smallestSubArrayLength = Math.min(smallestSubArrayLength, newLength);
        windowSum -= array[windowStart++];
      }
      windowEnd++;
    }
    return smallestSubArrayLength == MAX_VALUE ? 0 : smallestSubArrayLength;
  }
}

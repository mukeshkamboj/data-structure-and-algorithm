package com.practice.sliding_window;

//https://leetcode.com/problems/minimum-size-subarray-sum/
public class SmallestSubArrayGreaterThanEqualToGivenSum {

  public int minSubArrayLen(int givenSum, int[] array) {
    int minLength = Integer.MAX_VALUE;
    int start = 0;
    int end = 0;
    int tempSum = 0;
    while (end < array.length) {
      tempSum += array[end];
      while (tempSum >= givenSum) {
        minLength = Math.min(minLength, end - start + 1);
        tempSum -= array[start++];
      }
      end++;
    }
    return minLength == Integer.MAX_VALUE ? 0 : minLength;
  }
}

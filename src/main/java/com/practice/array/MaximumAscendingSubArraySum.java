package com.practice.array;

import static java.lang.Integer.MIN_VALUE;

//https://leetcode.com/problems/maximum-ascending-subarray-sum/
public class MaximumAscendingSubArraySum {

  public int maxAscendingSum(int[] arr) {
    int maxSum = MIN_VALUE;
    int tempSum = 0;
    int previousValue = 0;
    for (int currentValue : arr) {
      if (previousValue < currentValue) {
        tempSum += currentValue;
      } else {
        tempSum = currentValue;
      }
      previousValue = currentValue;
      maxSum = Math.max(tempSum, maxSum);
    }
    return MIN_VALUE == maxSum ? 0 : maxSum;
  }
}
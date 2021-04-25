package com.practice.array;

//https://leetcode.com/problems/maximum-subarray/
public class FindMaxSumOfSubArray {

  public int maxSubArraySum(int[] arr) {
    int maxSum = arr[0];
    int endingSum = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (endingSum < 0) {
        endingSum = arr[i];
      } else {
        endingSum = endingSum + arr[i];
      }
      maxSum = Math.max(maxSum, endingSum);
    }
    return maxSum;
  }
}

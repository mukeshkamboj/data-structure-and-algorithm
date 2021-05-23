package com.practice.dynamic_programming;

//https://leetcode.com/problems/maximum-subarray/
public class MaximumSubArray {

  public int findMaxSum(int[] arr) {
    if (arr.length == 0) {
      return 0;
    }
    int max = arr[0];
    int cur = max;
    for (int i = 1; i < arr.length; i++) {
      if (cur < 0) {
        cur = arr[i];
      } else {
        cur += arr[i];
      }
      max = Math.max(max, cur);
    }
    return max;
  }
}

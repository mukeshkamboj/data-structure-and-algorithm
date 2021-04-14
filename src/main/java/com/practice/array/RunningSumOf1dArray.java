package com.practice.array;

//https://leetcode.com/problems/running-sum-of-1d-array/
public class RunningSumOf1dArray {

  public static int[] runningSum(int[] arr) {
    int previousSum = 0;
    for (int i = 0; i < arr.length; i++) {
      previousSum += arr[i];
      arr[i] = previousSum;
    }
    return arr;
  }
}

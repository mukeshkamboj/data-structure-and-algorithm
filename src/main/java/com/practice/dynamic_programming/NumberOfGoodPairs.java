package com.practice.dynamic_programming;

public class NumberOfGoodPairs {

  public static int numIdenticalPairs(int[] arr) {
    int count = 0;
    int[] countByValue = new int[101];
    for (int val : arr) {
      count += countByValue[val]++;
    }
    return count;
  }
}

package com.practice.bitoperators;

//https://leetcode.com/problems/single-number/
public class FindSingleNumberWhichIsNotDuplicated {

  public int singleNumber(int[] arr) {
    int n = 0;
    for (int i : arr) {
      n ^= i;
    }
    return n;
  }
}

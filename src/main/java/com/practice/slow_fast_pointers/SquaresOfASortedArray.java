package com.practice.slow_fast_pointers;

//https://leetcode.com/problems/squares-of-a-sorted-array/
public class SquaresOfASortedArray {

  public int[] sortedSquare(int[] arr) {
    int[] result = new int[arr.length];
    int start = 0;
    int end = arr.length - 1;

    for (int p = arr.length - 1; p >= 0; p--) {
      int val = 0;
      if (Math.abs(arr[start]) > Math.abs(arr[end])) {
        val = arr[start] * arr[start];
        start++;
      } else {
        val = arr[end] * arr[end];
        end--;
      }
      result[p] = val;
    }

    return result;
  }
}

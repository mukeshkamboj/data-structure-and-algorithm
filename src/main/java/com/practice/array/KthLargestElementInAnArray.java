package com.practice.array;

import java.util.Arrays;

//https://leetcode.com/problems/kth-largest-element-in-an-array/
public class KthLargestElementInAnArray {

  public int findKthLargest(int[] arr, int k) {
    Arrays.sort(arr);
    return arr[arr.length - k];
  }
}

package com.practice.array;

// https://leetcode.com/problems/product-of-array-except-self/
public class ProductOfArrayExceptSelf {

  public int[] productExceptSelf(int[] arr) {
    int[] result = new int[arr.length];
    int previous = 1;
    for (int i = 0; i < arr.length; i++) {
      result[i] = previous;
      previous *= arr[i];
    }
    previous = 1;
    for (int i = arr.length - 1; i >= 0; i--) {
      result[i] *= previous;
      previous *= arr[i];
    }
    return result;
  }
}

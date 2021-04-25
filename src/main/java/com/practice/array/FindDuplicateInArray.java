package com.practice.array;

import java.util.Arrays;

// https://leetcode.com/problems/contains-duplicate/
public class FindDuplicateInArray {

  public boolean containsDuplicate(int[] arr) {
    Arrays.sort(arr);
    int previousValue = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (previousValue == arr[i]) {
        return true;
      }
      previousValue = arr[i];
    }
    return false;
  }
}

package com.practice.array;

// https://leetcode.com/problems/minimum-distance-to-the-target-element/
public class MinimumDistanceToTheTargetElement {

  public int getMinDistance(int[] arr, int target, int start) {
    int min = arr.length;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        min = Math.min(min, Math.abs(i - start));
      }
    }
    return min;
  }
}

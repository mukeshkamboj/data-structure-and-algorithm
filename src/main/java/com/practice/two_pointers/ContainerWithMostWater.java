package com.practice.two_pointers;

// https://leetcode.com/problems/container-with-most-water/
public class ContainerWithMostWater {

  public int maxArea(int[] arr) {
    int max = 0;
    int left = 0, right = arr.length - 1;
    while (right > left) {
      max = Math.max(max, Math.min(arr[right], arr[left]) * (right - left));
      if (arr[right] > arr[left]) {
        left++;
      } else {
        right--;
      }
    }
    return max;
  }
}

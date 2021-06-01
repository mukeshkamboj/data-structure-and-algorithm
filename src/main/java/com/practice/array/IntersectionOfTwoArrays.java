package com.practice.array;

//https://leetcode.com/problems/intersection-of-two-arrays/
public class IntersectionOfTwoArrays {

  public int[] intersection(int[] nums1, int[] nums2) {
    int[] count = new int[1000];

    for (int j : nums1) {
      if (count[j] == 0) {
        count[j]++;
      }
    }

    for (int j : nums2) {
      if (count[j] >= 1) {
        count[j]++;
      }
    }

    int countIntersections = 0;
    for (int i = 0; i < 1000; i++) {
      if (count[i] >= 2) {
        countIntersections++;
      }
    }

    int[] result = new int[countIntersections];
    int index = 0;
    for (int i = 0; i < 1000; i++) {
      if (count[i] >= 2) {
        result[index++] = i;
      }
    }

    return result;
  }
}

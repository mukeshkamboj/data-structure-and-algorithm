package com.practice.array;

//https://leetcode.com/problems/intersection-of-two-arrays/
public class IntersectionOfTwoArrays {

  public int[] intersection(int[] nums1, int[] nums2) {
    int[] count = new int[1000];

    for (int i = 0; i < nums1.length; i++) {
      if (count[nums1[i]] == 0) {
        count[nums1[i]]++;
      }
    }

    for (int i = 0; i < nums2.length; i++) {
      if (count[nums2[i]] >= 1) {
        count[nums2[i]]++;
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

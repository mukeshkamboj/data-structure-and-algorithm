package com.practice.dynamic_programming;

//https://leetcode.com/problems/median-of-two-sorted-arrays/
public class MedianOfTwoSortedArray {

  public static void main(String[] args) {
    int[] nums1 = {1, 2};
    int[] nums2 = {3, 4};
    System.out.println(findMedianSortedArrays(nums1, nums2));
  }

  public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int middle = ((nums1.length + nums2.length) / 2) + 1;
    int[] result = new int[middle];
    int i1 = 0, i2 = 0, ir = 0;
    while (ir < middle && i1 < nums1.length && i2 < nums2.length) {
      int val1 = nums1[i1];
      int val2 = nums2[i2];
      if (val1 < val2) {
        result[ir++] = val1;
        i1++;
      } else {
        result[ir++] = val2;
        i2++;
      }
    }

    int il = i1 < nums1.length ? i1 : i2;
    int[] numl = i1 < nums1.length ? nums1 : nums2;
    for (; ir < result.length; il++) {
      result[ir++] = numl[il];
    }

    if ((nums1.length + nums2.length) % 2 == 0) {
      return ((double) result[middle - 2] + (double) result[middle - 1]) / (double) 2;
    } else {
      return result[middle - 1];
    }
  }
}

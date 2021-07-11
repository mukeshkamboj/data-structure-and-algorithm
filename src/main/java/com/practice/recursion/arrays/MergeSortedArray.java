package com.practice.recursion.arrays;

public class MergeSortedArray {

  public void mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {
    if (n == 0) {
      return;
    }
    if (m == 0) {
      for (int i = 0; i < nums1.length; i++) {
        nums1[i] = nums2[i];
      }
    }
    merge(nums1, m - 1, nums2, n - 1, m + n - 1);
  }

  void merge(int[] nums1, int i, int[] nums2, int j, int k) {
    if (i >= 0 && j >= 0) {
      if (nums1[i] > nums2[j]) {
        nums1[k--] = nums1[i--];
      } else {
        nums1[k--] = nums2[j--];
      }
      merge(nums1, i, nums2, j, k);
    } else {
      while (j >= 0) {
        nums1[k--] = nums2[j--];
      }
    }
  }
}

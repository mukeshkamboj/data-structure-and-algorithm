package com.practice.binary_search;

//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class SearchInRotatedSortedArray {

  public int findTarget(int[] arr, int target) {
    int left = 0, right = arr.length - 1;
    while (left < right) {
      int mid = (left + right) / 2;
      if (arr[mid] > arr[right]) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }

    int rotationStarts = left;
    left = 0;
    right = arr.length - 1;

    while (left <= right) {
      int mid = (left + right) / 2;
      int realMid = (mid + rotationStarts) % arr.length;
      if (arr[realMid] == target) {
        return realMid;
      } else if (arr[realMid] > target) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return -1;
  }
}

package com.practice.array.binary_search;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FindFirstAndLastPositionOfGivenElementInSortedArray {

  public int[] findPosition(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;
    int mid = 0;
    int[] result = {-1, -1};

    while (start <= end) {
      mid = (start + end) / 2;
      if (arr[mid] == target) {

        if (mid > 0 && arr[mid - 1] == target) {
          end = mid - 1;
        } else {
          result[0] = mid;
          break;
        }

      } else if (arr[mid] > target) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }

    start = 0;
    end = arr.length - 1;
    mid = 0;

    while (start <= end) {
      mid = (start + end) / 2;
      if (arr[mid] == target) {

        if (mid < arr.length - 1 && arr[mid + 1] == target) {
          start = mid + 1;
        } else {
          result[1] = mid;
          break;
        }

      } else if (arr[mid] > target) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }

    return result;
  }
}

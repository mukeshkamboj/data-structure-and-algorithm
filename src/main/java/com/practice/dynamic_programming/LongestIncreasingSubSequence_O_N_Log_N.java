package com.practice.dynamic_programming;

//https://leetcode.com/problems/longest-increasing-subsequence/
public class LongestIncreasingSubSequence_O_N_Log_N {

  public int findMax(int[] arr) {
    if (arr.length <= 1) {
      return arr.length;
    }

    int[] sequences = new int[arr.length];
    int position = -1;
    for (int current : arr) {
      int start = 0;
      int end = position;
      if (position == -1 || sequences[position] < current) {
        sequences[++position] = current;
      } else {
        while (start < end) {
          int mid = (start + end) / 2;
          if (sequences[mid] == current) {
            start = mid;
            break;
          }
          if (sequences[mid] > current) {
            end = mid ;
          } else {
            start = mid + 1;
          }
        }
        sequences[start] = current;
      }
    }
    return position + 1;
  }
}

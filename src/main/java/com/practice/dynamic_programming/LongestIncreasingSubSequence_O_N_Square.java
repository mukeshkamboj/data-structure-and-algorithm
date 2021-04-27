package com.practice.dynamic_programming;

import java.util.Arrays;

public class LongestIncreasingSubSequence_O_N_Square {

  public int findMax(int[] arr) {
    int[] listMaxSeqSizes = new int[arr.length];
    Arrays.fill(listMaxSeqSizes, 1);

    for (int i = 1; i < arr.length; i++) {
      for (int j = 0; j < i; j++) {
        if (arr[i] > arr[j] && listMaxSeqSizes[i] < listMaxSeqSizes[j] + 1) {
          listMaxSeqSizes[i] = listMaxSeqSizes[j] + 1;
        }
      }
    }
    int max = 0;
    for (int listMaxSeqSize : listMaxSeqSizes) {
      if (max < listMaxSeqSize) {
        max = listMaxSeqSize;
      }
    }
    return max;
  }
}

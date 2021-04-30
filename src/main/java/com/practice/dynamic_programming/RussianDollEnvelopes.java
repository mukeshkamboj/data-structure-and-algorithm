package com.practice.dynamic_programming;

import java.util.Arrays;
//https://leetcode.com/problems/russian-doll-envelopes/
public class RussianDollEnvelopes {

  public int maxEnvelopes(int[][] envelopes) {
    Arrays.sort(envelopes, (e1, e2) -> e1[0] == e2[0] ? e2[1] - e1[1] : e1[0] - e2[0]);
    int[] maxEnvelopes = new int[envelopes.length];
    int position = 0;
    for (int[] env : envelopes) {
      int left = 0;
      int right = position;
      while (left < right) {
        int mid = left + (right - left) / 2;
        if (maxEnvelopes[mid] < env[1]) {
          left = mid + 1;
        } else {
          right = mid;
        }
      }
      maxEnvelopes[left] = env[1];
      if (left == position) {
        position++;
      }
    }
    return position;
  }
}

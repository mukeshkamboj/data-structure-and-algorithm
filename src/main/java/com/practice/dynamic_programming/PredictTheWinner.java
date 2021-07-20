package com.practice.dynamic_programming;

import java.util.Arrays;

//https://leetcode.com/problems/predict-the-winner/
public class PredictTheWinner {

  public boolean predictTheWinner(int[] arr) {
    int[][] dp = new int[arr.length][arr.length];
    for (int[] k : dp) {
      Arrays.fill(k, -1);
    }

    int p1Score = find(arr, 0, arr.length - 1, dp);
    int ts = 0;
    for (int i : arr) {
      ts += i;
    }
    return p1Score >= ts - p1Score;
  }

  private int find(int[] arr, int l, int r, int[][] dp) {
    if (l > r) {
      return 0;
    }
    if (l == r) {
      return arr[l];
    }

    if (dp[l][r] != -1) {
      return dp[l][r];
    }

    int s1 = arr[l] + Math.min(find(arr, l + 1, r - 1, dp), find(arr, l + 2, r, dp));
    int s2 = arr[r] + Math.min(find(arr, l + 1, r - 1, dp), find(arr, l, r - 2, dp));
    dp[l][r] = Math.max(s1, s2);
    return dp[l][r];
  }

}

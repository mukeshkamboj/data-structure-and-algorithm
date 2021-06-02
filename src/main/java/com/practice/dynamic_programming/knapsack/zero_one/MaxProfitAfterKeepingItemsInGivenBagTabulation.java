package com.practice.dynamic_programming.knapsack.zero_one;

// https://www.geeksforgeeks.org/knapsack-with-large-weights/
public class MaxProfitAfterKeepingItemsInGivenBagTabulation {

  public int findMaxProfit(int[] w, int[] p, int kw) {
    int[][] dp = new int[w.length + 1][kw + 1];

    for (int i = 1; i <= w.length; i++) {
      for (int j = 1; j <= kw; j++) {
        if (w[i - 1] <= j) {
          dp[i][j] = Math.max(p[i - 1] + dp[i - 1][j - w[i - 1]], dp[i - 1][j]);
        } else {
          dp[i][j] = dp[i - 1][j];
        }
      }
    }
    return dp[w.length][kw];
  }
}

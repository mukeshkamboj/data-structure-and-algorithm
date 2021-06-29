package com.practice.dynamic_programming.tabulation;

//https://leetcode.com/problems/climbing-stairs/
public class StairsCount {

  public int findCount(int n) {
    int[] dp = new int[n + 1];
    dp[0] = 1;
    for (int i = 1; i <= n; i++) {
      if (i == 1) {
        dp[i] = 1;
      } else if (i == 2) {
        dp[i] = 2;
      } else if (i == 3) {
        dp[i] = 4;
      } else {
        dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
      }
    }
    return dp[n];
  }
}

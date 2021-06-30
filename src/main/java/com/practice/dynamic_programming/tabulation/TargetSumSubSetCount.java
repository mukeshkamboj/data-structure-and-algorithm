package com.practice.dynamic_programming.tabulation;

public class TargetSumSubSetCount {

  public int count(int[] arr, int sum) {
    int[][] dp = new int[arr.length + 1][sum + 1];

    for (int i = 0; i < dp.length; i++) {
      for (int j = 0; j <= sum; j++) {
        if (i == 0 && j == 0) {
          dp[i][j] = 1;
        } else if (i == 0) {
          dp[i][j] = 0;
        } else if (j == 0) {
          dp[i][j] = 1;
        } else {
          if (arr[i - 1] <= j) {
            dp[i][j] = dp[i - 1][j - arr[i - 1]] + dp[i - 1][j];
          } else {
            dp[i][j] = dp[i - 1][j];
          }
        }
      }
    }

    return dp[arr.length][sum];
  }
}

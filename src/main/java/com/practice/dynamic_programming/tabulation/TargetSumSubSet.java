package com.practice.dynamic_programming.tabulation;

//https://www.youtube.com/watch?v=tRpkluGqINc&list=PL-Jc9J83PIiG8fE6rj9F5a6uyQ5WPdqKy&index=11
public class TargetSumSubSet {

  public boolean exists(int[] arr, int sum) {
    boolean[][] dp = new boolean[arr.length + 1][sum + 1];

    for (int i = 0; i < dp.length; i++) {
      for (int j = 0; j <= sum; j++) {
        if (i == 0 && j == 0) {
          dp[i][j] = true;
        } else if (i == 0) {
          dp[i][j] = false;
        } else if (j == 0) {
          dp[i][j] = true;
        } else if (arr[i - 1] <= j) {
          dp[i][j] = dp[i - 1][j - arr[i - 1]] || dp[i - 1][j];
        } else {
          dp[i][j] = dp[i - 1][j];
        }
      }
    }

    return dp[arr.length][sum];
  }
}

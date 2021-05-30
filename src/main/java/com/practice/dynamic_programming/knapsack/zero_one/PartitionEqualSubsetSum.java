package com.practice.dynamic_programming.knapsack.zero_one;

//https://leetcode.com/problems/partition-equal-subset-sum/
public class PartitionEqualSubsetSum {

  public boolean canPartition(int[] arr) {
    int sum = 0;
    for (int i : arr) {
      sum += i;
    }
    if (sum % 2 != 0) {
      return false;
    }
    int hs = sum / 2;
    boolean[][] dp = new boolean[arr.length + 1][hs + 1];

    for (int i = 0; i <= arr.length; i++) {
      dp[i][0] = true;
    }

    for (int i = 1; i <= arr.length; i++) {
      for (int j = 1; j <= hs; j++) {
        if (arr[i - 1] <= j) {
          dp[i][j] = dp[i - 1][j - arr[i - 1]] || dp[i - 1][j];
        } else {
          dp[i][j] = dp[i - 1][j];
        }
      }
    }
    return dp[arr.length][hs];
  }
}

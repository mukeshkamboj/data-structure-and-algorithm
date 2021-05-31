package com.practice.dynamic_programming.knapsack.zero_one;

//https://leetcode.com/problems/last-stone-weight-ii/submissions/
public class MinimumSubsetSumDifference {

  public int minimumSubsetDifference(int[] arr) {
    int sum = 0;
    for (int i : arr) {
      sum += i;
    }

    boolean[][] dp = new boolean[arr.length + 1][sum + 1];

    for (int i = 0; i <= arr.length; i++) {
      dp[i][0] = true;
    }

    for (int i = 1; i <= arr.length; i++) {
      for (int j = 1; j <= sum / 2; j++) {
        if (arr[i - 1] <= j) {
          dp[i][j] = dp[i - 1][j - arr[i - 1]] || dp[i - 1][j];
        } else {
          dp[i][j] = dp[i - 1][j];
        }
      }
    }

    int h = sum / 2;

    while (!dp[arr.length][h]) {
      h--;
    }
    return sum - 2 * h;
  }
}

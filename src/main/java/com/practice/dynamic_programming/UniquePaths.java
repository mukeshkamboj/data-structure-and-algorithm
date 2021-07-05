package com.practice.dynamic_programming;

public class UniquePaths {

  public int findUniquePaths(int m, int n) {
    return find(1, 1, m, n, new int[m + 1][n + 1]);
  }

  private int find(int i, int j, int m, int n, int[][] dp) {
    if (m == i && j == n) {
      return 1;
    }

    if (m < i || j > n) {
      return 0;
    }

    if (dp[i][j] != 0) {
      return dp[i][j];
    }

    dp[i][j] = find(i + 1, j, m, n, dp) + find(i, j + 1, m, n, dp);
    return dp[i][j];
  }
}

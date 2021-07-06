package com.practice.dynamic_programming;

// https://leetcode.com/problems/unique-paths-ii/
public class UniquePathsII {

  public int findUniquePaths(int[][] m) {
    return find(0, 0, m, new int[m.length][m[0].length]);
  }

  int find(int i, int j, int[][] g, int[][] dp) {

    if (i >= g.length || j >= g[0].length || g[i][j] == 1) {
      return 0;
    }

    if (i == g.length - 1 && j == g[0].length - 1) {
      return 1;
    }

    if (dp[i][j] != 0) {
      return dp[i][j];
    }

    dp[i][j] = find(i + 1, j, g, dp) + find(i, j + 1, g, dp);
    return dp[i][j];
  }
}

package com.practice.dynamic_programming;

//https://leetcode.com/problems/climbing-stairs/
public class ClimbingStairs {

  public int countPaths(int steps) {
    return rec(steps, new int[steps + 1]);
  }

  private int rec(int steps, int[] dp) {
    if (steps == 0) {
      return 1;
    }
    if (steps < 0) {
      return 0;
    }
    if (dp[steps] != 0) {
      return dp[steps];
    }
    dp[steps] = rec(steps - 1, dp) + rec(steps - 2, dp);
    return dp[steps];
  }
}

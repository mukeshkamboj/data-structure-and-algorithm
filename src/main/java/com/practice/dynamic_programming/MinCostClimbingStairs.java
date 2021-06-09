package com.practice.dynamic_programming;

//https://leetcode.com/problems/min-cost-climbing-stairs/
public class MinCostClimbingStairs {

  public int findMinCost(int[] cost) {
    int[] dp = new int[cost.length + 1];
    return Math.min(rec(cost, dp, 0), rec(cost, dp, 1));
  }

  private int rec(int[] cost, int[] dp, int step) {
    if (step == cost.length - 1) {
      return cost[step];
    }

    if (step >= cost.length) {
      return 0;
    }

    if (dp[step] != 0) {
      return dp[step];
    }
    dp[step] = cost[step] + Math.min(rec(cost, dp, step + 1), rec(cost, dp, step + 2));
    return dp[step];
  }
}

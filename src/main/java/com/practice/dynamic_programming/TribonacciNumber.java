package com.practice.dynamic_programming;

//https://leetcode.com/problems/n-th-tribonacci-number/
public class TribonacciNumber {

  public int find(int n) {
    return rec(n, new int[n + 1]);
  }

  private int rec(int n, int[] dp) {
    if (n == 0 || n == 1) {
      return n;
    }
    if (n < 0) {
      return 0;
    }
    if (dp[n] != 0) {
      return dp[n];
    }
    dp[n] = rec(n - 1, dp) + rec(n - 2, dp) + rec(n - 3, dp);
    return dp[n];
  }
}

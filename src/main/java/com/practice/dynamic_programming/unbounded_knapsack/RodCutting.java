package com.practice.dynamic_programming.unbounded_knapsack;

//https://www.geeksforgeeks.org/cutting-a-rod-dp-13/
public class RodCutting {

  public int findMaxCostWithRecursive(int[] prices, int[] length, int rodLength) {
    return rec(prices, length, 0, 0, 0, rodLength);
  }

  private int rec(int[] prices, int[] length, int in, int sum, int len, int rodLength) {
    if (len == rodLength) {
      return sum;
    }
    int max = 0;
    if (in < prices.length && len < rodLength) {
      for (int i = in; i < prices.length; i++) {
        max = Math.max(max, rec(prices, length, i, sum + prices[i], len + length[i], rodLength));
      }
    }
    return max;
  }
}

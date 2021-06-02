package com.practice.dynamic_programming.knapsack.zero_one;

// https://www.geeksforgeeks.org/knapsack-with-large-weights/
public class MaxProfitAfterKeepingItemsInGivenBag {

  static int[][] dp;

  public int findMaxProfit(int[] weight, int[] price, int knapsackWeight) {
    dp = new int[weight.length + 1][knapsackWeight + 1];
    for (int i = 0; i <= weight.length; i++) {
      for (int j = 0; j <= knapsackWeight; j++) {
        dp[i][j] = -1;
      }
    }
    return knapsack(weight, price, knapsackWeight, 0);
  }

  static int knapsack(int[] weight, int[] price, int knapsackWeight, int index) {
    if (index == weight.length || knapsackWeight == 0) {
      return 0;
    }

    if (dp[index][knapsackWeight] != -1) {
      return dp[index][knapsackWeight];
    }
    if (weight[index] <= knapsackWeight) {
      dp[index][knapsackWeight] = Math.max(
          price[index] + knapsack(weight, price, knapsackWeight - weight[index], index + 1),
          knapsack(weight, price, knapsackWeight, index + 1));
    } else {
      dp[index][knapsackWeight] = knapsack(weight, price, knapsackWeight, index + 1);
    }

    return dp[index][knapsackWeight];
  }
}

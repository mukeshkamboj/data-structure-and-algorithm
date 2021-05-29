package com.practice.dynamic_programming.knapsack.zero_one;

// https://www.geeksforgeeks.org/knapsack-with-large-weights/
public class MaxProfitAfterKeepingItemsInGivenBag {

  public int findMaxProfit(int[] weight, int[] price, int knapsackWeight) {
    return knapsack(weight, price, knapsackWeight, 0);
  }

  static int knapsack(int[] weight, int[] price, int knapsackWeight, int index) {
    if (index == weight.length || knapsackWeight == 0) {
      return 0;
    }

    if (weight[index] <= knapsackWeight) {
      return Math.max(
          price[index] + knapsack(weight, price, knapsackWeight - weight[index], index + 1),
          knapsack(weight, price, knapsackWeight, index + 1));
    } else {
      return knapsack(weight, price, knapsackWeight, index + 1);
    }
  }
}

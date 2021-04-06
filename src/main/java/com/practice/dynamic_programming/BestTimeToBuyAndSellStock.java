package com.practice.dynamic_programming;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimeToBuyAndSellStock {

  public int maxProfit(int[] prices) {
    int max = 0;
    int minNumber = prices[0];
    for (int itr = 1; itr < prices.length; itr++) {
      if (prices[itr] > minNumber) {
        max = Math.max(max, prices[itr] - minNumber);
      } else {
        minNumber = prices[itr];
      }
    }
    return max;
  }
}

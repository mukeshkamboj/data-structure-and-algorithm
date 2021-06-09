package com.practice.dynamic_programming.unbounded_knapsack;

import java.util.HashMap;
import java.util.Map;

//https://www.geeksforgeeks.org/cutting-a-rod-dp-13/
public class RodCutting {

  Map<String, Integer> map = new HashMap<>();

  public int findMaxCostWithRecursive(int[] prices, int[] length, int rodLength) {
    return rec(prices, length, 0, 0, rodLength);
  }

  private int rec(int[] prices, int[] length, int in, int sum, int rodLength) {
    String key = length[in] + "-" + rodLength;

    if (map.containsKey(key)) {
      return map.get(key);
    }
    if (0 == rodLength) {
      return sum;
    }
    int max = 0;
    if (rodLength > 0) {
      for (int i = in; i < prices.length; i++) {
        max = Math.max(max, rec(prices, length, i, sum + prices[i], rodLength - length[i]));
      }
    }
    map.put(key, max);
    return max;
  }
}

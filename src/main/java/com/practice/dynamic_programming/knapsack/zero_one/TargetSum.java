package com.practice.dynamic_programming.knapsack.zero_one;

import java.util.HashMap;
import java.util.Map;

public class TargetSum {

  Map<String, Integer> map = new HashMap<>();

  public int findTargetSumWays(int[] arr, int target) {
    return rec(arr, target, 0, 0);
  }

  private int rec(int[] arr, int target, int is, int i) {
    String key = i + "-" + is;
    if (map.containsKey(key)) {
      return map.get(key);
    }
    if (target == is && arr.length == i) {
      return 1;
    }
    if (arr.length == i) {
      return 0;
    }

    int p = rec(arr, target, is + arr[i], i + 1);
    int n = rec(arr, target, is - arr[i], i + 1);
    map.put(key, p + n);
    return map.get(key);
  }
}

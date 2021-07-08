package com.practice.dynamic_programming;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://www.hackerrank.com/challenges/coin-change/problem
public class CoinChangeProblem {

  private Map<String, Long> map = new HashMap<>();

  public long getWays(int n, List<Long> c) {
    Collections.sort(c);
    return find(n, c, 0, 0);
  }

  long find(int n, List<Long> list, int start, long sum) {
    if (sum == n) {
      return 1;
    }
    String key = start + "_" + sum;
    if (map.containsKey(key)) {
      return map.get(key);
    }
    long c = 0;
    if (sum < n) {
      for (int i = start; i < list.size() && list.get(i) <= n - sum; i++) {
        c += find(n, list, i, sum + list.get(i));
      }
    }
    map.put(key, c);
    return c;
  }

}

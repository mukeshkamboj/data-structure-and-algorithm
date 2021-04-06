package com.practice.dynamic_programming;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortIntegerByPowerOfValue {

  public int getKth(int lo, int hi, int k) {

    Map<Integer, SortedSet<Integer>> map = new TreeMap<>();
    Map<Integer, Integer> integerStepCount = new HashMap<>();

    for (int i = lo; i <= hi; i++) {
      int stepCount = getStepCount(integerStepCount, i);
      map.put(stepCount, map.getOrDefault(stepCount, new TreeSet<>()));
      map.get(stepCount).add(i);
    }

    int result = 0;
    int count = 1;
    for (int key : map.keySet()) {
      for (int value : map.get(key)) {
        if (count++ == k) {
          return value;
        }
      }
    }
    return result;
  }

  private int getStepCount(Map<Integer, Integer> map, int val) {
    if (val == 1) {
      return 0;
    }
    if (map.containsKey(val)) {
      return map.get(val);
    }
    if ((val % 2) == 0) {
      map.put(val, getStepCount(map, val / 2) + 1);
    } else {
      map.put(val, getStepCount(map, 3 * val + 1) + 1);
    }
    return map.get(val);
  }
}

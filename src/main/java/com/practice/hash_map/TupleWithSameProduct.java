package com.practice.hash_map;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/tuple-with-same-product/
public class TupleWithSameProduct {

  public int findTupleCount(int[] arr) {
    int result = 0;
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        result += 8 * map.getOrDefault(arr[i] * arr[j], 0);
        map.put(arr[i] * arr[j], map.getOrDefault(arr[i] * arr[j], 0) + 1);
      }
    }
    return result;
  }
}

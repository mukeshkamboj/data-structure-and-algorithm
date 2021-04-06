package com.practice.dynamic_programming;

import java.util.Arrays;
import java.util.HashMap;

//https://leetcode.com/problems/two-sum/
public class TwoNumbersSum {

  public static void main(String[] args) {
    int[] arr = {3, 2, 4};
    int target = 6;
    Arrays.stream(twoSum(arr, target)).forEach(System.out::println);
  }

  public static int[] twoSum(int[] arr, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int[] output = new int[2];
    for (int i = 0; i < arr.length; i++) {
      var sub = target - arr[i];
      if (map.containsKey(sub)) {
        output[0] = map.get(sub);
        output[1] = i;
        break;
      }
      map.put(arr[i], i);
    }
    return output;
  }
}

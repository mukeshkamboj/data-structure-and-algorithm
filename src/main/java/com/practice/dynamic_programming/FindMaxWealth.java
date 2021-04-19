package com.practice.dynamic_programming;

public class FindMaxWealth {

  public static int maximumWealth(int[][] customersWealth) {
    int max = 0;
    for (int[] wealth : customersWealth) {
      int temp = 0;
      for (int j : wealth) {
        temp += j;
      }
      max = Math.max(max, temp);
    }
    return max;
  }
}

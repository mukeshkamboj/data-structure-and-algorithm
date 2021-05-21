package com.practice.dynamic_programming;

public class BestTimeToBuyAndSellStockII {

  public int maxProfit(int[] arr) {
    int p = 0;
    int i = 0;
    while (i < arr.length) {
      //find next min
      while (i < arr.length - 1 && arr[i + 1] <= arr[i]) {
        i++;
      }
      int min = arr[i++];
      //find next max
      while (i < arr.length - 1 && arr[i + 1] > arr[i]) {
        i++;
      }
      p += i == arr.length ? 0 : arr[i] - min;
    }
    return p;
  }
}

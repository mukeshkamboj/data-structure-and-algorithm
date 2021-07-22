package com.practice.greedy;

//https://leetcode.com/problems/can-place-flowers/
public class CanPlaceFlowers {

  public boolean canPlaceFlowers(int[] flowerbed, int n) {
    int i = 0;
    while (i < flowerbed.length && n > 0) {
      if (flowerbed[i] == 0) {
        if (i == 0) {
          if (i + 1 < flowerbed.length && flowerbed[i + 1] == 0 || i == flowerbed.length - 1) {
            flowerbed[i] = 1;
            n--;
          }
        } else if (i == flowerbed.length - 1) {
          if (flowerbed[i - 1] == 0) {
            flowerbed[i] = 1;
            n--;
          }
        } else {
          if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
            flowerbed[i] = 1;
            n--;
          }
        }
      }
      i++;
    }
    return n == 0;
  }
}

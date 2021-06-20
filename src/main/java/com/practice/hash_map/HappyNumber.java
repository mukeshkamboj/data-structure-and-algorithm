package com.practice.hash_map;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/happy-number/
public class HappyNumber {

  public boolean isHappy(int n) {
    Set<Integer> set = new HashSet<>();
    while (!set.contains(n)) {
      set.add(n);
      int a = n;
      int ne = 0;
      while (a > 0) {
        ne += (a % 10) * (a % 10);
        a = a / 10;
      }
      n = ne;
    }
    return n == 1;
  }
}

package com.practice.dynamic_programming;

//https://leetcode.com/problems/fibonacci-number/
public class FibonacciNumber {

  public int find(int num) {
    return findFibNum(num, new int[num + 1]);
  }

  private int findFibNum(int num, int[] qb) {
    if (num <= 1) {
      return num;
    }
    if (qb[num] != 0) {
      return qb[num];
    }
    qb[num] = findFibNum(num - 1, qb) + findFibNum(num - 2, qb);
    return qb[num];
  }
}

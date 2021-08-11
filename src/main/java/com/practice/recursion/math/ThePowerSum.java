package com.practice.recursion.math;

//https://www.hackerrank.com/challenges/the-power-sum/problem
public class ThePowerSum {

  public static int powerSum(int X, int N) {
    return find(X, N, 1, 0);
  }

  static int find(int x, int n, int start, int sum) {
    if (sum == x) {
      return 1;
    }
    int res = 0;
    int upTo = (int) Math.pow(x, 1.0 / n) + 1;
    if (sum < x) {
      for (int i = start; (int) Math.pow(i, n) + sum <= x && i <= upTo; i++) {
        res += find(x, n, i + 1, (int) Math.pow(i, n) + sum);
      }
    }
    return res;
  }
}

package com.practice.math;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/permutation-sequence/
public class PermutationSequence {

  public String findPermutationSequence(int n, int k) {
    StringBuilder sb = new StringBuilder();
    int factorial = 1;
    List<Integer> list = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      list.add(i);
      factorial *= i;
    }
    factorial = factorial / n;
    k = k - 1;
    while (true) {
      sb.append(list.remove(k / factorial));
      k %= factorial;
      if (list.isEmpty()) {
        break;
      }
      factorial /= list.size();
    }
    return sb.toString();
  }
}

package com.practice.array;

import java.util.List;

//https://www.hackerrank.com/challenges/equal-stacks/problem
public class EqualStack {

  public int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
    if (h1.size() == 0 || h2.size() == 0 || h3.size() == 0) {
      return 0;
    }
    int h1Sum = h1.stream().reduce(0, Integer::sum);
    int h2Sum = h2.stream().reduce(0, Integer::sum);
    int h3Sum = h3.stream().reduce(0, Integer::sum);
    int h1Index = 0;
    int h2Index = 0;
    int h3Index = 0;

    while (h1Sum != 0 && h2Sum != 0 && h3Sum != 0) {
      int min = Math.min(h1Sum, h2Sum);
      min = Math.min(min, h3Sum);
      if (h1Sum > min) {
        h1Sum -= h1.get(h1Index++);
      }

      if (h2Sum > min) {
        h2Sum -= h2.get(h2Index++);
      }

      if (h3Sum > min) {
        h3Sum -= h3.get(h3Index++);
      }

      if (h1Sum == h2Sum && h2Sum == h3Sum) {
        return h1Sum;
      }
    }
    return 0;
  }
}

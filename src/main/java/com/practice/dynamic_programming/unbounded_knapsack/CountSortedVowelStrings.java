package com.practice.dynamic_programming.unbounded_knapsack;

//https://leetcode.com/problems/count-sorted-vowel-strings/
public class CountSortedVowelStrings {

  public int countVowelStrings(int n) {
    int a = 1, e = 1, i = 1, o = 1, u = 1;
    while (n > 1) {
      n--;
      a = (a + e + i + o + u);
      e = (e + i + o + u);
      i = (i + o + u);
      o = (o + u);
    }
    return a + e + i + o + u;
  }
}

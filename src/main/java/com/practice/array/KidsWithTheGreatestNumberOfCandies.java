package com.practice.array;

import java.util.LinkedList;
import java.util.List;

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class KidsWithTheGreatestNumberOfCandies {

  public static List<Boolean> kidsWithCandles(int[] kidsWithCandles, int extraCandles) {
    int max = 0;
    for (int kidsWithCandle : kidsWithCandles) {
      max = Math.max(max, kidsWithCandle);
    }

    List<Boolean> list = new LinkedList<>();

    for (int kidsWithCandle : kidsWithCandles) {
      list.add(kidsWithCandle + extraCandles >= max);
    }
    return list;
  }
}

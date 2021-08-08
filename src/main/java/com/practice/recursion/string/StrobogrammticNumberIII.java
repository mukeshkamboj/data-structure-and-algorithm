package com.practice.recursion.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/strobogrammatic-number-iii/
public class StrobogrammticNumberIII {

  public int strobogrammaticNumbersCount(String low, String high) {
    int count = 0;
    long min = Long.parseLong(low);
    long max = Long.parseLong(high);
    for (int i = low.length(); i <= high.length(); i++) {
      List<String> res = find(i, i);
      for (String num : res) {
        long temp = Long.parseLong(num);
        if (min <= temp && temp <= max) {
          count++;
        }
      }
    }
    return count;
  }

  List<String> find(int n, int m) {
    if (n == 1) {
      return Arrays.asList("0", "1", "8");
    }
    if (n == 0) {
      return Collections.singletonList("");
    }

    List<String> list = find(n - 2, m);
    List<String> res = new LinkedList<>();
    for (String num : list) {
      if (n != m) {
        res.add("0" + num + "0");
      }
      res.add("1" + num + "1");
      res.add("8" + num + "8");
      res.add("9" + num + "6");
      res.add("6" + num + "9");
    }
    return res;
  }
}

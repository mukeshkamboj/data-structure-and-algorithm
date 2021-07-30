package com.practice.recursion.string;

import static java.util.Collections.singletonList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/strobogrammatic-number-ii/
public class StrobogrammaticNumberII {

  public List<String> findStroborgrammatic(int n) {
    return find(n, n);
  }

  private List<String> find(int n, int m) {
    if (n == 0) {
      return singletonList("");
    }
    if (n == 1) {
      return Arrays.asList("0", "1", "8");
    }

    List<String> list = find(n - 2, m);
    List<String> res = new LinkedList<>();
    for (String s : list) {
      if (n != m) {
        res.add("0" + s + "0");
      }
      res.add("1" + s + "1");
      res.add("6" + s + "9");
      res.add("8" + s + "8");
      res.add("9" + s + "6");
    }
    return res;
  }
}

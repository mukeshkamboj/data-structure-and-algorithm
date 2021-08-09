package com.practice.recursion.string;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/strobogrammatic-number/
public class StrobogrammaticNumber {

  public boolean isStrobogrammaticNumber(String num) {
    Set<String> set = new HashSet<>();
    set.add("0");
    set.add("1");
    set.add("8");
    set.add("00");
    set.add("11");
    set.add("69");
    set.add("88");
    set.add("96");
    for (int i = 0, j = num.length() - 1; i <= j; i++, j--) {
      String n = num.charAt(i) + "" + num.charAt(j);
      if (!set.contains(n)) {
        return false;
      }
    }
    return true;
  }
}

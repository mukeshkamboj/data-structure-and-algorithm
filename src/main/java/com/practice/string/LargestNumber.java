package com.practice.string;

import java.util.Arrays;

//https://leetcode.com/problems/largest-number/
public class LargestNumber {

  public String largestNumber(int[] arr) {

    if (arr.length == 0) {
      return "";
    }

    String[] sa = Arrays.stream(arr).boxed().map(String::valueOf).toArray(String[]::new);

    Arrays.sort(sa, (s1, s2) -> {
      var i = s1 + s2;
      var j = s2 + s1;
      return j.compareTo(i);
    });

    if (sa[0].charAt(0) == '0') {
      return "0";
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < sa.length; i++) {
      sb.append(sa[i]);
    }
    return sb.toString();
  }
}

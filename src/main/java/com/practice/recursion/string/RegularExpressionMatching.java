package com.practice.recursion.string;

//https://leetcode.com/problems/regular-expression-matching/
public class RegularExpressionMatching {

  public boolean isMatch(String s, String p) {
    if (s.length() == 0 && p.length() == 0) {
      return true;
    }

    boolean charMatch =
        s.length() >= 1 && p.length() >= 1 && (p.charAt(0) == '.' || s.charAt(0) == p
            .charAt(0));

    if (p.length() >= 2 && p.charAt(1) == '*') {
      if (isMatch(s, p.substring(2))) {
        return true;
      }
      return charMatch && isMatch(s.substring(1), p);
    } else {
      return charMatch && isMatch(s.substring(1), p.substring(1));
    }
  }
}

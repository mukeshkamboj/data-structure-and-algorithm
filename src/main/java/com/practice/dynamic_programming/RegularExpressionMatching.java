package com.practice.dynamic_programming;

//https://leetcode.com/problems/regular-expression-matching/
public class RegularExpressionMatching {

  public static void main(String[] args) {
    System.out.println(new RegularExpressionMatching().isMatch("aa", "a"));
    System.out.println(new RegularExpressionMatching().isMatch("aa", "aa"));
    System.out.println(new RegularExpressionMatching().isMatch("aab", "aa."));
    System.out.println(new RegularExpressionMatching().isMatch("aaba", "aa*"));
    System.out.println(new RegularExpressionMatching().isMatch("aaba", "aa.a"));
    System.out.println(new RegularExpressionMatching().isMatch("aabb", "aa.a"));
    System.out.println(new RegularExpressionMatching().isMatch("aabb", "*"));
    System.out.println(new RegularExpressionMatching().isMatch("aabb", ".*"));
  }

  public boolean isMatch(String s, String p) {
    int si = 0;
    int pi = 0;
    while (si < s.length() && pi < p.length()) {

      int sc = s.charAt(si++);
      int pc = p.charAt(pi++);

      if (pc == '*') {
        return true;
      }

      if (pc == '.') {
        continue;
      }

      if (sc != pc) {
        return false;
      }
    }
    return s.length() == p.length();
  }
}

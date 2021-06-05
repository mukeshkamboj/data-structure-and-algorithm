package com.practice.array;

//https://leetcode.com/problems/is-subsequence/
public class IsSubsequence {

  public boolean exist(String s, String t) {
    int indexS = 0;
    int indexT = 0;
    while (indexS < s.length() && indexT < t.length()) {
      char chS = s.charAt(indexS);
      char chT = t.charAt(indexT++);
      if (chS == chT) {
        indexS++;
      }
    }
    return indexS == s.length();
  }
}

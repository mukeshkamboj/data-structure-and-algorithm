package com.practice.string;

//https://leetcode.com/problems/palindromic-substrings/
public class PalindromicSubstringsCount {

  int count = 0;

  public int countSubstrings(String s) {
    for (int i = 0; i < s.length(); i++) {
      findCount(s, i, i);
      findCount(s, i + 1, i);
    }
    return count;
  }

  private void findCount(String str, int right, int left) {
    while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
      count++;
      left--;
      right++;
    }
  }
}

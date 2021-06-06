package com.practice.string;

//https://leetcode.com/problems/split-a-string-in-balanced-strings/
public class CountBalancedSubStrings {

  public int findCount(String string) {
    int count = 0;
    int lCharCount = 0;
    for (int i = 0; i < string.length(); i++) {
      lCharCount += string.charAt(i) == 'L' ? 1 : -1;
      if (lCharCount == 0) {
        count++;
      }
    }
    return count;
  }
}

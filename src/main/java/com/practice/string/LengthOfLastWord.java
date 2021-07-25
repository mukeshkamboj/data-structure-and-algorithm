package com.practice.string;

//https://leetcode.com/problems/length-of-last-word/
public class LengthOfLastWord {

  public int lengthOfLastWord(String str) {
    int l = 0;
    int i = str.length() - 1;
    while (i >= 0 && str.charAt(i) == ' ') {
      i--;
    }
    while (i >= 0 && str.charAt(i) != ' ') {
      i--;
      l++;
    }
    return l;
  }
}

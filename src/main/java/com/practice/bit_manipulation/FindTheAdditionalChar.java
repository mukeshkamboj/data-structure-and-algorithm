package com.practice.bit_manipulation;

//https://leetcode.com/problems/find-the-difference/
public class FindTheAdditionalChar {

  public char findAdditionalCharacter(String s, String t) {
    int n = 0;
    int i = 0;
    while (i < s.length()) {
      n ^= s.charAt(i);
      n ^= t.charAt(i);
      i++;
    }
    return (char) (n ^ t.charAt(i));
  }
}

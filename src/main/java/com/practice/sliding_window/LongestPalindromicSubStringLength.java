package com.practice.sliding_window;

//https://leetcode.com/problems/longest-palindromic-substring/
public class LongestPalindromicSubStringLength {

  public String longestPalindrome(String str) {
    if (str.equals("") || str.length() == 1) {
      return str;
    }

    int start = 0;
    int end = 0;
    for (int i = 0; i < str.length(); i++) {
      int[] indexes = isPalindrome(str, i, i);
      if ((end - start) < (indexes[1] - indexes[0])) {
        end = indexes[1];
        start = indexes[0];
      }
      indexes = isPalindrome(str, i, i + 1);
      if ((end - start) < (indexes[1] - indexes[0])) {
        end = indexes[1];
        start = indexes[0];
      }
    }

    return end - start >= 2 ? str.substring(start, end) : "";
  }

  public static int[] isPalindrome(String str, int startPointer, int endPointer) {
    while (startPointer >= 0 && endPointer < str.length() && str.charAt(startPointer) == str
        .charAt(endPointer)) {
      startPointer--;
      endPointer++;
    }
    return new int[]{startPointer + 1, endPointer};
  }
}

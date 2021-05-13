package com.practice.sliding_window;

// https://leetcode.com/problems/valid-palindrome/
public class PalindromeString {

  public boolean isPalindrome(String s) {
    int right = s.length() - 1;
    int left = 0;
    while (left <= right) {
      if (!Character.isLetterOrDigit(s.charAt(right))) {
        right--;
      } else if (!Character.isLetterOrDigit(s.charAt(left))) {
        left++;
      } else {
        if (Character.toLowerCase(s.charAt(right)) != Character.toLowerCase(s.charAt(left))) {
          return false;
        }
        right--;
        left++;
      }
    }
    return true;
  }
}

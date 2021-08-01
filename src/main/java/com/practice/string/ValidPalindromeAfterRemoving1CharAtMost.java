package com.practice.string;

//https://leetcode.com/problems/valid-palindrome-ii/
public class ValidPalindromeAfterRemoving1CharAtMost {

  public boolean validPalindrome(String str) {
    int l = 0, r = str.length() - 1;
    while (l < r) {
      if (str.charAt(l) != str.charAt(r)) {
        return isPalindrome(str, l + 1, r) || isPalindrome(str, l, r - 1);
      }
      l++;
      r--;
    }
    return true;
  }

  private boolean isPalindrome(String str, int l, int r) {
    while (l < r) {
      if (str.charAt(l) != str.charAt(r)) {
        return false;
      }
      l++;
      r--;
    }
    return true;
  }
}

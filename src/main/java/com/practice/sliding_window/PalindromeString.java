package com.practice.sliding_window;

public class PalindromeString {

  public static void main(String[] args) {
    System.out.println(isPalindrome("abcba"));
    System.out.println(isPalindrome("abba"));
    System.out.println(isPalindrome("afba"));
    System.out.println(isPalindrome(""));
  }

  public static boolean isPalindrome(String str) {
    int endPointer = str.length() - 1;
    int startPointer = 0;

    while (startPointer < endPointer) {
      if (str.charAt(startPointer) != str.charAt(endPointer)) {
        return false;
      }
      startPointer++;
      endPointer--;
    }
    return true;
  }
}

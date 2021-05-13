package com.practice.sliding_window;

public class PermutationInAString {

  public boolean checkInclusion(String pattern, String str) {
    if (pattern.length() > str.length()) {
      return false;
    }
    int[] map = new int[26];
    int len = pattern.length();
    for (int i = 0; i < len; i++) {
      map[pattern.charAt(i) - 'a']++;
      map[str.charAt(i) - 'a']--;
    }
    if (allZeros(map)) {
      return true;
    }

    for (int i = len; i < str.length(); i++) {
      map[str.charAt(i) - 'a']--;
      map[str.charAt(i - len) - 'a']++;
      if (allZeros(map)) {
        return true;
      }
    }

    return false;
  }

  static boolean allZeros(int[] map) {
    for (int j : map) {
      if (j != 0) {
        return false;
      }
    }
    return true;
  }
}

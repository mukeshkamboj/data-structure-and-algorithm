package com.practice.string;

public class ShiftingLetters {

  public String shiftingLetters(String s, int[] shifts) {
    if (shifts.length == 0) {
      return s;
    }
    int sum = 0;
    char[] ca = s.toCharArray();
    for (int i = shifts.length - 1; i >= 0; i--) {
      sum = (sum + shifts[i]) % 26;
      int v = (ca[i] + sum);
      if (v > 'z') {
        ca[i] = (char) (96 + (v - 'z'));
      } else {
        ca[i] = (char) (ca[i] + sum);
      }
    }
    return new String(ca);
  }
}

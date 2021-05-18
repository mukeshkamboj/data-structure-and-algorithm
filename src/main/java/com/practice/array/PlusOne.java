package com.practice.array;

//https://leetcode.com/problems/plus-one/
public class PlusOne {

  public int[] plusOne(int[] digits) {
    int[] result = new int[digits.length];
    int c = 1;
    for (int i = digits.length - 1; i >= 0; i--) {
      int d = c + digits[i];
      if (d / 10 >= 1) {
        c = d / 10;
      } else {
        c = 0;
      }
      result[i] = d % 10;
    }

    if (c != 0) {
      int[] temp = new int[digits.length + 1];
      temp[0] = c;
      System.arraycopy(result, 0, temp, 1, result.length);
      result = temp;
    }

    return result;
  }
}

package com.practice.array;

//https://leetcode.com/problems/plus-one/
public class PlusOne {

  public int[] plusOne(int[] arr) {
    int[] result = new int[arr.length];
    int carry = 1;
    for (int i = arr.length - 1; i >= 0; i--) {
      int digit = arr[i] + carry;
      if (digit / 10 != 0) {
        carry = 1;
      } else {
        carry = 0;
      }
      result[i] = digit % 10;
    }
    if (carry == 1) {
      int[] newArray = new int[arr.length + 1];
      newArray[0] = 1;
      int index = 1;
      for (int val : result) {
        newArray[index++] = val;
      }
      result = newArray;
    }
    return result;
  }
}

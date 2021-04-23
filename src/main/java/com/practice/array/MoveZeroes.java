package com.practice.array;

public class MoveZeroes {

  public void moveZeroes(int[] arr) {
    int position = 0;
    for (int value : arr) {
      if (value != 0) {
        arr[position++] = value;
      }
    }
    for (int i = position; i < arr.length; i++) {
      arr[i] = 0;
    }
  }
}

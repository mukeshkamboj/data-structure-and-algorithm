package com.practice.sliding_window;

public class NumberOfUniqueElementsInASortedArray {

  public int find(int[] array) {
    if (array.length == 0) {
      return 0;
    }

    int result = 1;
    int startingPointer = 0;
    int endPointer = 0;
    while (endPointer < array.length) {
      int sv = array[startingPointer];
      int ev = array[endPointer];
      if (sv != ev) {
        result++;
        startingPointer = endPointer;
      }

      if (sv == ev) {
        endPointer++;
      }
    }
    return result;
  }
}

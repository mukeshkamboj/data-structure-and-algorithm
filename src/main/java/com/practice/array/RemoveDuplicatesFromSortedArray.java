package com.practice.array;

public class RemoveDuplicatesFromSortedArray {

  public int removeDuplicates(int[] arr) {
    if (arr.length == 0) {
      return 0;
    }
    int newIndex = 1;
    int previousElement = arr[0];
    for (int i = newIndex; i < arr.length; i++) {
      if (previousElement != arr[i]) {
        previousElement = arr[i];
        arr[newIndex++] = arr[i];
      }
    }
    return newIndex;
  }
}

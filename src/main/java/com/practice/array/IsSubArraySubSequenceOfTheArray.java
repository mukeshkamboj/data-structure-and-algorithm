package com.practice.array;

public class IsSubArraySubSequenceOfTheArray {

  public boolean isSubSequence(int[] arr, int[] subArr) {

    int i = 0;
    int j = 0;
    while (i < arr.length && j < subArr.length) {
      if (arr[i] == subArr[j]) {
        j++;
      }
      i++;
    }

    return j == subArr.length;
  }
}

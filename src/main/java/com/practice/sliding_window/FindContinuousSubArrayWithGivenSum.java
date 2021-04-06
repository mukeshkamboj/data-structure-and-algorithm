package com.practice.sliding_window;

class FindContinuousSubArrayWithGivenSum {

  static String find(int[] arr, int sum) {

    for (int i = 0; i < arr.length; i++) {
      int tempSum = 0;
      for (int j = i; j < arr.length; j++) {
        tempSum += arr[j];
        if (tempSum == sum) {
          return (i + 1) + " " + (j + 1);
        }
      }
    }
    return "";
  }
}
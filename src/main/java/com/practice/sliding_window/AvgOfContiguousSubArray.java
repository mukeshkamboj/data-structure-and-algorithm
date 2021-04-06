package com.practice.sliding_window;

public class AvgOfContiguousSubArray {

  public static double[] findAvgOfContiguousSubArray(int subArraySize, int[] array) {
    double[] result = new double[array.length - subArraySize + 1];
    int windowSum = 0;
    int windowIndex = 0;

    for (int index = 0; index < array.length; index++) {
      windowSum += array[index];

      if (index >= subArraySize - 1) {
        result[windowIndex] = ((double) windowSum / (double) subArraySize);
        windowSum -= array[windowIndex];
        windowIndex++;
      }

    }
    return result;
  }

}

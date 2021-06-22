package com.practice.array;

import static java.lang.Integer.MIN_VALUE;

public class Find3MaxNumbers {

  public int[] find3MaxNumbers(int[] arr) {
    int[] result = {MIN_VALUE, MIN_VALUE, MIN_VALUE};

    for (int val : arr) {
      for (int j = 0; j < 3; j++) {
        if (result[j] < val) {
          int cur = result[j];
          result[j] = val;
          for (int k = j + 1; k < 3; k++) {
            int l = result[k];
            result[k] = cur;
            cur = l;
          }
          break;
        }
      }
    }

    return result;
  }
}

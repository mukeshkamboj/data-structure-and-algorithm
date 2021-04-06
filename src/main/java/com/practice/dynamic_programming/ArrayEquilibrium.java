package com.practice.dynamic_programming;

import static java.util.Objects.nonNull;

import java.util.Arrays;

class ArrayEquilibrium {

  static int findEquilibrium(int[] arr) {
    if (nonNull(arr)) {
      int total = Arrays
          .stream(arr)
          .reduce(0, Integer::sum);
      int result = 0;
      for (int anArr : arr) {
        total -= anArr;
        result += anArr;
        if (total == result) {
          return result;
        }
      }
    }
    return -1;
  }
}

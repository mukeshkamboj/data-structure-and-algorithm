package com.practice.dynamic_programming;

import static java.util.Objects.nonNull;

class FindMajorityElementBoyerMoore {

  static String find(int[] arr) {
    int element = 0;
    int count = 0;
    if (nonNull(arr) && arr.length > 1) {
      for (int anArr : arr) {
        if (count == 0) {
          element = anArr;
          count++;
        } else if (element == anArr) {
          count++;
        } else {
          count--;
        }
      }
    }
    return count > 1 ? String.valueOf(element) : "No Majority Element";
  }
}

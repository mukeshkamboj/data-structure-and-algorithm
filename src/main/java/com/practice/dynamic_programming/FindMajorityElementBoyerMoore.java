package com.practice.dynamic_programming;

class FindMajorityElementBoyerMoore {

  static String find(int[] arr) {
    if(arr.length == 0){
      return "No Majority Element";
    }

    int majorityElement = arr[0];
    int count = 1;
    for (int i = 1; i < arr.length; i++) {
      if (majorityElement == arr[i]) {
        count++;
      } else {
        count--;
      }
      if (count == 0) {
        majorityElement = arr[i];
        count = 1;
      }
    }
    return isMajority(arr, majorityElement) ? String.valueOf(majorityElement)
        : "No Majority Element";
  }

  private static boolean isMajority(int[] arr, int majorityElement) {
    int count = 0;
    for (int val : arr) {
      if (majorityElement == val) {
        count++;
      }
    }
    return count > arr.length / 2;
  }
}

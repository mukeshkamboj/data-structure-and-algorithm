package com.practice.array;

import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/missing-ranges/
public class MissingRanges {

  public List<String> findMissingRanges(int[] arr, int lower, int upper) {
    List<String> missingRanges = new LinkedList<>();
    if (arr.length == 0) {
      missingRanges.add(lower + "->" + upper);
      return missingRanges;
    }
    int previousNumber = lower - 1;
    for (int currentVal : arr) {
      if (Math.abs(currentVal - previousNumber) == 2) {
        missingRanges.add(String.valueOf(currentVal - 1));
      } else if (Math.abs(currentVal - previousNumber) > 2) {
        missingRanges.add((previousNumber + 1) + "->" + (currentVal - 1));
      }
      previousNumber = currentVal;
    }
    int upperLimit = upper + 1;
    if (Math.abs(upperLimit - arr[arr.length - 1]) != 0) {
      if (Math.abs(upperLimit - arr[arr.length - 1]) == 2) {
        missingRanges.add(String.valueOf(arr[arr.length - 1] + 1));
      } else if (Math.abs(upperLimit - arr[arr.length - 1]) > 2) {
        missingRanges.add((arr[arr.length - 1] + 1) + "->" + (upperLimit - 1));
      }
    }
    return missingRanges;
  }
}

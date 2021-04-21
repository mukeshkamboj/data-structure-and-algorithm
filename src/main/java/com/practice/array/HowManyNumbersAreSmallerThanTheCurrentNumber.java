package com.practice.array;

import java.util.stream.IntStream;

//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
public class HowManyNumbersAreSmallerThanTheCurrentNumber {

  public int[] findSmallerNumbersCount(int[] arr) {
    int[] count = new int[102]; // Element range is between the 0 to 100.
    int[] result = new int[arr.length];
    IntStream.range(0, arr.length).forEach(i -> count[arr[i] + 1]++); // how many time each element is appearing.
    IntStream.range(1, 102).forEach(i -> count[i] += count[i - 1]); // for each element in arr how many elements are shorter.
    IntStream.range(0, arr.length).forEach(i -> result[i] = count[arr[i]]); // putting the count of smaller number in the order as in arr.
    return result;
  }
}

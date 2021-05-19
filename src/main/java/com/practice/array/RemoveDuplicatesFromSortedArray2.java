package com.practice.array;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/submissions/
public class RemoveDuplicatesFromSortedArray2 {

  public int removeDuplicates(int[] arr) {

    int prev = arr[0] - 1;
    int count = 2;
    int dvi = 0;
    int ni = 0;
    while (dvi < arr.length) {
      if (count < 2 && prev == arr[dvi]) {
        arr[ni] = arr[dvi];
        count++;
        ni++;
      } else if (prev != arr[dvi]) {
        arr[ni] = arr[dvi];
        prev = arr[dvi];
        ni++;
        count = 1;
      }

      dvi++;
    }
    return ni;
  }
}

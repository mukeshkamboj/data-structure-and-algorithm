package com.practice.array;

import java.util.Arrays;

//https://leetcode.com/problems/decompress-run-length-encoded-list/
public class DecompressRunLengthEncodedList {

  public int[] decompress(int[] arr) {
    int decompressedListSize = 0;
    for (int i = 0; i < arr.length; i = i + 2) {
      decompressedListSize += arr[i];
    }
    int[] decompressedList = new int[decompressedListSize];
    int startIndex = 0;
    for (int i = 0; i < arr.length; i = i + 2){
      Arrays.fill(decompressedList, startIndex, startIndex + arr[i], arr[i+1]);
      startIndex += arr[i];
    }
    return decompressedList;
  }
}

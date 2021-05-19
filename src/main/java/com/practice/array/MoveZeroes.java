package com.practice.array;

public class MoveZeroes {

  public void moveZeroes(int[] arr) {
    int zp = 0;
    int nzp = 0;
    while (nzp < arr.length) {
      if (arr[nzp] != 0) {
        arr[zp] = arr[nzp];
        if (zp != nzp) {
          arr[nzp] = 0;
        }
        zp++;
      }
      nzp++;
    }
  }
}

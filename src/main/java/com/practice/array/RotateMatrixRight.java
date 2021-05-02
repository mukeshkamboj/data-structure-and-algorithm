package com.practice.array;

public class RotateMatrixRight {

  public void rotateRight(int[][] matrix) {
    int beg = 0;
    int end = matrix.length - 1;
    while (beg < end) {
      int[] begMatrix = matrix[beg];
      matrix[beg] = matrix[end];
      matrix[end] = begMatrix;
      beg++;
      end--;
    }
    for (int i = 0; i < matrix.length; i++) {
      for (int j = i + 1; j < matrix.length; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }
  }
}

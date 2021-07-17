package com.practice.array.binary_search.matrix;

// https://leetcode.com/problems/search-a-2d-matrix/
public class Search2DMatrix {

  public boolean numberExist(int[][] matrix, int num) {

    int start = 0;
    int end = matrix.length - 1;
    int rowLength = matrix[0].length - 1;
    int row = 0;

    while (start <= end) {
      row = (start + end) / 2;

      if (matrix[row][0] == num || matrix[row][rowLength] == num) {
        return true;
      } else if (matrix[row][0] < num && matrix[row][rowLength] > num) {
        break;
      } else if (matrix[row][0] < num) {
        start = row + 1;
      } else {
        end = row - 1;
      }
    }

    start = 0;
    end = rowLength;
    int mid;
    while (start <= end) {
      mid = (start + end) / 2;
      if (matrix[row][mid] == num) {
        return true;
      } else if (matrix[row][mid] > 0) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return false;
  }
}

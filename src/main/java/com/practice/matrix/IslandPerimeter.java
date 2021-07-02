package com.practice.matrix;

//https://leetcode.com/problems/island-perimeter/
public class IslandPerimeter {

  public int islandPerimeter(int[][] matrix) {
    int count = 0;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == 1) {
          count += 4;
          if (i > 0 && matrix[i - 1][j] == 1) {
            count -= 2;
          }
          if (j > 0 && matrix[i][j - 1] == 1) {
            count -= 2;
          }
        }
      }
    }
    return count;
  }
}

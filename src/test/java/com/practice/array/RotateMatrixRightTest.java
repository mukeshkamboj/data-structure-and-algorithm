package com.practice.array;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RotateMatrixRightTest {

  @DisplayName("GIVEN a non empty matrix of 3x3 WHEN rotateRight is invoked THEN it rotates the matrix to right")
  @Test
  public void testRotateRight() {
    //GIVEN
    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    //WHEN
    new RotateMatrixRight().rotateRight(matrix);
    //THEN
    MatcherAssert.assertThat(matrix, Is.is(new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}}));
  }

  @DisplayName("GIVEN an empty matrix WHEN rotateRight is invoked THEN it rotates the matrix to right")
  @Test
  public void testRotateRightWithEmptyMatrix() {
    //GIVEN
    int[][] matrix = {};
    //WHEN
    new RotateMatrixRight().rotateRight(matrix);
    //THEN
    MatcherAssert.assertThat(matrix, Is.is(new int[][]{}));
  }
}
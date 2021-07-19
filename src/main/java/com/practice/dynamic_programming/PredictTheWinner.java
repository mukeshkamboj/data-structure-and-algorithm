package com.practice.dynamic_programming;

import java.util.Arrays;

//https://leetcode.com/problems/predict-the-winner/
public class PredictTheWinner {

  public boolean predictTheWinner(int[] arr) {
    int[][] memo = buildMemo(arr.length);

    int scoreFirst = predictTheWinnerFrom(arr, 0, arr.length - 1, memo);

    int scoreTotal = getTotalScores(arr);

    return scoreFirst >= scoreTotal - scoreFirst;
  }

  private int predictTheWinnerFrom(int[] arr, int i, int j, int[][] memo) {
    if (i > j) {
      return 0;
    }

    if (i == j) {
      return arr[i];
    }

    if (memo[i][j] != -1) {
      return memo[i][j];
    }

    int curScore = Math.max(
        arr[i] + Math.min(
            predictTheWinnerFrom(arr, i + 2, j, memo),
            predictTheWinnerFrom(arr, i + 1, j - 1, memo)
        ),
        arr[j] + Math.min(
            predictTheWinnerFrom(arr, i, j - 2, memo),
            predictTheWinnerFrom(arr, i + 1, j - 1, memo)
        )
    );

    return memo[i][j] = curScore;
  }

  private int getTotalScores(int[] nums) {
    int scoreTotal = 0;
    for (int num : nums) {
      scoreTotal += num;
    }

    return scoreTotal;
  }

  private int[][] buildMemo(int n) {
    int[][] memo = new int[n][n];

    for (int[] memoRow : memo) {
      Arrays.fill(memoRow, -1);
    }
    return memo;
  }

}

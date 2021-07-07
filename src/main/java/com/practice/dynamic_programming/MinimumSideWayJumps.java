package com.practice.dynamic_programming;

//https://leetcode.com/problems/minimum-sideway-jumps/
public class MinimumSideWayJumps {

  public int minSideJumps(int[] obstacles) {
    return find(obstacles, 0, 2, new Integer[4][obstacles.length]);
  }

  private int find(int[] obstacles, int point, int lane, Integer[][] dp) {
    if (point == obstacles.length - 1) {
      return obstacles[point];
    }

    if (obstacles[point] == lane) {
      return Integer.MAX_VALUE;
    }

    if (dp[lane][point] != null) {
      return dp[lane][point];
    }

    if (obstacles[point + 1] == lane) {
      int l1 = lane + 1 == 4 ? 1 : lane + 1;
      int l2 = lane - 1 == 0 ? 3 : lane - 1;
      dp[lane][point] =
          1 + Math.min(find(obstacles, point, l1, dp), find(obstacles, point, l2, dp));
    } else {
      dp[lane][point] = find(obstacles, point + 1, lane, dp);
    }

    return dp[lane][point];
  }
}

package com.practice.recursion;

import static java.lang.Integer.MAX_VALUE;

public class FindMinimumAndMaximumStepsInMaze {

  boolean[][] visited;

  public int findMinSteps(int[][] maze) {
    visited = new boolean[maze.length][maze.length];
    return recMin(0, 0, maze.length - 1, maze.length - 1, 0, maze);
  }

  private int recMin(int sr, int sc, int dr, int dc, int steps, int[][] maze) {

    if (sr == dr && sc == dc) {
      return steps;
    }

    if (sr < 0 || sc < 0 || sr > dr || sc > dc || maze[sr][sc] == 1 || visited[sr][sc]) {
      return MAX_VALUE;
    }

    visited[sr][sc] = true;
    int s1 = recMin(sr + 1, sc, dr, dc, steps + 1, maze);
    int s2 = recMin(sr - 1, sc, dr, dc, steps + 1, maze);
    int s3 = recMin(sr, sc + 1, dr, dc, steps + 1, maze);
    int s4 = recMin(sr, sc - 1, dr, dc, steps + 1, maze);
    return Math.min(s1, Math.min(s2, Math.min(s3, s4)));
  }
}

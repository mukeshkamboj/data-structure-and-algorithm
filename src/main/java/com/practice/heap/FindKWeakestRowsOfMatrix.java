package com.practice.heap;

import java.util.PriorityQueue;

//https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/
public class FindKWeakestRowsOfMatrix {

  public int[] findWeakestRow(int[][] mat, int k) {
    int[] result = new int[k];

    PriorityQueue<int[]> pq = new PriorityQueue<>(
        (a1, a2) -> a1[1] == a2[1] ? a1[0] - a2[0] : a1[1] - a2[1]);

    for (int i = 0; i < mat.length; i++) {
      int s = 0;
      for (int j = 0; j < mat[i].length; j++) {
        if (mat[i][j] == 1) {
          s++;
        }
      }
      pq.add(new int[]{i, s});
    }
    int i = 0;
    while (pq.size() != 0) {
      int[] n = pq.poll();
      result[i] = n[0];
      i++;
      if (i == k) {
        break;
      }
    }

    return result;
  }
}

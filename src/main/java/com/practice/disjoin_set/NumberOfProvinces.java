package com.practice.disjoin_set;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

//https://leetcode.com/problems/number-of-provinces/
public class NumberOfProvinces {

  public int findCircleNum(int[][] isConnected) {
    int[] disjointSet = new int[isConnected.length];
    int[] size = new int[isConnected.length];

    for (int i = 0; i < isConnected.length; i++) {
      disjointSet[i] = i;
      size[i] = 1;
    }

    for (int i = 0; i < isConnected.length; i++) {
      for (int j = 0; j < isConnected.length; j++) {
        if (i == j) {
          continue;
        }
        if (isConnected[i][j] == 1) {
          merge(i, j, disjointSet, size);
        }
      }
    }
    return IntStream.range(0, disjointSet.length).boxed().map(i -> findRoot(i, disjointSet))
        .collect(
            Collectors.toSet()).size();
  }

  private static void merge(int i, int j, int[] disjointSet, int[] size) {
    int root1 = findRoot(i, disjointSet);
    int root2 = findRoot(j, disjointSet);
    if (root1 != root2) {
      if (size[root1] >= size[root2]) {
        disjointSet[root2] = root1;
        size[root1] += size[root2];
      } else {
        disjointSet[root1] = root2;
        size[root2] += size[root1];
      }
    }
  }

  private static int findRoot(int i, int[] disjointSet) {
    int itr = i;
    while (disjointSet[itr] != itr) {
      disjointSet[itr] = disjointSet[disjointSet[itr]];
      itr = disjointSet[itr];
    }
    return itr;
  }

}

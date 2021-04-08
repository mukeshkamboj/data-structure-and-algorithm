package com.practice.disjoin_set;

import java.util.stream.IntStream;

public class OwlFight {

  private final int[] disjointSet;

  public OwlFight(int owlCount, int[][] relationship) {
    disjointSet = new int[owlCount + 1];
    IntStream.range(0, owlCount + 1).forEach(i -> disjointSet[i] = i);
    for (int[] relation : relationship) {
      union(relation[0], relation[1]);
    }
  }

  private void union(int o1, int o2) {
    int rootO1 = findRoot(o1);
    int rootO2 = findRoot(o2);
    if (rootO1 > rootO2) {
      disjointSet[rootO2] = rootO1;
    } else {
      disjointSet[rootO1] = rootO2;
    }
  }

  private int findRoot(int owl) {
    int temp = owl;
    while (disjointSet[temp] != temp) {
      disjointSet[temp] = disjointSet[disjointSet[temp]];
      temp = disjointSet[temp];
    }
    return temp;
  }

  public String whoWins(int[] query) {
    int owl1 = query[0];
    int owl2 = query[1];
    int rootOwl1 = findRoot(owl1);
    int rootOwl2 = findRoot(owl2);
    return rootOwl1 == rootOwl2 ? "TIE"
        : rootOwl1 > rootOwl2 ? String.valueOf(owl1) : String.valueOf(owl2);
  }
}

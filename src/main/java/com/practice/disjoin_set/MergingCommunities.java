package com.practice.disjoin_set;

//https://www.hackerrank.com/challenges/merging-communities/problem
public class MergingCommunities {

  private int[] disjointSet;
  private int[] size;

  MergingCommunities(int nodeCount) {
    this.disjointSet = new int[nodeCount + 1];
    this.size = new int[nodeCount + 1];
    ;
    for (int i = 1; i <= nodeCount; i++) {
      this.disjointSet[i] = i;
      this.size[i] = 1;
    }
  }

  public int getSize(int nodeNumber) {
    return size[findRoot(nodeNumber)];
  }

  public void union(int val1, int val2) {
    int root1 = findRoot(val1);
    int root2 = findRoot(val2);

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

  private int findRoot(int val) {
    int i = val;
    while (disjointSet[i] != i) {
      disjointSet[i] = disjointSet[disjointSet[i]];
      i = disjointSet[i];
    }
    return i;
  }
}

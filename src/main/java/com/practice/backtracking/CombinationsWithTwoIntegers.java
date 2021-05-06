package com.practice.backtracking;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

//https://leetcode.com/problems/combinations/
public class CombinationsWithTwoIntegers {

  public List<List<Integer>> combine(int n, int k) {
    List<List<Integer>> result = new LinkedList<>();
    dfs(result, new Stack<>(), n, 1, k, k);
    return result;
  }

  private static void dfs(List<List<Integer>> result, Stack<Integer> path, int n, int start,
      int level, int k) {
    if (level == 0) {
      result.add(new LinkedList<>(path));
    } else {
      for (int i = start; i <= n; i++) {
        path.add(i);
        dfs(result, path, n, i + 1, level - 1, k);
        path.pop();
      }
    }
  }
}

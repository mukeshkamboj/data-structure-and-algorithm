package com.practice.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/subsets/
public class SubSets {

  public List<List<Integer>> subsets(int[] arr) {

    Arrays.sort(arr);
    List<List<Integer>> result = new ArrayList<>();
    dfs(arr, 0, result, new ArrayList<>());
    return result;
  }

  private static void dfs(int[] arr, int start, List<List<Integer>> result, List<Integer> path) {
    result.add(new ArrayList<>(path));
    for (int i = start; i < arr.length; i++) {
      path.add(arr[i]);
      dfs(arr, i + 1, result, path);
      path.remove(path.size() - 1);
    }
  }

}

package com.practice.backtracking;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

//https://leetcode.com/problems/combination-sum/
public class CombinationSum {

  public List<List<Integer>> combinationSum(int[] array, int target) {
    Arrays.sort(array);
    List<List<Integer>> result = new LinkedList<>();
    dfs(array, result, new Stack<>(), target, 0);
    return result;
  }

  private void dfs(int[] array, List<List<Integer>> result, Stack<Integer> path, int target,
      int start) {
    if (target > 0) {
      for (int i = start; i < array.length && target >= array[i]; i++) {
        path.add(array[i]);
        dfs(array, result, path, target - array[i], i);
        path.pop();
      }
    } else if (target == 0) {
      result.add(new LinkedList<>(path));
    }
  }
}
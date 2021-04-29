package com.practice.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

// https://leetcode.com/problems/merge-intervals/
public class MergeIntervals {

  public int[][] merge(int[][] intervals) {
    if (intervals.length == 1) {
      return intervals;
    }
    Arrays.sort(intervals, Comparator.comparingInt(in -> in[0]));
    List<int[]> result = new LinkedList<>();
    result.add(intervals[0]);
    int[] pre = intervals[0];
    for (int i = 1; i < intervals.length; i++) {
      int[] curr = intervals[i];
      if (curr[0] <= pre[1]) {
        pre[1] = Math.max(curr[1], pre[1]);
      } else {
        pre = curr;
        result.add(pre);
      }
    }
    return result.toArray(new int[result.size()][]);
  }
}

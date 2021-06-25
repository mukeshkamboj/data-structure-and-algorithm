package com.practice.heap;

import java.util.PriorityQueue;

//https://leetcode.com/problems/relative-ranks/
public class RelativeRanks {

  public String[] findRank(int[] score) {
    String[] result = new String[score.length];
    PriorityQueue<int[]> pq = new PriorityQueue<>((a1, a2) -> a2[1] - a1[1]);
    for (int i = 0; i < score.length; i++) {
      pq.add(new int[]{i, score[i]});
    }
    int i = 0;
    while (pq.size() != 0) {
      int[] n = pq.poll();
      if (i == 0) {
        result[n[0]] = "Gold Medal";
      } else if (i == 1) {
        result[n[0]] = "Silver Medal";
      } else if (i == 2) {
        result[n[0]] = "Bronze Medal";
      } else {
        result[n[0]] = (i + 1) + "";
      }
      i++;
    }
    return result;
  }
}

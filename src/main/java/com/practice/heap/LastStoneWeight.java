package com.practice.heap;

import java.util.PriorityQueue;
//https://leetcode.com/problems/last-stone-weight/
public class LastStoneWeight {

  public int findLastStoneWeight(int[] stones) {
    PriorityQueue<Integer> pq = new PriorityQueue<>((i, j) -> j - i);
    for (int i : stones) {
      pq.add(i);
    }
    while (pq.size() > 1) {
      pq.add((pq.poll() - pq.poll()));
    }
    return pq.poll();
  }
}

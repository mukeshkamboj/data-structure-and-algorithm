package com.practice.heap;

import java.util.PriorityQueue;

public class FindTopKElement {

  public int[] findTopKElement(int[] arr, int k) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for (int i = 0; i < arr.length; i++) {
      if (i < k) {
        pq.add(arr[i]);
      } else {
        if (arr[i] > pq.peek()) {
          pq.remove();
          pq.add(arr[i]);
        }
      }
    }

    int[] res = new int[k];
    for (int i = 0; i < k; i++) {
      res[i] = pq.poll();
    }
    return res;
  }
}

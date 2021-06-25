package com.practice.heap;

import java.util.PriorityQueue;

//https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
public class MaxProductOfTwoElementInArray {

  public int findMaxProduct(int[] arr) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for (int i = 0; i < arr.length; i++) {
      if (i < 2) {
        pq.add(arr[i]);
      } else {
        if (arr[i] > pq.peek()) {
          pq.remove();
          pq.add(arr[i]);
        }
      }
    }
    return (pq.poll() - 1) * (pq.poll() - 1);
  }
}

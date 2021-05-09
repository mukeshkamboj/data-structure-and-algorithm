package com.practice.array;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
//https://leetcode.com/problems/top-k-frequent-elements/
public class TopKFrequentElements {

  public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    for(int i=0; i < nums.length;  i++){
      map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
    }

    PriorityQueue<int[]> queue = new PriorityQueue<>((v1, v2) -> v1[1] - v2[1]);
    for(int i:map.keySet()) {
      queue.add(new int[]{i, map.get(i)});
      if(queue.size() > k){
        queue.poll();
      }
    }

    int[] result = new int[k];
    int temp = 0;
    while(temp < k) {
      int[] val = queue.poll();
      result[temp++] = val[0];
    }
    return result;
  }
}

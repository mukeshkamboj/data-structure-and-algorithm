package com.practice.com.practice.linked_list;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/pascals-triangle/
public class PascalTriangle {

  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> list = new ArrayList<>(numRows);
    List<Integer> pl = new ArrayList<>();
    for (int i = 0; i < numRows; i++) {
      List<Integer> l = new ArrayList<>();
      int pre = 0;
      for (int j = 0; j < i; j++) {
        l.add(pl.get(j) + pre);
        pre = pl.get(j);
      }
      l.add(1);
      list.add(l);
      pl = l;
    }
    return list;
  }
}

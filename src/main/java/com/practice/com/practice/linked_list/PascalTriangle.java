package com.practice.com.practice.linked_list;

import java.util.LinkedList;
import java.util.List;

// https://leetcode.com/problems/pascals-triangle/
public class PascalTriangle {

  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> list = new LinkedList<>();
    int counter = 1;

    while (counter <= numRows) {

      if (list.size() == 0) {
        List<Integer> row = new LinkedList<>();
        row.add(1);
        list.add(row);
      } else {

        int previous = 0;
        List<Integer> previousRow = list.get(list.size() - 1);
        List<Integer> row = new LinkedList<>();
        for (Integer integer : previousRow) {
          row.add(previous + integer);
          previous = integer;
        }
        row.add(1);
        list.add(row);
      }
      counter++;
    }

    return list;
  }
}

package com.practice.others;

import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class MapSorting {

  public static void main(String[] args) {
    Map<Integer, Integer> map = Map.of(1, 2, 2, 2, 3, 8, 4, 6);

    //Sorting by value and then key.
    SortedSet<int[]> set = new TreeSet<>(
        (a1, a2) -> a1[1] == a2[1] ? a1[0] - a2[0] : a2[1] - a1[1]);
    for (int k : map.keySet()) {
      set.add(new int[]{k, map.get(k)});
    }
    set.forEach(v -> System.out.println(v[0] + "  " + v[1]));
  }

}

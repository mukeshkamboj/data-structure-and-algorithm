package com.practice.test;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class TestUtil {

  public static List<String> convert(String[] arrays) {
    List<String> list = new LinkedList<>();
    Collections.addAll(list, arrays);
    return list;
  }

  public static List<List<Integer>> convert(int[][] arrays) {
    List<List<Integer>> lists = new LinkedList<>();
    for (int[] array : arrays) {
      List<Integer> list = new LinkedList<>();
      for (int i : array) {
        list.add(i);
      }
      lists.add(list);
    }
    return lists;
  }

  public static boolean areEqual(int[][] result, List<List<Integer>> allPathsSourceTarget) {

    for (int[] list : result) {
      List<List<Integer>> collect = allPathsSourceTarget.stream()
          .filter(val -> val.size() == list.length).collect(toList());
      Optional<List<Integer>> first = collect.stream().filter(l -> {
        Set<Integer> set1 = new HashSet<>(l);
        Set<Integer> set2 = new HashSet<>();
        Arrays.stream(list).forEach(set2::add);
        return set1.equals(set2);
      }).findFirst();

      if (first.isPresent()) {
        allPathsSourceTarget.remove(first.get());
      } else {
        return false;
      }
    }

    return allPathsSourceTarget.size() == 0;
  }
}

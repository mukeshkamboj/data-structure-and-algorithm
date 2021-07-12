package com.practice.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();
    for (String str : strs) {
      char[] chArr = str.toCharArray();
      Arrays.sort(chArr);
      String s = new String(chArr);
      List<String> list = map.getOrDefault(s, new LinkedList<>());
      list.add(str);
      map.put(s, list);
    }
    List<List<String>> result = new LinkedList<>();
    for (String key : map.keySet()) {
      result.add(map.get(key));
    }
    return result;
  }
}

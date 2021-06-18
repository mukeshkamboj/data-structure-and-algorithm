package com.practice.string;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/find-and-replace-pattern/
public class FindAndReplacePattern {

  public List<String> findAndReplacePattern(String[] w, String p) {
    List<String> list = new LinkedList<String>();

    if (p.length() == 1) {
      for (String s : w) {
        if (s.length() == 1) {
          list.add(s);
        }
      }
    } else {
      Map<Character, Integer> map = new HashMap<>();
      for (char ch : p.toCharArray()) {
        map.put(ch, map.getOrDefault(ch, 0) + 1);
      }
      for (String s : w) {
        if (s.length() == p.length()) {
          Map<Character, Integer> map1 = new HashMap<>();
          for (char ch : s.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
          }
          int si = 1;
          int pi = 1;
          char spc = s.charAt(0);
          char ppc = p.charAt(0);
          boolean meet = true;
          while (si < s.length()) {
            boolean ss = spc == s.charAt(si);
            boolean ps = ppc == p.charAt(pi);
            if (ss != ps || !map1.get(spc).equals(map.get(ppc))) {
              meet = false;
              break;
            }
            spc = s.charAt(si++);
            ppc = p.charAt(pi++);
          }
          if (meet) {
            list.add(s);
          }
        }
      }
    }
    return list;
  }
}

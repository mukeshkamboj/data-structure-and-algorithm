package com.practice.recursion;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

//https://leetcode.com/problems/word-break-ii/
public class WordBreakII {

  public List<String> wordBreak(String s, List<String> wordDict) {
    List<String> res = new LinkedList<>();
    Set<String> d = new HashSet<>(wordDict);
    find(res, s, d, "", 0);
    return res;
  }

  private void find(List<String> res, String str, Set<String> d, String sen, int in) {
    if (in == str.length()) {
      res.add(sen.substring(0, sen.length() - 1));
    } else if (in < str.length()) {
      String word = "";
      for (int i = in; i < str.length(); i++) {
        word += str.charAt(i);
        if (d.contains(word)) {
          find(res, str, d, sen + word + " ", i + 1);
        }
      }
    }
  }
}

package com.practice.recursion;

import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/letter-case-permutation/
public class LetterCasePermutation {

  public List<String> letterCasePermutation(String s) {
    List<String> res = new LinkedList<>();
    find(s, res, 0);
    return res;
  }

  private void find(String s, List<String> res, int i) {
    res.add(s);
    if (i < s.length()) {
      for (int j = i; j < s.length(); j++) {
        char ch = s.charAt(j);
        if (Character.isAlphabetic(ch)) {
          char nc =
              Character.isLowerCase(ch) ? Character.toUpperCase(ch) : Character.toLowerCase(ch);
          find(s.substring(0, j) + nc + s.substring(j + 1), res, j + 1);
        }
      }
    }
  }
}

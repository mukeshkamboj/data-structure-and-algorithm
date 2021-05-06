package com.practice.backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/letter-combinations-of-a-phone-number/
public class LetterCombinationOfAPhoneNumber {

  final static Map<Integer, String> map = new HashMap<>();

  static {
    map.put(2, "abc");
    map.put(3, "def");
    map.put(4, "ghi");
    map.put(5, "jkl");
    map.put(6, "mno");
    map.put(7, "pqrs");
    map.put(8, "tuv");
    map.put(9, "wxyz");
  }

  public List<String> letterCombinations(String digits) {
    List<String> result = new LinkedList<>();
    if (digits == null || digits.trim().length() == 0) {
      return result;
    }
    List<String> input = new ArrayList<>(digits.length());
    for (int i = 0; i < digits.length(); i++) {
      input.add(map.get(Integer.parseInt(digits.charAt(i) + "")));
    }
    dfs(input, "", result, 0);
    return result;
  }

  private static void dfs(List<String> input, String path, List<String> result, int stringIndex) {
    if (stringIndex == input.size()) {
      result.add(path);
      return;
    }
    String currentString = input.get(stringIndex);
    for (int i = 0; i < currentString.length(); i++) {
      path = path + currentString.charAt(i);
      dfs(input, path, result, stringIndex + 1);
      path = path.substring(0, path.length() - 1);
    }
  }
}

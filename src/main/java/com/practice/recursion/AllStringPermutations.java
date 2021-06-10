package com.practice.recursion;

import java.util.Set;
import java.util.TreeSet;

// https://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/
public class AllStringPermutations {

  public Set<String> getAllPermutations(String string) {
    Set<String> hashSet = new TreeSet<>();
    find(string, "", hashSet);
    return hashSet;
  }

  private void find(String string, String p, Set<String> set) {
    if (string.length() == 0) {
      set.add(p);
    }
    for (int i = 0; i < string.length(); i++) {
      char ch = string.charAt(i);
      String l = string.substring(0, i);
      String r = string.substring(i + 1);
      find(l + r, p + ch, set);
    }
  }
}

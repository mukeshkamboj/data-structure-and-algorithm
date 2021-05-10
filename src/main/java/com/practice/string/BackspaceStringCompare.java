package com.practice.string;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/backspace-string-compare/
public class BackspaceStringCompare {

  public boolean backspaceCompare(String s, String t) {
    List<Character> sString = new LinkedList<>();
    List<Character> tString = new LinkedList<>();
    int bs = 0;
    for (int i = s.length() - 1; i >= 0; i--) {
      char ch = s.charAt(i);
      if (ch == '#') {
        bs++;
        continue;
      }
      if (bs > 0) {
        bs--;
        continue;
      }
      sString.add(ch);
    }

    bs = 0;
    for (int i = t.length() - 1; i >= 0; i--) {
      char ch = t.charAt(i);
      if (ch == '#') {
        bs++;
        continue;
      }
      if (bs > 0) {
        bs--;
        continue;
      }
      tString.add(ch);
    }

    if (sString.size() != tString.size()) {
      return false;
    }

    Iterator<Character> sItr = sString.iterator();
    Iterator<Character> tItr = tString.iterator();
    while (sItr.hasNext()) {
      if (sItr.next() != tItr.next()) {
        return false;
      }
    }

    return true;
  }
}

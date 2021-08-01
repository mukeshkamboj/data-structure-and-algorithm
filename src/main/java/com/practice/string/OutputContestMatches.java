package com.practice.string;

import java.util.LinkedList;

//https://leetcode.com/problems/output-contest-matches/
public class OutputContestMatches {

  public String findContestMatch(int n) {
    LinkedList<String> list = new LinkedList<>();
    int start = 1, end = n;
    while (start < end) {
      list.add("(" + start + "," + end + ")");
      start++;
      end--;
    }

    while (list.size() != 1) {
      LinkedList<String> temp = new LinkedList<>();
      while (!list.isEmpty()) {
        String first = list.removeFirst();
        String second = list.removeLast();
        temp.add("(" + first + "," + second + ")");
      }
      list = temp;
    }
    return list.removeFirst();
  }
}

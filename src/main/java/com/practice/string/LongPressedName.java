package com.practice.string;

//https://leetcode.com/problems/long-pressed-name/
public class LongPressedName {

  public boolean isLongPressedName(String name, String typed) {
    int in = 0;
    int it = 0;
    while (in < name.length() && it < typed.length()) {
      int countN = 1;
      int countT = 1;
      char chN = name.charAt(in);
      while (in + 1 < name.length() && chN == name.charAt(in + 1)) {
        countN++;
        in++;
      }
      char chT = typed.charAt(it);

      if (chN != chT) {
        return false;
      }

      while (it + 1 < typed.length() && chT == typed.charAt(it + 1)) {
        countT++;
        it++;
      }

      if (countT < countN) {
        return false;
      }
      it++;
      in++;
    }

    return it == typed.length() && in == name.length();
  }
}
